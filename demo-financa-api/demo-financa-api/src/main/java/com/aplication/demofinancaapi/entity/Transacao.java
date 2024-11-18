package com.aplication.demofinancaapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "transacoes")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private Long id;
    @Column(name = "valor", nullable = false)
    private double valor;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "id_conta", nullable = false)
    private Long contaId;

}
