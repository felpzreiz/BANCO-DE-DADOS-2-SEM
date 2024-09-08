package ex2;

import java.util.Scanner;

public class Horda {
    private String nome;
    private String etnia;
    private String lingua;
    private int forca;

    public void setEtnia(String etnia) {
        this.etnia = etnia.toUpperCase();
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    public void atacar() {
        switch (this.etnia){
            case "ANGLO-SAXÃO":
                System.out.println("Seu povo já possui território, e não ataca outros.");
                break;

            case "SUEVO":
                System.out.println("Seu povo é mais fraco do que os vizinhos e perdeu a batalha.");
                break;

            case "FRANCO":
                System.out.println("ATACAAAAR!!!");
                break;

                default:
                    System.out.println("Povo desconhecido!");
                    break;
        }
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Horda barbaro = new Horda();

        System.out.println("""
                Defina a etnia do seu bárbaro:\
                
                1 - Anglo-Saxão\
                
                2 - Suevo\
                
                3 - Franco\
                
                (ESCREVA DE ACORDO COM AS OPÇÕES)""");

        barbaro.setEtnia(sc.next());

        System.out.println("Digite (1) para atacar:");
        if (sc.nextInt() == 1){
            barbaro.atacar();
        }else{
            System.out.println("Você é pacífico.");
        }
    }
}
