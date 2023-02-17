package com.spring.construtorarzm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(length = 40, nullable = false)
    private String apelido;

    @Column(name = "data_nascimento", updatable = false)
    private String dataNasc;

    @Column(length = 25, nullable = false)
    private String telefone;

    @Column(length = 15, nullable = false)
    private String cpf;

    @Column(length = 30, nullable = false)
    private String especialidade;

    @Column(length = 150, nullable = false)
    private String cep;

    @Column(length = 150, nullable = false)
    private String logradouro;

    @Column(length = 150, nullable = false)
    private String uf;


}
