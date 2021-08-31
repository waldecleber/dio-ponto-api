package com.waldecleber.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Calendario {

    @Id
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;
    @ManyToOne
    private TipoData tipoData;
}
