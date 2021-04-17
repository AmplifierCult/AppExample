package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static int idCounter = 0;

    private static final List<User> staticUsers = List.of(
            generateUser("user1"),
            generateUser("user2"),
            generateUser("user3")
    );

    private static User generateUser(String login) {
        User result = new User();
        result.setId(idCounter++);
        result.setLogin(login);
        return result;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return staticUsers;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "unknown") String helloName) {
        return String.format("Hello, %s", helloName);
    }

}
