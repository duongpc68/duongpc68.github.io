package com.example.finalproject.controller;

import com.example.finalproject.entity.RefreshToken;
import com.example.finalproject.entity.User;
import com.example.finalproject.exception.RefreshTokenNotFoundException;
import com.example.finalproject.model.request.LoginRequest;
import com.example.finalproject.model.request.RefreshTokenRequest;
import com.example.finalproject.model.request.RegistrationRequest;
import com.example.finalproject.model.response.JwtResponse;
import com.example.finalproject.repository.RefreshTokenRepository;
import com.example.finalproject.repository.UserJpaRepository;
import com.example.finalproject.repository.UserRepository;
import com.example.finalproject.security.CustomUserDetails;
import com.example.finalproject.security.JwtUtils;
import com.example.finalproject.service.EmailService;
import com.example.finalproject.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.validation.Valid;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/authentication")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {

    JwtUtils jwtUtils;

    UserService userService;

    UserJpaRepository userJpaRepository;

    UserRepository userRepository;

    RefreshTokenRepository refreshTokenRepository;

    AuthenticationManager authenticationManager;

    EmailService emailService;

    @PostMapping("/login")
    public JwtResponse authenticateUser(@Valid @RequestBody LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        Set<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toSet());

        String refreshToken = UUID.randomUUID().toString();
        RefreshToken refreshTokenEntity = RefreshToken.builder()
                .refreshToken(refreshToken)
                .user(userRepository.findById(userDetails.getId()).get())
                .build();
        refreshTokenRepository.save(refreshTokenEntity);

        return JwtResponse.builder()
                .jwt(jwt)
                .refreshToken(refreshToken)
                .id(userDetails.getId())
                .username(userDetails.getUsername())
                .roles(roles)
                .build();
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegistrationRequest request) throws MessagingException {
        User user = userJpaRepository.findByEmail(request.getEmail());
        if (!ObjectUtils.isEmpty(user)) {
            return new ResponseEntity<>("Username is existed", HttpStatus.BAD_REQUEST);
        } else {
            User newUser = userService.registerUser(request);
            emailService.verifyAccount(newUser.getId(), request.getFullName(), request.getEmail());
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        }
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<?> refreshToken(@RequestBody @Valid RefreshTokenRequest request) {
        try {
            return ResponseEntity.ok(userService.refreshToken(request));
        } catch (RefreshTokenNotFoundException | UsernameNotFoundException ex) {
            return new ResponseEntity<>("Thông tin refreshToken không chính xác", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        userService.logout();
        return ResponseEntity.ok(null);
    }

}
