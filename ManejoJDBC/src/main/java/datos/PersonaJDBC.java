package datos;

import domain.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaJDBC {

    private static final String SQL_SELECT = "SELECT idpersona , nombre , apellido , email , telefono from persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre , apellido , email , telefono) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=? , apellido=? , email=? , telefono=? WHERE idpersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona=?";

    public List<Persona> select() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<Persona>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_persona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona();
                persona.setId_persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);

                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        }
        
        return personas;
    }
    public int insert(Persona persona){
    Connection conn = null;
    PreparedStatement  stmt = null;
    int rows = 0;
    
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            
            System.out.println("Ejecutando query" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
        Conexion.close(stmt);
        Conexion.close(conn);
        }
        return rows;
    }
    public int update(Persona persona){
     Connection conn = null;
     PreparedStatement stmt = null;
     int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando el query" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getId_persona());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
           Conexion.close(stmt);
           Conexion.close(conn);
        }
        return rows;
    }
    public int delete(Persona persona){
    Connection conn = null;
    PreparedStatement  stmt= null;
    int rows = 0; 
    
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando Query" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_persona());
            rows = stmt.executeUpdate();
            System.out.println("Registros Eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
        Conexion.close(stmt);
        Conexion.close(conn);
        }
        return rows;
    }
}
