package com.example.Start;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@RestController
public class PostmanController {

    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody(required = false) String body) throws Exception {
        String changeBody = body;
        System.out.println(changeBody);
        Pattern pattern = Pattern.compile("(?<=(<Type>))(.*)(?=(</Type>))");
        Matcher matcher = pattern.matcher(changeBody);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
        } else {
            System.out.println("TEXT NOT FOUND");
        }

        return body;
    }
}
