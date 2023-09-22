package com.camilomorales.app;

import com.camilomorales.dominio.Calculadora;

public class App {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora("Casio");

        calculadora.mostrarNombreMarca();

        int resultadoSuma = Calculadora.Sumar(4,5);
        System.out.println("\nLa suma de los números es: "+resultadoSuma);

        int resultadoResta = Calculadora.Restar(10,5);
        System.out.println("\nLa resta de los números es: "+resultadoResta);

        double resultadoMultiplicacion = Calculadora.Multiplicar(3,5);
        System.out.println("\nLa multiplicación de los números es: "+resultadoMultiplicacion);

        double resultadoDivision = Calculadora.Division(20,2);
        System.out.println("\nLa división de los números es: "+resultadoDivision);
    }
}
