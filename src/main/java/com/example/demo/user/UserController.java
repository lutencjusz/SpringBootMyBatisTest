package com.example.demo.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable("name") String name) {
        return userMapper.getUser(name);
    }

    @GetMapping
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
