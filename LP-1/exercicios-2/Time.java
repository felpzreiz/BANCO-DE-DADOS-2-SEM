package ex2;

public class Time {
    private String nome;
    private String capitao;
    private String libero;
    private int pontos;

    public void torcer() {
        System.out.println("Vamos TIME!!");
    }

    public void setLibero(String libero) {
        this.libero = libero;
        System.out.println("Libero: " + libero + " definido!");
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
