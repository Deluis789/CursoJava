package arreglos;

public class EjemploArrays {

    public static void main(String[] args) {
        //1. Declaramos la variable de tipo arreglo un arreglo de int 
        int edades[];
        //2. Instanciamos el arreglo de int
        edades = new int[4];
        //3. Inicializamos los valores de los elementos del arreglo
        edades[0] = 50;
        edades[1] = 30;
        edades[2] = 60;
        //4. Imprimimos los valores del arreglo
        System.out.println("arreglo enteros indice 0: " + edades[0]);
        System.out.println("arreglo enteros indice 1: " + edades[1]);
        System.out.println("arreglo enteros indice 2: " + edades[2]);

        //1. Declarar e instanciar un arreglo  de tupos object
        Persona personas[] = new Persona[4];
        //2. Inicializar los valores del arreglo
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");

        System.out.println("Arreglo Personas indice 1: " + personas[0]);
        System.out.println("Arreglo Personas indice 2: " + personas[1]);
        System.out.println("Arreglo Personas indice 2: " + personas[2]);
        System.out.println("Arreglo Personas indice 2: " + personas[3]);
    
        //Arreglo usando notacion simplificada
        String nombres[] = {"jorge","Karla","Mario","Rebeca"};
        ///Imprimimos los elementos de los arreglos
        for(int i=0;i<nombres.length;i++){
            System.out.println("Arreglo:" + i + ": " + nombres[i]);
        }
    }
}
