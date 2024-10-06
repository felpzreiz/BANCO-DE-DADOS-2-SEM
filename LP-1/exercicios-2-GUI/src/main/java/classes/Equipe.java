package classes;

public class Equipe {
    private String nome;
    private String cla;
    private String elemento;

    public void setCla(String cla) {
        this.cla = cla;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getNome() {
        return nome;
    }

    public String getCla() {
        return cla;
    }
}
