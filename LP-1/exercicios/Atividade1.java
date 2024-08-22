package org.example;

public class Atividade1 {
    int ano, mes, dia;

    public Atividade1(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int converterDias(){
       return ((ano * 365)+(mes * 30)+dia);
    }
    
    public static void main(String[] args) {

        Atividade1 pessoa = new Atividade1(10,2,3);
        System.out.println(pessoa.converterDias());

    }
}