package com.paypal.paypaldemo.repository;

import com.paypal.paypaldemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.login = ?1")
    User findUserBy(String login);
}
