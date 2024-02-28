package com.example.finalproject.controller;

import com.example.finalproject.exception.ExistedUserException;
import com.example.finalproject.model.request.CreateUserRequest;
import com.example.finalproject.model.request.UserSearchRequest;
import com.example.finalproject.model.response.CommonResponse;
import com.example.finalproject.model.response.UserResponse;
import com.example.finalproject.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService userService;

//    @GetMapping
//    public List<UserResponse> getAll() {
//        return userService.getAll();
//    }

    @GetMapping("/{id}")
    public UserResponse getDetail(@PathVariable Long id) throws ClassNotFoundException {
        return userService.getDetail(id);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid CreateUserRequest request) {
        try {
            userService.createUser(request);
            return ResponseEntity.ok(null);
        } catch (ExistedUserException ex) {
            return new ResponseEntity<>("email đã tồn tại", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public CommonResponse<?> search(UserSearchRequest request) {
        return userService.searchUser(request);
    }

    @GetMapping("/v2")
    public ModelAndView search1(UserSearchRequest request) {
        ModelAndView modelAndView  = new ModelAndView("/users");
        modelAndView.addObject("userData", userService.searchUser(request));
        return modelAndView;
    }

}
