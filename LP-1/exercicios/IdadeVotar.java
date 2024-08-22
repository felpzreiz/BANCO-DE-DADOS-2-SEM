package org.example;
import java.util.Scanner;

//Ler o ano atual e o ano de nascimento de uma pessoa.
//Escrever uma mensagem que diga se ela poderá ou não votar este ano.
//(não é necessário considerar o mês em que a pessoa nasceu).

public class IdadeVotar{
    public int nasc;
    public int ano;

    public void calcular(){
        if((ano-nasc) >= 16){
            System.out.println("ESSE ANO VOCE PODERÁ VOTAR!");
        }else{
            System.out.println("ESSE ANO VOCE AINDA NÃO PODERÁ VOTAR!");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        IdadeVotar pessoa = new IdadeVotar();

        System.out.println("INSIRA O ANO DE NASCIMENTO:");
        pessoa.nasc = ler.nextInt();

        System.out.println("INSIRA O ANO ATUAL:");
        pessoa.ano = ler.nextInt();

        pessoa.calcular();
        ler.close();
    }
}