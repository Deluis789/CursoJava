
public class SobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println("Resultado1 = " + Operaciones.sumar(6, 9));
        System.out.println("Resultado2 = " + Operaciones.sumar(10.0, 5));
        System.out.println("Resultado3 = " + Operaciones.sumar(3,5L));
        System.out.println("Resultado4 = " + Operaciones.sumar(3f,'A'));
    }
}
