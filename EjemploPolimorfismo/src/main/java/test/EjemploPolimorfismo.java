package test;

import ejemploPolimorfismo.Empleado;
import ejemploPolimorfismo.Gerente;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado ("Juan",5000);
        imprimirDetalles(emp1);
        
        Gerente gerente1 = new Gerente ("Luis",600,"La paz");
        imprimirDetalles(gerente1);
    }
    public static void imprimirDetalles(Empleado empleado){
        System.out.println("empleado:" + empleado.obtenerDetalles());
    } 
}
