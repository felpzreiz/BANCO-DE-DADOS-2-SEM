package classes;

import java.util.Scanner;

public class Missa {
    private String nome;
    private int idade;
    private String santo;
    private double dizimo;

    public void setSanto(String santo) {
        this.santo = santo;
    }

    public String orar(){
        return(santo + ", rogai por nós. Amém");
    }

    public void entregarDizimo(double valor){
        this.dizimo = this.dizimo + valor;
    }

}
