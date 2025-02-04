package com.example.niit.KUROBOTWebService.controller;

import com.example.niit.KUROBOTWebService.model.User;
import com.example.niit.KUROBOTWebService.service.RecipeService;
import com.example.niit.KUROBOTWebService.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kurobot/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.createUser(user);

        return ResponseEntity
                .created(null)
                .body("You have successfully created an account!");
    }

}
