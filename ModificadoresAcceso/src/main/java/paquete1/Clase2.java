package paquete1;

public class Clase2 {
    //Pruebas de constructores Clase1
    public Clase2(){
    new Clase1();
    new Clase1("uno","dos");
    new Clase1("uno","dos","tres");
    //No podemos llamar constructores privados
    //new Clase1("uno","dos","tres","cuatro");
    }
    public void pruebaDesdeClase2(){
    Clase1 c1 = new Clase1();
        System.out.println("Atributo publico:" + c1.atributoPublico);
        System.out.println("Atributo protegido:" + c1.atributoProtegido);
        System.out.println("Atributo default o package:" + c1.atributoDefault);
        //System.out.println("Atributo privado:" + c1.atributoPrivado);
        
        System.out.println("");
        System.out.println("Metodo publico:" + c1.metodoPublico());
        System.out.println("Metodo protegido:" + c1.metodoProtected());
        System.out.println("Metodo default o package:" + c1.MetodoDefault());
    }
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }
}
