package org.example.Suma;

import java.util.List;

public class Suma {
    private List<Integer> listaNumeros;

    public Suma(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public void sumaLista() {
        Integer resultado = 0;
        if (this.listaNumeros != null && !this.listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                // verifica que no este en null
                if (numero != null) {
                    resultado += numero;
                }
            }
            System.out.println("El resultado de la suma de la lista de números es: " + resultado);
        } else {
            System.out.println("No agregó números a la lista para sumar");
        }
    }
}
