package com.aplication.demofinancaapi.repository;

import com.aplication.demofinancaapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
