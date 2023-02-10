package org.example.negocio;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Random;

public class Imovel {
    @Getter @Setter private int id;
    @Getter @Setter private String descricao;
    @Getter @Setter private Double valor;

    public Imovel(String descricao, Double valor) {
        this.id = new Random().nextInt();
        this.descricao = descricao;
        this.valor = valor;
    }

}
