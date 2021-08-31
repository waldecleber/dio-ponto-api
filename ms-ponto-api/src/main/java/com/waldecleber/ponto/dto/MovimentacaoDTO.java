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
public class MovimentacaoDTO implements Serializable {

    private static final long serialVersionUID = -866300941149170846L;
    private Long id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private OcorrenciaDTO ocorrencia;
    private CalendarioDTO calendario;
}
