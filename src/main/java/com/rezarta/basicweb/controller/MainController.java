package com.rezarta.basicweb.controller;

import com.rezarta.basicweb.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MainController {
    @GetMapping("/test")
    public String test() {
        return "Test Spring Boot! <b>Shuma e numrave 2 dhe 2.5 eshte:  " + sum(2, 2.5) + "</b>";
    }

    @GetMapping("/user/list")
    public String userList() {
        String content = "<ul>";

        for (User user : createUsers()) {
            content += "<li>" + user + "</li>";
        }
        content += "</ul>";


        return content;
    }

    private List<User> createUsers() {
        List users = new ArrayList<User>();

        users.add(new User("Resul", "Selmani", 19));
        users.add(new User("Rion", "Hasolli", 19));
        users.add(new User("Mirlinde", "Xhelili", 27));


        return users;
    }

    private double sum(double a, double b) {
        return a + b;
    }
}
