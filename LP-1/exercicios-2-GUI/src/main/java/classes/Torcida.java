package classes;

import java.util.Scanner;

public class Torcida {
    private String nome;
    private String time;
    private String assento;

    public void setTime(String time) {
        this.time = time;
    }

    public void cantar(){
        System.out.println("Uma vez " + time + ", sempre " + time + "!");
    }

    public void gritar() {
        System.out.println("Vamos time!!!");
    }

    public void protestar() {
        System.out.println("Juiz ladrão!");
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Torcida torcedor = new Torcida();

        System.out.println("Digite o nome do time: ");
        torcedor.setTime(sc.next());

        System.out.println("Deseja cantar?\nDigite '1' p/ SIM.");
        if(sc.nextInt()==1){
            torcedor.cantar();
        }
    }
}
