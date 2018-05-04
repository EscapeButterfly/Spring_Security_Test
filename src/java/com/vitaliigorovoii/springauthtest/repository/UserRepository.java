package com.vitaliigorovoii.springauthtest.repository;

import com.vitaliigorovoii.springauthtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}