package com.spring.construtorarzm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nomeProprietario;

    @Column(nullable = false)
    private String endereçoDaObra;
    @Column(nullable = false)
    private String dataInicio;
    @Column(nullable = false)
    private String previsaoTermino;

    @Column(nullable = false)
    private String telefoneProprietario;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String uf;
    @Column(nullable = false)
    private String engenheiro;
}
