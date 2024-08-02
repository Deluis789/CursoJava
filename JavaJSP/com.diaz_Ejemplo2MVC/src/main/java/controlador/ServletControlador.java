package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1.Procesamos Parametros
        String accion = request.getParameter("accion");
        //2.Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 3);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);
        //3.Agregamos los JavaBean a algun alcanze

        //Alcance Request
        if ("agregarVariables".equals(accion)) {
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance Sesion
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            //Alcance Aplication
            ServletContext aplication = this.getServletContext();
            aplication.setAttribute("rectanguloAplicacion", recAplicacion);
            //Agregamos un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            //4.Reedireccionamos al jsp a index
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else if("listarVariables".equals(accion)) {
        //4.Reedireccionamos al jsp que despliega las variables
        request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }
        else {
            //4.Reedirecionamos a la pagina inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            //Esta linea no agregaria informacion al JSP
            //Ya que no propaga objetos request , response
            //response.sendRedirect("index.jsp");
        }
    }
}
