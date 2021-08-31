package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class NivelAcessoDTO implements Serializable {

    private static final long serialVersionUID = 7379224492701260880L;
    private Long id;
    private String descricao;
}
