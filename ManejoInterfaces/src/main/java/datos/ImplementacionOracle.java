package datos;

public class ImplementacionOracle implements AccesoDatos{

    @Override
    public void insertar() {
         System.out.println("Insertando desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Oracle");
    }
    
}
