package br.com.fiap.cs2_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class SkinsController {

        @GetMapping("skins")
        public String purosangue() {
            return "Minhas de Skins CS2 --> Karambit - Safari Mesh & Moto-Gloves | Smoke-Out";
        }
}