package org.example;

import org.example.negocio.Imovel;
import org.example.negocio.Pessoa;
import org.example.negocio.PessoaF;
import org.example.negocio.PessoaJ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        PessoaF pf1 = new PessoaF("PessoaFisica1");
        PessoaF pf2 = new PessoaF("PessoaFisica2");
        PessoaF pf4 = new PessoaF("PessoaFisica4");
        PessoaF pf5 = new PessoaF("PessoaFisica5");

        PessoaJ empresaD = new PessoaJ("empresaD");
        empresaD.getListaSocios().add(pf4);
        empresaD.getListaSocios().add(pf5);

        PessoaJ empresaA = new PessoaJ("empresaA");

        empresaA.getListaSocios().add(pf1);
        empresaA.getListaSocios().add(pf2);
        empresaA.getListaSocios().add(empresaD);


        System.out.println(getEstruturaSocietaria(empresaA));


    }

    //esse metodo retornaria uma lista de socios
    //de posse da lista de socios seria feito uma iteracao entre todos os bens de cada um somando os valores
    public static List<PessoaF> getEstruturaSocietaria(PessoaJ empresa){
        List<PessoaF> listaSocietaria = new ArrayList<PessoaF>();
        for (Pessoa socio:empresa.getListaSocios()) {
            if(socio instanceof PessoaJ){
                PessoaJ socioT = (PessoaJ)socio;
                listaSocietaria.add(getSocioF(socioT));
            }else{
                //validar antes se a pessoa fisica ja existe na lista
                listaSocietaria.add((PessoaF)socio);
            }
        }
        return listaSocietaria;
    }

    public static PessoaF getSocioF(PessoaJ empresa){
        for (Pessoa socio:empresa.getListaSocios()){
            if(socio instanceof PessoaF){
                return (PessoaF)socio;
            }else{
                getSocioF((PessoaJ)socio);
            }
        }
        return null;
    }
}