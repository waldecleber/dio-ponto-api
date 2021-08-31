package com.waldecleber.ponto.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Localidade {

    @Id
    private Long id;
    private String descricao;
    @ManyToOne
    private NivelAcesso nivelAcesso;
}
