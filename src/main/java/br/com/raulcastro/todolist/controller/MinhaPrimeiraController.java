package br.com.raulcastro.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")

public class MinhaPrimeiraController {
    /**
     * GET
     * POST
     * PUT
     * DELETE
     * PATCH
     *
     */
    @GetMapping("/")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
