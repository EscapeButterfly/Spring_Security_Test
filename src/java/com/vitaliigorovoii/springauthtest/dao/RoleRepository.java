package com.vitaliigorovoii.springauthtest.dao;

import com.vitaliigorovoii.springauthtest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}