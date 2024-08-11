package com.example.demo;

import com.example.demo.user.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprintBootTestApplicationTests {

    @Autowired
    private UserController userController;

}
