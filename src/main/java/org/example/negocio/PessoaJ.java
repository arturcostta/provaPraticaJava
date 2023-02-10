package org.example.negocio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class PessoaJ extends Pessoa{
    @Getter @Setter private List<Pessoa> listaSocios = new ArrayList<Pessoa>();

    public PessoaJ(String nome) {
        super.setNome(nome);
    }

}
