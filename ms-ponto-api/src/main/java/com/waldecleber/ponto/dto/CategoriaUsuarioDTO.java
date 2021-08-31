package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaUsuarioDTO implements Serializable {

    private static final long serialVersionUID = 7983238873253402297L;
    private Long id;
    private String descricao;
}
