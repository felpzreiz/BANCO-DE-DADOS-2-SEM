package classes;

public class Time {
    private String nome;
    private String capitao;
    private String libero;
    private int pontos;

    public String torcer() {
        return("Vamos TIME!!");
    }

    public void setLibero(String libero) {
        this.libero = libero;
        System.out.println("Libero: " + libero + " definido!");
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getLibero() {
        return libero;
    }

    public int getPontos() {
        return pontos;
    }
}
