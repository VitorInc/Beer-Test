package br.com.beer.beer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController implements BeerControllercDocs{

    @GetMapping
    public String helloAPI() {
        return "Hello API!!";
    }
}