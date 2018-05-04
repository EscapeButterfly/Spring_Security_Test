package com.vitaliigorovoii.springauthtest.service;

/**
 * Service for security
 *
 * @author Vitalii Gorovoii
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
