package ex2;

import java.util.Objects;
import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        do{
            System.out.println("""
                    Escolha uma classe ou digite '0' para SAIR: \
                    
                    1 - Paises\
                    
                    2 - Colmeia\
                    
                    3 - Equipe\
                    
                    4 - Time\
                    
                    5 - Matilha\
                    
                    6 - Banda\
                    
                    7 - Horda\
                    
                    8 - Turma\
                    
                    9 - Missa\
                    
                    10 - Torcida""");


            switch(i = sc.nextInt()){
                case 1:
                    Paises pais = new Paises("Angola", 355.9, 106.8, 124.7);
                    System.out.println("Densidade Populacional: " + String.format("%,.2f", pais.calcularDensidade()));
                    System.out.println("PIB per Capta: " + String.format("%,.2f", pais.pibPerCapta()));

                    System.out.println("Defina o novo PIB (em bi): ");
                    double pib = sc.nextDouble();
                    pais.setPib(pib);

                    System.out.println("Novo PIB per Capta: " + String.format("%,.2f",pais.pibPerCapta()));
                    break;

                case 2:
                    Colmeia abelha = new Colmeia("", 1, 10);
                    System.out.println("Defina a função da abelha: ");
                    System.out.println(abelha.setFuncao());
                    System.out.println("Digite 'Z' para chamar a abelha: ");

                    if (Objects.equals(sc.next(), "Z")){
                        abelha.zumbir();
                    } else {
                        System.out.println("Você não chamou a abelha! :(");
                    }
                    break;

                case 3:
                    Equipe ninja = new Equipe();
                    System.out.println("Digite o nome do ninja: ");
                    ninja.setNome(sc.next());

                    System.out.println("""
                            Insira o clã: \
                            
                            Uchiha\
                            
                            Uzumaki\
                            
                            Hyuuga""");

                    String cla = sc.next();

                    if((Objects.equals(cla, "Uzumaki"))
                            || (Objects.equals(cla, "Uchiha"))
                            || (Objects.equals(cla, "Hyuuga")))
                    {
                        ninja.setCla(cla);

                    }else{
                        System.out.println("Clã inválido");
                    }

                    System.out.println("Nome do Ninja: " + ninja.getNome() + " " + ninja.getCla());
                    break;

                case 4:
                    Time libero = new Time();
                    System.out.println("Defina o nome do líbero: ");
                    libero.setLibero(sc.next());

                    System.out.println("Digite 1 para torcer pelo seu time: ");
                    if (sc.nextInt() == 1){
                        libero.torcer();
                    }
                    break;

                case 5:
                    Matilha cachorro = new Matilha();

                    System.out.println("Digite o nome do cachorro: ");
                    cachorro.setNome(sc.next());

                    System.out.println("Digite '1' para fazer o cachorro latir e '2' para fazé-lo correr:");
                    if (sc.nextInt() == 1){
                        cachorro.latir();
                    } else if (sc.nextInt() == 2) {
                        cachorro.correr();
                    }
                    break;

                case 6:
                    Banda.menu();
                    break;

                case 7:
                    Horda.menu();
                    break;

                case 8:
                    Turma.menu();
                    break;

                case 9:
                    Missa.menu();
                    break;

                case 10:
                    Torcida.menu();
                    break;
            }
        }while (i!=0);

        System.out.println("Até logo!");
        sc.close();
    }
}
