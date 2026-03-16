package br.com.fiap.cs2_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class GameModesController {

    @GetMapping("gamemodes")
    public String gamemodes() {
        return "Selecione um modo de jogo!";
    }

    @GetMapping("gamemodes/competitive")
    public String gamemodescompetitive() {
        return "Modo de jogo competitivo selecionado!";
    }
}
