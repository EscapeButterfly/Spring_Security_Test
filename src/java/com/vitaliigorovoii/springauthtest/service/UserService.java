package com.vitaliigorovoii.springauthtest.service;

import com.vitaliigorovoii.springauthtest.model.User;

/**
 * Service class for {@link User}.
 *
 * @author Vitalii Gorovoii
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
