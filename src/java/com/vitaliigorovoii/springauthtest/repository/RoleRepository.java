package com.vitaliigorovoii.springauthtest.repository;

import com.vitaliigorovoii.springauthtest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName(String roleName);
}