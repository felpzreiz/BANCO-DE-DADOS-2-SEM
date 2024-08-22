package org.example;

public class Atividade2 {
    float brancos, nulos, validos;

    public Atividade2(float n1, float n2, float n3) {
        this.brancos = n1;
        this.nulos = n2;
        this.validos = n3;
    }

    public void calcular() {
        float total = brancos + nulos + validos;

        float percentValidos = ((float) (validos/total)*100);
        float percentNulos = ((float) (nulos /total)*100);
        float percentBrancos = ((float) (brancos /total)*100);

        System.out.println("Total de votos: " + total);

        System.out.println("Porcentagem de votos válidos: " + percentValidos + "%");
        System.out.println("Porcentagem de votos nulos: " + percentNulos + "%");
        System.out.println("Porcentagem de votos brancos: " + percentBrancos + "%");
    }

    public static void main(String[] args) {

        Atividade2 voto = new Atividade2(20, 30, 50);
        voto.calcular();

    }
}