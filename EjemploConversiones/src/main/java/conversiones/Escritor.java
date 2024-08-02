package conversiones;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public String obtenerDetalles() {
        return super.obtenerDetalles() + " TipoEscriura: " + tipoEscritura.getDescripcion();
    }
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    public String getTipoDeEscrituraEnTexto(){
    return tipoEscritura.getDescripcion();
    }
}
