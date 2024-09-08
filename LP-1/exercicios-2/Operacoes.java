package ex2;

import java.util.Scanner;

public class Operacoes {
    private int numerador;
    private int denominador;

    Operacoes(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String somar(Operacoes fracao1, Operacoes fracao2) {

        int denominadorComum = fracao2.denominador * fracao1.denominador;
        int novoNumerador = fracao1.numerador*(denominadorComum/fracao1.denominador)+
                fracao2.numerador*(denominadorComum/fracao2.denominador);

        return(simplificar(novoNumerador,denominadorComum));
    }

    public String subtrair(Operacoes fracao1, Operacoes fracao2) {

        int denominadorComum = fracao2.denominador * fracao1.denominador;
        int novoNumerador = fracao1.numerador*(denominadorComum/fracao1.denominador)-
                fracao2.numerador*(denominadorComum/fracao2.denominador);

        return(simplificar(novoNumerador,denominadorComum));
    }

    public String multiplicar(Operacoes fracao1, Operacoes fracao2) {
        int novoNumerador = fracao1.numerador * fracao2.numerador;
        int novoDenominador = fracao1.denominador * fracao2.denominador;

        return (simplificar(novoNumerador,novoDenominador));
    }

    public String dividir(Operacoes fracao1, Operacoes fracao2) {
        int novoNumerador = fracao1.numerador * fracao2.denominador;
        int novoDenominador = fracao1.denominador * fracao2.numerador;

        return (simplificar(novoNumerador,novoDenominador));
    }

    public String simplificar(int newNumerador, int newDenominador){
        int menor = 1;
        if(newNumerador > newDenominador){
            menor = newDenominador;
        } else if (newNumerador < newDenominador) {
            menor = newNumerador;
        }else{
            //TERMINAR AQUI!!!
        }

        for(int i = menor; i >= 2; i--){
            if((newNumerador%i == 0) && (newDenominador%i == 0)){
                return (newNumerador/i + "/" + newDenominador/i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        do {
            System.out.println("Insira a primeira fração:");

            System.out.println("Digite o numerador: ");
            int numerador = sc.nextInt();
            System.out.println("Digite o denominador: ");
            int denominador = sc.nextInt();
            Operacoes fracao1 = new Operacoes(numerador, denominador);

            System.out.println("Insira a segunda fração:");

            System.out.println("Digite o numerador: ");
            numerador = sc.nextInt();
            System.out.println("Digite o denominador: ");
            denominador = sc.nextInt();
            Operacoes fracao2 = new Operacoes(numerador, denominador);

            System.out.println("\nQue operação deseja realizar?");
            System.out.println("""
                    1 - Adição\
                    
                    2 - Subtração\
                    
                    3 - Multiplicação\
                    
                    4 - Divisão""");

            i = sc.nextInt();

            switch (i){
                case 1:
                    System.out.println("Resultado:" + fracao1.somar(fracao1, fracao2));
                    break;

                    case 2:
                        System.out.println("Resultado:" + fracao2.subtrair(fracao1, fracao2));
                        break;

                        case 3:
                            System.out.println("Resultado:" + fracao1.multiplicar(fracao1, fracao2));
                            break;

                            case 4:
                                System.out.println("Resultado:" + fracao1.dividir(fracao1, fracao2));
                                break;

                                default:
                                    System.out.println("Opção inexistente");
                                    break;
            }

        }while (i != 0);
    }
}
