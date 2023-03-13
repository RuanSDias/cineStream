package br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Filme {

    @GetMapping("/api/filmes")
    public Filme show(){
        return new Filme();
    }
    
}
