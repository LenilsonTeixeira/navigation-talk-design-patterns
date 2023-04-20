package com.lteixeira.externalapi.api.score;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("score")
public class ScoreController {

    @GetMapping("/{cpf}")
    public ScoreResponse getScore(@PathVariable("cpf") String cpf) {
        Integer scoreCalculado = new Random().nextInt(1000);
        return new ScoreResponse(cpf, scoreCalculado);
    }
}
