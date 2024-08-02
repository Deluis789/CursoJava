package com.diaz.ventas;

        public class Orden {

            private int idOrden;
            private Producto productos[];//Declaramos la variable arreglo
            private static int contadorOrdenes;
            private int contadorProductos;
            private static final int MAX_PRODUCTOS = 10;

            public Orden() {
                this.idOrden = ++contadorOrdenes;
                //Inicializar el arreglo
                productos = new Producto[MAX_PRODUCTOS];
            }

            public void agregarProductos(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de prodctos:" + MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
    double total=0;
    for(int i = 0; i<this.contadorProductos;i++){
    Producto producto = this.productos[i];
    total += producto.getPrecio();//total = total + producto.getPrecio()
    }
    return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Total de la Orden $:" + this.calcularTotal());
        System.out.println("Productos de la Orden:");
        for(int i=0; i < this.contadorProductos;i++){
        Producto producto = productos[i];
            System.out.println(producto);
        }
    }
}
