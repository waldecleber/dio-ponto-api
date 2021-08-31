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
public class Empresa {

    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
