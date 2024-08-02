
public class PruebaAritmetica {

    public static void main(String[] args) {

        //Variable local
        int operandoA = 8;
        int operandoB = 4;

        // Creamos un objeto de la clase Suma enviando argumentos
        Suma objeto1 = new Suma(operandoA, operandoB);

        //Imprimimos  los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos los resultados Aritmeticos
        System.out.println("\nResultado de la suma: " + objeto1.sumar());
        //Resta
        System.out.println("\nResultado de la resta: " + objeto1.restar());
        //Producto
        System.out.println("\nResultado del producto: " + objeto1.producto());
        //Division
        System.out.println("\nResultado de la division: " + objeto1.division());

    }
}
