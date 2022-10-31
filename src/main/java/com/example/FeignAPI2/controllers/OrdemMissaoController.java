package com.example.FeignAPI2.controllers;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/feing", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrdemMissaoController  {

    public OrdemMissaoController() {
    }

    @PostMapping("/salvar_ordem_missao_feing_2")
    public OrdemMissaoModel salvar_ordem_missao_2(@RequestPart OrdemMissaoinput omInput) {

        OrdemMissaoModel om = new OrdemMissaoModel();

        om.setPrazo(omInput.getPrazo());
        om.setForcaMilitar(omInput.isForcaMilitar());

        return om;
    }

    @PostMapping("/salvar_ordem_missao_feing_api")
    public OrdemMissaoinput salvar_ordem_missao_feing_api(@RequestPart OrdemMissaoinput omInput) {

        OrdemMissaoModel om = new OrdemMissaoModel();

//        om.setPrazo(omInput.getPrazo());
//        om.setForcaMilitar(omInput.isForcaMilitar());

        return omInput;
    }


}

