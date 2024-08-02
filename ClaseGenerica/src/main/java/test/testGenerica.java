package test;

import genericos.ClaseGenerica;

public class testGenerica {
    public static void main(String[] args) {
        
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica (20);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica ("Prueba");
        objetoString.obtenerTipo();
        
        //No es posible utilizar tipos primitivos en clases genericas
    }
}
