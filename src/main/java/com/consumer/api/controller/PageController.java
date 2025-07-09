package com.consumer.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/endereco")
    public String enderecoPage() {
        return "endereco";
    }

    @GetMapping("/")
    public String indexPage() {
        return "endereco";
    }
}