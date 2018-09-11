package com.example.demo.controller;

import com.example.demo.controller.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/9/7.
 */
@RestController
@RequestMapping("/welcome")
public class Welcome {

    @GetMapping(value = "/test")
    public String test(){
        return "I'm client";
    }

    @GetMapping (value = "/welcome/{message}")
    public String Welcome(@PathVariable String message){
        String msg = "welcome";
        if (message!=null){
            msg+=message;
        }
        return msg;
    }
    @GetMapping (value = "/getTest")
    public String getTest(@RequestParam String name,@RequestParam String age){
        return name + age;
    }
    @PostMapping(value = "/postTest")
    public User postTest(@RequestBody User user){
        user.setAge(28);
        return user;
    }
}
