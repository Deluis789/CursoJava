package com.diaz.coleccionesgenericas;

import java.util.*;

public class ColeccionesGenericas {

    public static void main(String[] args) {
        List <String> miLista = new ArrayList ();
        miLista.add("Juan");
        miLista.add("Maria");
        miLista.add("Elena");
        miLista.add("Elena");
        imprimir(miLista);
        
        Set<String> miSet = new HashSet ();
        miSet.add("200");
        miSet.add("200");
        miSet.add("300");
        
        imprimir(miSet);
        
        Map<String,String> miMap = new HashMap();
        miMap.put("1" , "Karla");
        miMap.put("2", "Juanes");
        miMap.put("3", "Candelaria");
        miMap.put("3", "Candelaria");
        
        imprimir(miMap.keySet());
        imprimir(miMap.values());
        
        System.out.println(miMap.get("2"));
    }
    public static void imprimir (Collection <String> coleccion){
    for (String elemento : coleccion){
        System.out.println("elemento:" + elemento);
    }
        System.out.println("");
    }
}
