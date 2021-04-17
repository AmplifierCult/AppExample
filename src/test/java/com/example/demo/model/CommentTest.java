package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CommentTest {

    @Test
    void commentSimpleTest() throws IOException {
        User user = new User();
        user.setLogin("login");
        user.setFirstName("first name");
        user.setLastName("last name");

        Comment testInstance = new Comment();

        testInstance.setAuthor(user);
        System.out.println("Write a comment");
        testInstance.setContent(new BufferedReader(new InputStreamReader(System.in)).readLine());
        testInstance.getCreationDate();

        System.out.println(testInstance);
    }
}