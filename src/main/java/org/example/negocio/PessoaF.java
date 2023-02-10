package org.example.negocio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaF extends Pessoa {

    public PessoaF(String nome) {
        super.setId(new Random().nextInt());
        super.setNome(nome);
    }

    @Getter @Setter private List<Imovel> listaBens = new ArrayList<Imovel>();


    public double getTotalBens(){
        double valorTotal = this.listaBens.stream().mapToDouble(imovel -> imovel.getValor()).sum();
        return valorTotal;
    }

    public String toString() {
        return "Nome: "+super.getNome();
    }
}
