package com.aplication.demofinancaapi.web.controller;

import com.aplication.demofinancaapi.entity.Transacao;
import com.aplication.demofinancaapi.service.TransacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<Transacao> registrarTransacao(@RequestBody Transacao transacao) {
        Transacao novaTransacao = transacaoService.registrarTransacao(transacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaTransacao);
    }

    @GetMapping("/conta/{contaId}")
    public ResponseEntity<List<Transacao>> listarTransacoes(@PathVariable Long contaId) {
        List<Transacao> transacoes = transacaoService.listarTransacoes(contaId);
        return ResponseEntity.ok(transacoes);
    }

}
