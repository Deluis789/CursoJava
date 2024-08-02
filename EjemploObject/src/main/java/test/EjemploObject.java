package test;

import dominio.Empleado;

public class EjemploObject {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("maria",600);
        Empleado emp2 = new Empleado("maria",600);
        compararObjetos(emp1,emp2);
    }

    private static void compararObjetos(Empleado emp1, Empleado emp2) {
        System.out.println(emp1);
        System.out.println(emp2);
        ///Revision por referencia

        if (emp1 == emp2) {
            System.out.println("Los objetos tienen la misma direccion en memoria");
        } else {
            System.out.println("Los objetos tienen distinta direccion en memoria");
        }
        
        //Revision del metodo Equals
        if (emp1.equals(emp2)){
            System.out.println("Tienen el mismo contenido");
        }
        else{
            System.out.println("Tiene diferente contenido");
        }
        
        //Revisamos el metodo HASHCODE
        if (emp1.hashCode() == emp2.hashCode()){
            System.out.println("Tienen el mismo codigo HASH");
            System.out.println("emp1:" + emp1.hashCode());
            System.out.println("emp2:" + emp2.hashCode());
            
        }else{
            System.out.println("No tienen el mismo codigo HASH");
        }
    }
}
