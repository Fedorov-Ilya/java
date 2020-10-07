package com.example.Start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostmanController {
    @Autowired
    Utils utils;

    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody(required = false) String body) throws Exception {
        System.out.println(utils.getSubstring(body,"<Type>","</Type>"));
        return body;
    }
}
