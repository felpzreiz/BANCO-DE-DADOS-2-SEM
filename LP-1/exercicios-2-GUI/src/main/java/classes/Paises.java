package classes;

public class Paises {
    private String nome;
    private double populacao;
    private double pib;
    private double area;
    
    public Paises(String nome, double populacao, double pib, double area) {
        this.nome = nome;
        this.populacao = populacao;
        this.pib = pib;
        this.area = area;
    }
    
    public double pibPerCapta(){
        return (pib/populacao);
    }

    public double calcularDensidade(){
        return (populacao/area);
    }

    public double setPib(double pib){
        this.pib = pib;
        return pib;
    }
}
