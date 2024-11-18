package com.aplication.demofinancaapi.repository;

import com.aplication.demofinancaapi.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta,Long> {
}
