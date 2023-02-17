package com.spring.construtorarzm.services;

import com.spring.construtorarzm.entity.Funcionario;
import com.spring.construtorarzm.repositorys.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    FuncionarioRepository repository;


    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }

    public Funcionario getFuncionarioById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Funcionario addFuncionario(Funcionario funcionario){
        return repository.save(funcionario);
    }

    public Funcionario addFuncionarioById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void deleteFuncionario(Long id){
        repository.delete(repository.findById(id).orElseThrow());
    }

    public Funcionario alterarFuncionario(Funcionario funcionario, Long id){
        repository.save(repository.findById(id).map(funcionarioBd ->{
            funcionarioBd.setNome(funcionario.getNome());
            funcionarioBd.setApelido(funcionario.getApelido());
            funcionarioBd.setDataNasc(funcionario.getDataNasc());
            funcionarioBd.setTelefone(funcionario.getTelefone());
            funcionarioBd.setCpf(funcionario.getCpf());
            funcionarioBd.setEspecialidade(funcionario.getEspecialidade());
            funcionarioBd.setUrlAvatar(funcionario.getUrlAvatar());
            funcionarioBd.setUrlAvatar(funcionario.getCep());
            funcionarioBd.setUrlAvatar(funcionario.getLogradouro());
            funcionarioBd.setUrlAvatar(funcionario.getUf());
            return funcionarioBd;
        }).orElseThrow());
        return funcionario;
    }
}
