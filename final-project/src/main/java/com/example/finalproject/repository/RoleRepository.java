package com.example.finalproject.repository;


import com.example.finalproject.entity.Role;
import com.example.finalproject.statics.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(Roles name);

}
