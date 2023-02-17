package com.spring.construtorarzm.controller;

import com.spring.construtorarzm.entity.Obra;
import com.spring.construtorarzm.services.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/obra")
public class ObraController {
    @Autowired
    ObraService service;

    public void getObras(){
        service.getAllObras();
    }

    @PostMapping
    public void addObra(@Validated @RequestBody Obra obra){
        service.addObra(obra);
    }

    public void deleteObra(@PathVariable Long id){
        service.deleteObra(id);
    }


}
