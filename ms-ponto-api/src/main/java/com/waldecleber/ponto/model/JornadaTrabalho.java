package com.waldecleber.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JornadaTrabalho {

    @Id
    private Long id;
    private String descricao;
}
