public class PasoPorValor {

    public static void main(String[] args) {
        var a = 10;
        
        System.out.println("a = " + a);
        
        cambiarValor(a);
        
        System.out.println("a = " + a);
    }

    private static void cambiarValor(int arg) {
        arg = 30;
        
        System.out.println("arg = " + arg);
    }
}
