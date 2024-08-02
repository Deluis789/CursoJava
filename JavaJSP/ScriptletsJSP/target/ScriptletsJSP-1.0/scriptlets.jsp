<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1> 
        <br>
        <%-- Scripltet para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde scriptlet");
        %> 
        <%-- Scripltet para manipular ol objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la Aplicacion:" + nombreAplicacion);
        %>
        <br>
        <%-- Con  codigo condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        la sesion SI es nueva
        <%
        } else if (session != null) {
        %>
        La sesion NO es nueva
        <%
            }
        %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
