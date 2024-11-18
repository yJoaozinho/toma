package com.aplication.demofinancaapi.web.dto.mapper;

import com.aplication.demofinancaapi.entity.Usuario;
import com.aplication.demofinancaapi.web.dto.UsuarioCreateDto;
import com.aplication.demofinancaapi.web.dto.UsuarioResponseDto;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static Usuario toUsuario(UsuarioCreateDto createDto){
        return new ModelMapper().map(createDto, Usuario.class);
    }

    public static UsuarioResponseDto toDto(Usuario usuario){
        return new ModelMapper().map(usuario, UsuarioResponseDto.class);
    }

    public static List<UsuarioResponseDto> toListDto(List<Usuario> usuarios){
        return usuarios.stream().map(user -> toDto(user)).collect(Collectors.toList());
    }
}
