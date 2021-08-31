package com.waldecleber.ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movimentacao {

    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
