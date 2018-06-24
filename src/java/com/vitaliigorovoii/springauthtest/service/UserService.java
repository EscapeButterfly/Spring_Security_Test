package com.vitaliigorovoii.springauthtest.service;

import com.vitaliigorovoii.springauthtest.model.User;

import java.util.List;

/**
 * Service class for {@link User}.
 *
 * @author Vitalii Gorovoii
 */
public interface UserService {
    List<User> findAllUsers();

    void save(User user);

    User findByUsername(String username);
}
