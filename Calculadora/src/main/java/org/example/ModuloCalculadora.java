package org.example;

public class ModuloCalculadora {
    private Double valorA;
    private Double valorB;

    public Double getValorA() {
        return valorA;
    }

    public void setValorA(Double valorA) {
        this.valorA = valorA;
    }

    public Double getValorB() {
        return valorB;
    }

    public void setValorB(Double valorB) {
        this.valorB = valorB;
    }

    public void calculoModulo() {
        Double modulo = 0.0D;

        modulo = this.getValorA() % this.getValorB();

        System.out.println("Resultado del módulo es " + modulo);
    }

}
