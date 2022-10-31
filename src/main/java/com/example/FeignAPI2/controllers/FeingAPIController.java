package com.example.FeignAPI2.controllers;

import com.example.FeignAPI2.model.UsuarioModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("feing")
@CrossOrigin(origins = "*", maxAge = 3600)
public class FeingAPIController {

    @GetMapping("lista")
    public List<String> listanatureza() {
        String[] anArray = new String[]{"Comum", "Eleitoral", "Réu Preso", "LIsta FEING"};
        return Arrays.asList(anArray);
    }

    @GetMapping("lista-usuario")
    public UsuarioModel getUsuario(){

        UsuarioModel user = new UsuarioModel();

        user.setInstagram("sss");
        user.setId(1L);
        user.setNome("SSS");

        return user;
    }

}
