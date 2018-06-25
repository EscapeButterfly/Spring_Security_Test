package com.vitaliigorovoii.springauthtest.service;

import com.vitaliigorovoii.springauthtest.model.Role;
import com.vitaliigorovoii.springauthtest.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link RoleService} interface.
 *
 * @author Vitalii Gorovoii
 */

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleByName(String roleName) {
        return roleRepository.findRoleByName(roleName);
    }
}
