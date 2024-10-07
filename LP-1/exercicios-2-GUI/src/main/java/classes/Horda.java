package classes;

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

    public int getForca() {
        return forca;
    }

    public String atacar() {
        switch (etnia){
            case "ANGLO-SAXÃO":
                return("Seu povo já possui território, e não ataca outros.");

            case "SUEVO":
                return ("Seu povo é mais fraco do que os vizinhos e perdeu a batalha.");

            case "FRANCO":
                return ("ATACAAAAR!!!");

                default:
                    return ("Povo desconhecido!");
        }
    }
}
