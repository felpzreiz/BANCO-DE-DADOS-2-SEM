package ex2;

import java.util.Objects;
import java.util.Scanner;

public class Banda{
    private String nome;
    private String instrumento;
    private int idade;

    public void setInstrumento(int i) {
        switch (i) {
            case 1:
                this.instrumento = "BATERIA";
                break;

                case 2:
                    this.instrumento = "GUITARRA";
                    break;

                    case 3:
                        this.instrumento = "TECLADO";
                        break;

                        default:
                            System.out.println("Erro ao selecionar instrumento");
                            break;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void tocar(){
        System.out.println("♪ ♫ ♪ ♫");
    }

    public static void menu(){
        Banda membro = new Banda();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do membro: ");
        membro.setNome(sc.next());

        System.out.println("""
                Digite o número para definir o instrumento do membro: \
                
                1 - Bateria\
                
                2 - Guitarra\
                
                3 - Teclado""");

        membro.setInstrumento(sc.nextInt());

        System.out.println("Digite 1 para " + membro.getNome() + " tocar seu instrumento: ");
        if (sc.nextInt() == 1) {
            membro.tocar();
        }
    }
}
