/*
//package com.example.finalproject.config;
//
//import com.example.finalproject.entity.User;
//import com.example.finalproject.statics.Roles;
//import lombok.AllArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.util.ObjectUtils;
//
//import javax.management.relation.Role;
//import java.util.HashSet;
//import java.util.Optional;
//import java.util.Set;
//
//@Component
//@AllArgsConstructor
//public class DatabaseInitializer implements CommandLineRunner {
//
//    private final UserJpaRepository userJpaRepository;
//
//    private final RoleJpaRepository roleJpaRepository;
//
//    private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Optional<Role> userRoleOptional = roleJpaRepository.findByName(Roles.USER);
//        if (userRoleOptional.isEmpty()) {
//            Role userRole = Role.builder().name(Roles.USER).build();
//            roleJpaRepository.save(userRole);
//
//            User quyen = userJpaRepository.findByEmail("maiquyen2403@gmail.com");
//            if (ObjectUtils.isEmpty(duong)) {
//                User user2 = new User();
//                user2.setEmail("duongpcd@gmail.com");
//                user2.setFullName("Phạm Cao Dương");
//                user2.setPassword(passwordEncoder.encode("duong")); // Encrypt the password
//                Set<Role> roles2 = new HashSet<>();
//                roles2.add(userRole);
//                user2.setRoles(roles2);
//                userJpaRepository.save(user2);
//            }
//        }
//        Optional<Role> adminRoleOptional = roleJpaRepository.findByName(Roles.ADMIN);
//        if (adminRoleOptional.isEmpty()) {
//            Role adminRole = Role.builder().name(Roles.ADMIN).build();
//            roleJpaRepository.save(adminRole);
//
//            User admin = userJpaRepository.findByEmail("admin@gmail.com");
//            if (ObjectUtils.isEmpty(admin)) {
//                User user1 = new User();
//                user1.setEmail("admin@gmail.com");
//                user1.setFullName("admin");
//                user1.setPassword(passwordEncoder.encode("admin")); // Encrypt the password
//                Set<Role> roles1 = new HashSet<>();
//                roles1.add(adminRole);
//                user1.setRoles(roles1);
//                userJpaRepository.save(user1);
//            }
//        }
//
//
//    }
//
//
//
//}
*/
