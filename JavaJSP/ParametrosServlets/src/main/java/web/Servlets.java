package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlets")
public class Servlets extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
            //Leer los parametros del formulario Html
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");

            System.out.println("Usuario:" + usuario);
            System.out.println("Password:" + password);

            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.print("<body>");
            out.print("El parametro de usuario es:" + usuario);
            out.print("<br/>"); 
            out.print("El parametro de password es:" + password);
            out.print("<br/>");
            out.print("</body>");
            out.print("</html>");
            out.close();
        }
    }
