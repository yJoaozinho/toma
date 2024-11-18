package com.aplication.demofinancaapi.service;

import com.aplication.demofinancaapi.entity.Conta;
import com.aplication.demofinancaapi.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta criarConta(Conta conta) {
        return contaRepository.save(conta);
    }

    public Conta buscarConta(Long id) {
        return contaRepository.findById(id).orElse(null);
    }
}
