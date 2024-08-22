package org.example;

public class Atividade4 {
    double preco, dist, taxas;

    public double calcular(){
        double precoFinal = preco + (preco*dist) + (preco*taxas);
        return(precoFinal);
    }

    public static void main(String[] args) {
        Atividade4 carro = new Atividade4();
        carro.preco = 50000;
        carro.dist = 0.48;
        carro.taxas = 0.28;

        System.out.println("Preço final: R$ " + carro.calcular());
    }
}
