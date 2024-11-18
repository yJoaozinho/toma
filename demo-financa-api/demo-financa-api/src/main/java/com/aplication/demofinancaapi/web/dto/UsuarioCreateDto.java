package com.aplication.demofinancaapi.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @AllArgsConstructor @NoArgsConstructor @Setter @ToString
public class UsuarioCreateDto {

    @NotBlank
    @Size(min = 4, max = 16, message = "Deve conter 4 a 16 caracteres")
    private String username;
    @NotBlank
    @Size(min = 8, max = 24, message = "Deve conter 8 a 24 caracteres")
    private String password;
    @Email(message = "Formato do email inválido", regexp = "(?i)^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")
    @NotBlank
    private String email;
}
