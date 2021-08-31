package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = -5202149080630815436L;
    private Long id;
    private String nome;
    private CategoriaUsuarioDTO categoriaUsuario;
    private EmpresaDTO empresa;
    private NivelAcessoDTO nivelAcesso;
    private JornadaTrabalhoDTO jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime terminoJornada;
}
