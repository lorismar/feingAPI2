package com.example.FeignAPI2.controllers;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;


@JsonPropertyOrder({ "prazo", "forcaMilitar" })
public class OrdemMissaoinput {

    @NotNull
    private Integer prazo;

    @NotNull
    private boolean forcaMilitar;

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public boolean isForcaMilitar() {
        return forcaMilitar;
    }

}



