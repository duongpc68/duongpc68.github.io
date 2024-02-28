package com.example.finalproject.repository;



 import com.example.finalproject.entity.User;
 import org.springframework.data.jpa.repository.JpaRepository;

 import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}