package genericos;
public class ClaseGenerica <T>{
    // Definimos la variable de tipo generico
    T objeto;
    
    //Constructor que inicializa el tipo a ultiliar
    public ClaseGenerica (T objeto){
    this.objeto = objeto;
    }
    public void obtenerTipo (){
        System.out.println("El tipo T es:" + objeto.getClass().getSimpleName());    
    }
}
