package com.example.FeignAPI2.controllers;


import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "agnom")
@NoArgsConstructor
public class OrdemMissaoModel implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @SequenceGenerator(name = "sequenceGenerator")
    @Getter
    @Setter
    private Long Id;

    @Getter
    @Setter
    @Column(name = "sistema_origem")
    private String sistemaOrigem;


    @Getter
    @Setter
    @Column(name = "referencia")
    private String referencia;

    @Getter
    @Setter
    @Column(name = "numero_procedimento_id")
    private String numeroProcedimentoId;

    @Getter
    @Setter
    @Column(name = "tipo_ordem")
    private String tipoOrdem;

    @Getter
    @Setter
    @Column(name="numero_procedimento")
    private String numeroProcedimento;

    @Getter
    @Setter
    @Column(name = "prazo")
    private Integer prazo;

    @Getter
    @Setter
    @Column(name = "forca_militar")
    private boolean forcaMilitar;


    @Getter
    @Setter
    @Column(name = "sigiloso")
    private boolean sigiloso;

    @Getter
    @Setter
    @Column(name = "promotoria")
    private Long promotoria;

    @Getter
    @Setter
    @Column(name = "matricula_promotor")
    private String matriculaPromotor;

    @Getter
    @Setter
    @Column(name = "matricula_usuario")
    private String matriculaUsuario;

    @Getter
    @Setter
    @Column(name = "matricula_oficial")
    private String matriculaOficial;

    @Getter
    @Setter
    @Column(name = "natureza_ordem")
    private String naturezaOrdem;

    @Getter
    @Setter
    @Column(name = "cidade_comarca")
    private String cidadeComarca;

    public boolean isForcaMilitar() {
        return forcaMilitar;
    }

    public boolean isSigiloso() {
        return sigiloso;
    }

}

