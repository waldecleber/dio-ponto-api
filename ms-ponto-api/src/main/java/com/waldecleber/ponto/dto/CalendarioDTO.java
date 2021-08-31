package com.waldecleber.ponto.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CalendarioDTO implements Serializable {

    private static final long serialVersionUID = -6620735145716770006L;
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;
    private TipoDataDTO tipoData;
}
