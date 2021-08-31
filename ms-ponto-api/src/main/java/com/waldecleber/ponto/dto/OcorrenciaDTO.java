package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OcorrenciaDTO implements Serializable {

    private static final long serialVersionUID = 3115199014569164878L;
    private Long id;
    private String nome;
    private String descricao;
}
