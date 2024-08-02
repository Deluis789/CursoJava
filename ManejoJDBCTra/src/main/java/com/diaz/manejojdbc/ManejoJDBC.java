package com.diaz.manejojdbc;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.List;

public class ManejoJDBC {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(3);
            cambioPersona.setNombre("Angeles");
            cambioPersona.setApellido("Mendez");
            cambioPersona.setEmail("angela@gmail.com");
            cambioPersona.setTelefono("78412541");
            personaJdbc.update(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Mamani");

            personaJdbc.insert(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se hizo commit en la transaccion");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
