<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Precesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de procesar el Formulario</h1>
        Usuario: <%=request.getParameter("usuario")%>
        <br>
        Password: <%=request.getParameter("password")%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
