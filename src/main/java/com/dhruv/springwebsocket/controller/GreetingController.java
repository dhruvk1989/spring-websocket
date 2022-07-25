package com.dhruv.springwebsocket.controller;

import com.dhruv.springwebsocket.model.Greeting;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping
    @SendTo("/topic/greetings")
    public Greeting greet(String message){
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message));
    }

}
