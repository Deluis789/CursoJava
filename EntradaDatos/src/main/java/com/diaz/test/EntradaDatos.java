package com.diaz.test;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {
        String captura = null;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca datos:");
        captura = scanner.nextLine();
        
        while (!"salir".equals(captura)){
        System.out.println("El dato es:" + captura);
        captura = scanner.nextLine();}
    }
}
