package org.example;

public class Atividade16 {
    double n1, n2, n3;

    public Atividade16(double jan, double fev, double mar) {
        this.n1 = jan;
        this.n2 = fev;
        this.n3 = mar;
    }

    public double calcularTotal(){
       return ((n1+n2+n3) * 1000);
    }

    public double calcularMedia(){
       return (((n1+n2+n3)/3) * 1000);
    }
    
    public static void main(String[] args) {

        Atividade16 gasto = new Atividade16(15,23,17);
        System.out.println("GASTOS TOTAIS: R$ " + gasto.calcularTotal());
        System.out.println("MEDIA MENSAL DE GASTOS: R$ " + gasto.calcularMedia());

    }
}
