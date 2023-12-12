package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ExemploController {

    @GetMapping("/hello")
    public boolean helloWorld(){
        //EXECUTARIA O CÓDIGO
        return true;
    }

    @GetMapping("/abacate")
    public ArrayList<String> abacate(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Oi");
        list.add("Olá");

        return list;
    }


}