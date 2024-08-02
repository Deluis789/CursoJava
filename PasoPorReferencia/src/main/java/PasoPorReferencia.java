public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Luis");
        
        System.out.println("persona = " + persona.obtenerNombre());
        
        modificarNombre(persona);
        
        System.out.println("persona modificada = " + persona.obtenerNombre());
    }

    private static void modificarNombre(Persona personaArg) {
        personaArg.cambiarNombre("Carlos");
    }
    
}
