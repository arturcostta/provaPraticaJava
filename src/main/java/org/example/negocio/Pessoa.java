package org.example.negocio;

import lombok.Getter;
import lombok.Setter;

public abstract class Pessoa {
    @Getter @Setter private int id;
    @Getter @Setter private String nome;

}
