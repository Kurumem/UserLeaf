package org.example.controller;

import org.example.model.User;
import org.example.model.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Set;



@Controller
public class UserController {
    private final UserList userList;

    public UserController(UserList userList) {
        this.userList = userList;
    }

    @GetMapping("/")
    public String get(Model model) {
        Set<User> users = userList.getUsers();

        model.addAttribute("users", users);
        model.addAttribute("user", new User());

        return "index";
    }
    @PostMapping("/")
    public String add(User user) {
        userList.add(user);
        return  "redirect:/";
    }
}
