
public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ingresamos valores");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int volumen() {
        return ancho * alto * profundo;
    }
}
