package ex2;

import java.util.Scanner;

public class Colmeia {
    private String funcao;
    private int idade;
    private double producaoDia;

    public Colmeia(String funcao, int idade, double producaoDia) {
        this.funcao = funcao;
        this.idade = idade;
        this.producaoDia = producaoDia;
    }

    public double prodTotal() {
        return (producaoDia * (idade/356));
    }

    public void zumbir(){
        System.out.println("Zz    ZzZz");
        System.out.println(" zZ  zZ  zZ");
        System.out.println("  ZzZz    ZzZz");
    }

    public String setFuncao() {
        Scanner sc = new Scanner(System.in);
        this.funcao = sc.next();

        return(funcao);
    }
}
