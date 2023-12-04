package com.example.servingwebcontent.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Cocah:" + coachName + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello world"

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }



}
