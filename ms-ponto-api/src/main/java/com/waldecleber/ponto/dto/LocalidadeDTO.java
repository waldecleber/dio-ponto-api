package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LocalidadeDTO implements Serializable {

    private static final long serialVersionUID = -3681049451787161077L;
    private Long id;
    private String descricao;
    private NivelAcessoDTO nivelAcesso;
}
