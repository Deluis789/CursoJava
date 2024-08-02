package com.diaz.manejocolecciones;

import java.util.*;

public class ManejoColecciones {

    public static void main(String[] args) {

        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        //Elemento repetido
        miLista.add(3);

        //imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("2000");
        miSet.add("30000");
        //Elemento duplicado nose agrega 
        miSet.add("2000");

        //imprimir(miSet);

        Map miMap = new HashMap();
        miMap.put("Valor1", "Luis");
        miMap.put("Valor2", "Maria");
        miMap.put("Valor3", "Elena");
        //Elemento duplicado sustituye al valor agregado previamente
        miMap.put("Valor3", "Karla");
        //Imprimimos las llaves no se respeta el orden
        imprimir(miMap.keySet());
        //Imprimimos valores
        imprimir(miMap.values()); 
        System.out.println(miMap.get("Valor2"));
    }

    private static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("elemento" + elemento);
        }
        System.out.println("");
    }
}
