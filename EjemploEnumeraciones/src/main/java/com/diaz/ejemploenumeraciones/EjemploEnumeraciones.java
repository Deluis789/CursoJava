package com.diaz.ejemploenumeraciones;

import com.diaz.enumeraciones.*;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        
        // Valores de la enumeracion 
        System.out.println("Valor 1:" + Dias.Lunes);    
        System.out.println("Valor 2:" + Dias.Martes);
        //Utilizamos la enumeracion de paises
        System.out.println("Continente 2:" + Continentes.EUROPA + 
                "  La cantidad de paises son:" + Continentes.EUROPA.getPaises());
        
        //Llmamos al metodo indicarDia
        indicarDia(Dias.Domingo);
    }
    public static void indicarDia(Dias dias){
    switch (dias){
        case Lunes:
            System.out.println("Primer dia de la semana");
            break;
        case Domingo:
            System.out.println("Septimo dia de la semana");
            break;
    }
    }
}
