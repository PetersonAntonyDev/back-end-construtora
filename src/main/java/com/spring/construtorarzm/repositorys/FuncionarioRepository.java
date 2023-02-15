package com.spring.construtorarzm.repositorys;

import com.spring.construtorarzm.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
