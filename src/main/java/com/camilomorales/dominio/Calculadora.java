package com.camilomorales.dominio;

public class Calculadora {

    private String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }


    public void mostrarNombreMarca(){
        System.out.println("La marca de la calculadora es: "+marca);
    }

    //Sumar
    public static int Sumar(int num1, int num2){
        return num1 + num2;
    }

    //Restar
    public static int Restar(int num1, int num2){
        return num1 - num2;
    }

    public static double Multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double Division(double num1, double num2){
        return num1 / num2;
    }
}
