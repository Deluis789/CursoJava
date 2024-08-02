package ventas;

import com.diaz.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        //Crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa",250);
        Producto producto2 = new Producto("Pantalon",150);
        
        //Creamos un objeto de tipo orden 
        Orden orden1 = new Orden();
        //Agregamos los productos a la orden
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        
        //Imprimir la orden
        orden1.mostrarOrden();
    }
}
