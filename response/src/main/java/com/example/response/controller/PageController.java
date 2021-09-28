package com.example.response.controller;

import com.example.response.controller.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntity
    //page controller 에서는 안내리는게 보통이다
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("임한길");
        user.setAddress("asdf");
        return user;
    }
}
