package com.lathief.demo.controller;

import com.lathief.demo.entity.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @GetMapping("/message")
    Message send(){
        return new Message("Hello!!");
    }

    @PostMapping("/message")
    Message echo(@RequestBody Message msg){
        return msg;
    }
}
