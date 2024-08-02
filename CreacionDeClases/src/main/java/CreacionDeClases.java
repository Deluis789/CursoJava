public class CreacionDeClases {

    public static void main(String[] args) {
        //Creacion de un objeto de tipo Persona
        Persona persona1 = new Persona();
        
        //Accedemos al objeto persona y llamamos al metodo desplegarNombre
        persona1.desplegarNombre();
        //Modificamos los valore de los atributos del objeto Persona
        System.out.println(" ");
        persona1.nombre = "Juan";
        persona1.apellido = "Diaz";
        persona1.desplegarNombre();//Se llama al metodo
        
        ///Creamos un segundo objeto de tipo Persona
        Persona persona2 = new Persona();
        
        persona2.nombre = "Karla";
        persona2.apellido = "Ramires";
        
        persona2.desplegarNombre();
    }
} 
