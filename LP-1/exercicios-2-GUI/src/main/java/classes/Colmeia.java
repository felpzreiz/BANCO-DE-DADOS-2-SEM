package classes;

import java.util.Scanner;

public class Colmeia {
    private String funcao;
    private int idade;
    private double producaoDia;

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setProducaoDia(double producaoDia) {
        this.producaoDia = producaoDia;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getIdade() {
        return idade;
    }

    public double getProducaoDia() {
        return producaoDia;
    }

    public double prodTotal() {
        return (producaoDia * (idade*356));
    }

    public String zumbir(){
        return("ZzZzZzZzZzZz");
    }
}
