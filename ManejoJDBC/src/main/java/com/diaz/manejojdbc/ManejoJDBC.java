
package com.diaz.manejojdbc;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoJDBC {

    public static void main(String[] args) {
        
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();
        for(Persona person : personas){
            System.out.println("persona" + person);
        } 
        
        //Prueba de insert
//        Persona persona = new Persona();
//        
//        persona.setNombre("Jorge");
//        persona.setApellido("Diaz");
//        persona.setEmail("luis@gmail.com");
//        persona.setTelefono("64512547");
        
//        personaJDBC.insert(persona);
        //Prueba update 
//        Persona persona = new Persona();
//        persona.setId_persona(3);
//        persona.setNombre("Angela");
//        persona.setApellido("Mendez");
//        persona.setEmail("angela@gmail.com");
//        persona.setTelefono("78412541");
//        
//        personaJDBC.update(persona);
        //Prueba eliminar
        Persona persona = new Persona();
        persona.setId_persona(4);
        
        personaJDBC.delete(persona);
                
    }
}
