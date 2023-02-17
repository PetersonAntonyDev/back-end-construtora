package com.spring.construtorarzm.services;

import com.spring.construtorarzm.entity.Obra;
import com.spring.construtorarzm.repositorys.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraService {
    @Autowired
    ObraRepository repository;
    public List<Obra> getAllObras(){
        return repository.findAll();
    }

    public Obra addObra(Obra obra){
        return repository.save(obra);
    }

    public void deleteObra(Long id){
        repository.delete(repository.findById(id).orElseThrow());
    }
}
