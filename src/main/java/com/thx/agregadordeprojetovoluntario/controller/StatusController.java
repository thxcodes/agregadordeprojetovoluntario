package com.thx.agregadordeprojetovoluntario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StatusController
 */

 @RestController
public class StatusController {

    @GetMapping(path = "/api/status")
    public String check(){
        return "online";
    }
    
}