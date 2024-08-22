package org.example;
import java.util.Scanner;

public class Atividade6 {
    Scanner ler = new Scanner(System.in);
    double tempC;

    public double converter(){
        return(((tempC*1.8)+32));
    }

    public static void main(String[] args) {
        Atividade6 temperatura = new Atividade6();

        System.out.println("INSIRA UMA TEMPERATURA EM GRAUS CELSIUS");

        temperatura.tempC = temperatura.ler.nextDouble();

        System.out.println(temperatura.tempC + "ºC EM GRAUS FAHRENHEIT É IGUAL A: " + temperatura.converter() + "ºF");
    }
}
