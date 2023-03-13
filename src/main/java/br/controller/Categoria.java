package br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Categoria {

@GetMapping("/api/categorias")
public Categoria show(){
    return new Categoria();
}
    
}
