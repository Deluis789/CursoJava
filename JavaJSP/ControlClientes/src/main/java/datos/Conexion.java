package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        ds.setInitialSize(50);
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            System.out.println("Cerrando ResultSet...");
            if (rs != null) {
                rs.close();
            } else {
                System.out.println("ResultSet es null. No se cerró.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            System.out.println("Cerrando PreparedStatement...");
            if (stmt != null) {
                stmt.close();
            } else {
                System.out.println("PreparedStatement es null. No se cerró.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            System.out.println("Cerrando Connection...");
            if (conn != null) {
                conn.close();
            } else {
                System.out.println("Connection es null. No se cerró.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
