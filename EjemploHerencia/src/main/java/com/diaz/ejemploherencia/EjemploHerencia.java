
package com.diaz.ejemploherencia;

import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado  empleado1 = new  Empleado("Luis",6000);
        empleado1.setGenero('M');
        empleado1.setEdad(23);
        empleado1.setDireccion("Arpos #34");
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date(),true);
        cliente1.setNombre("Maria");
        cliente1.setDireccion("Palos blancos");
        cliente1.setGenero('F');
        cliente1.setEdad(18);
        System.out.println(cliente1);
    }
    
}
