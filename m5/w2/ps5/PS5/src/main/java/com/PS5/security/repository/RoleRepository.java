package com.PS5.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS5.security.entity.ERole;
import com.PS5.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
