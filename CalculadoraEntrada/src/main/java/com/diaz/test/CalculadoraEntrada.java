package com.diaz.test;

import static calculadora.Sumar.sum;
import java.util.Scanner;

public class CalculadoraEntrada {

    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Proporciona el segundo valor");
        int b = scan.nextInt();
        int resultado = sum(a,b); 
        System.out.println("El resultado de la suma es:" + resultado);
    }
}
