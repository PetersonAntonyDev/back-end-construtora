package com.spring.construtorarzm.controller;

import com.spring.construtorarzm.entity.Funcionario;
import com.spring.construtorarzm.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService service;

    @GetMapping()
    public List<Funcionario> getAllFuncionario(){

        return (List<Funcionario>) service.getFuncionarios();
    }

    @GetMapping("/{id}")
    public Funcionario getFuncionarioById(@PathVariable Long id){
        return service.getFuncionarioById(id);
    }

    @PostMapping
    public Funcionario addFuncionario(@Validated @RequestBody Funcionario funcionario){
        return service.addFuncionario(funcionario);
    }

    @PutMapping("/{id}")
    public Funcionario alterarFuncionarioById(@PathVariable Long id, @Validated @RequestBody Funcionario funcionario){
        return service.alterarFuncionario(funcionario, id);
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable Long id){
        service.deleteFuncionario(id);
    }

}
