<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los Valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee los Valores del JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <br/>
        Valor base: <jsp:getProperty name="rectangulo" property="base"/>
        <br/>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <br/>
        Valor area: <jsp:getProperty name="rectangulo" property="area"/>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
