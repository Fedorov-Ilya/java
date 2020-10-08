package com.example.Start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@RestController
public class EntityController {
    @Autowired
    Utils utils;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @PostMapping("/entity")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> create(@RequestBody(required = false) String body) throws Exception {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Key1", "value1");
        httpHeaders.add("Key1", "value1");

        Context context = new Context();
        String a = utils.getSubstring(body, "<Type>", "</Type>"); // использует метод utils и передает в него значения body,lb,rb
        context.setVariable("name", a); //изменяет в xml значение name на строку a
        String responseBody = springTemplateEngine.process("XML.xml", context); // отправляет все изменения обьекта context в файл XML.xml
        return new ResponseEntity<String>(responseBody, httpHeaders, HttpStatus.OK); //200 - OK ,404 - NOT-FOUND , возвращает статус,тело и заголовки запроса
    }
}
