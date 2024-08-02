
public class LaboratorioCons {

    public static void main(String[] args) {

        int valorA = 3;
        int valorB = 2;
        int valorC = 6;

        Caja objeto = new Caja(valorA, valorB, valorC);

        System.out.println("Ancho = " + valorA);
        System.out.println("Alto = " + valorB);
        System.out.println("Profundo = " + valorC);
        //Valor del cubo
        
        System.out.println("Valor total=" + objeto.volumen() );
    }
}
