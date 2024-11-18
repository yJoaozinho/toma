package com.aplication.demofinancaapi.web.controller;

import com.aplication.demofinancaapi.entity.Conta;
import com.aplication.demofinancaapi.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/contas")
public class ContaController {
    @Autowired
    private ContaService contaService;

    @PostMapping
    public ResponseEntity<Conta> criarConta(@RequestBody Conta conta) {
        Conta novaConta = contaService.criarConta(conta);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conta> buscarConta(@PathVariable Long id) {
        Conta conta = contaService.buscarConta(id);
        return conta != null ? ResponseEntity.ok(conta) : ResponseEntity.notFound().build();
    }
}
