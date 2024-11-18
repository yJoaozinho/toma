package com.aplication.demofinancaapi.service;

import com.aplication.demofinancaapi.entity.Usuario;
import com.aplication.demofinancaapi.execption.EmailUniqueViolationException;
import com.aplication.demofinancaapi.repository.UsuarioRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario create(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (org.springframework.dao.DataIntegrityViolationException ex){
            throw new EmailUniqueViolationException(String.format("Email ja cadastrado {%s}", usuario.getEmail()));
        }
    }

    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario com este id nao foi encontrado.")
        );
    }

    @Transactional
    public Usuario editUserame(Long id, String username) {
        Usuario user = findById(id);
        user.setUsername(username);
        return user;
    }

@Transactional(readOnly = true)
    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }
}
