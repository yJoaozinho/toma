package com.aplication.demofinancaapi.service;

import com.aplication.demofinancaapi.entity.Transacao;
import com.aplication.demofinancaapi.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public Transacao registrarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public List<Transacao> listarTransacoes(Long contaId) {
        return transacaoRepository.findByContaId(contaId).orElse(null);;
    }
}
