package com.example.niit.KUROBOTWebService.repository;

import com.example.niit.KUROBOTWebService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
