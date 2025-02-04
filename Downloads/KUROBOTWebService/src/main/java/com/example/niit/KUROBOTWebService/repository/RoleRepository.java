package com.example.niit.KUROBOTWebService.repository;

import com.example.niit.KUROBOTWebService.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRoleName(String roleName);
}
