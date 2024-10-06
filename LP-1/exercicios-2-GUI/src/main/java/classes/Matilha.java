package classes;

public class Matilha {
    private String nome;
    private String raca;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String latir(){
        return("Au Au \uD83D\uDC15");
    }

    public String correr(){
        return ("\uD83D\uDC15 \uD83D\uDC15 \uD83D\uDC15");
    }

    public String getNome() {
        return nome;
    }
}
