package com.aplication.demofinancaapi.web.controller;

import com.aplication.demofinancaapi.entity.Usuario;
import com.aplication.demofinancaapi.service.UsuarioService;
import com.aplication.demofinancaapi.web.dto.UsuarioCreateDto;
import com.aplication.demofinancaapi.web.dto.UsuarioResponseDto;
import com.aplication.demofinancaapi.web.dto.mapper.UsuarioMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioResponseDto> create(@Valid @RequestBody UsuarioCreateDto createDto){
        Usuario user = usuarioService.create(UsuarioMapper.toUsuario(createDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioMapper.toDto(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDto> getById(@PathVariable Long id){
        Usuario user = usuarioService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(UsuarioMapper.toDto(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UsuarioResponseDto> updateNome(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario user = usuarioService.editUserame(id, usuario.getUsername());
        return ResponseEntity.ok(UsuarioMapper.toDto(user));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDto>> getAll(){
        List<Usuario> users = usuarioService.buscarTodos();
        return ResponseEntity.ok(UsuarioMapper.toListDto(users));
    }
}
