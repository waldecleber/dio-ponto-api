package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TipoDataDTO implements Serializable {

    private static final long serialVersionUID = -7438121931665522123L;
    private Long id;
    private String descricao;
}
