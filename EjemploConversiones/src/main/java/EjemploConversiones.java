
import conversiones.*;

public class EjemploConversiones {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Luis",5000,TipoEscritura.MODERNO);
        System.out.println(empleado.obtenerDetalles());
        ///CAST 
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoDeEscrituraEnTexto());
        
        //OTRA FORMA DE HACER EL CAST
        System.out.println(((Escritor)empleado).getTipoDeEscrituraEnTexto());
        //Creacion de otro objeto de tipo Gerente
        empleado = new Gerente ("Laura",6000,"Sistemas");
        System.out.println(((Gerente)empleado).getDepartamento());
    }
}
