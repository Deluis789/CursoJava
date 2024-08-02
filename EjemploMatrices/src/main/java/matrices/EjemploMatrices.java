package matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        //1. Declaramos una matriz de int
        int edades[][];
        //2. Instanciamos la matriz de int
        edades = new int [3][2];
        //3. Instanciar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 20;
        edades[1][0] = 15;
        edades[1][1] = 16; 
        edades[2][0] = 10;
        edades[2][1] = 9;
        
        //4.Imprimir los valores
        System.out.println("Matriz de enteros indice 0 0:" + edades[0][0]);
        System.out.println("Matriz de enteros indice 0 1:" + edades[0][1]);
        
        //1.Declarar e instanciar una matriz de objetos de tipo persona
        Persona personas[][] = new Persona [1][2];
        //Inicializamos valores
        personas[0][0] = new Persona ("Jorge");
        personas[0][1] = new Persona ("Maria");
        //Imprimimos valores
        System.out.println("Matriz indice 0 0:" + personas[0][0]);
        System.out.println("Matriz indice 0 1:" + personas[0][1]);
        
        for(int renglon=0;renglon<personas.length;renglon++){
        for(int colum=0;colum<personas[renglon].length;colum++){
            System.out.println("Matriz personas indice:" + renglon + " - " + colum + ": " + personas[renglon][colum]);
        }
        }
    }
}      
