package com.mctak.springjwtauth.repository;

import java.util.Optional;

import com.mctak.springjwtauth.models.ERole;
import com.mctak.springjwtauth.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
