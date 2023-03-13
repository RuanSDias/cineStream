package br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usuario {

    @GetMapping("/api/usuario")
    public Usuario show(){
        return new Usuario();
    }
    
}
