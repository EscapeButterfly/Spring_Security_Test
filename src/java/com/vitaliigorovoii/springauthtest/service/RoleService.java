package com.vitaliigorovoii.springauthtest.service;

import com.vitaliigorovoii.springauthtest.model.Role;

import java.util.List;

/**
 * Service class for {@link Role}.
 *
 * @author Vitalii Gorovoii
 */
public interface RoleService {
    List<Role> findAllRoles();
    Role findRoleByName(String roleName);
}
