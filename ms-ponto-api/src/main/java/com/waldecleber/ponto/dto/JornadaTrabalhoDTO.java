package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class JornadaTrabalhoDTO implements Serializable {

    private static final long serialVersionUID = 3907752568944969803L;
    private Long id;
    private String descricao;
}
