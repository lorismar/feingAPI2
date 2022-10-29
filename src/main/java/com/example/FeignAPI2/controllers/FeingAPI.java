package com.example.FeignAPI2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("feing")
@CrossOrigin(origins = "*", maxAge = 3600)
public class FeingAPI {

    @GetMapping("lista")
    public List<String> listanatureza() {
        String[] anArray = new String[]{"Comum", "Eleitoral", "Réu Preso", "LIsta FEING"};
        return Arrays.asList(anArray);
    }
}
