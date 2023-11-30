package training.springboot.controller;

import training.springboot.model.dto.UserDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")

public class UserController {

    @PostMapping
    public String printUser(@RequestBody UserDto loginForm) {
        System.out.println(loginForm.getName() + loginForm.getSurname());
        return "";

    }
}
