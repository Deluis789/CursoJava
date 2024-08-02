<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que Modifica a un  JavaBean</title>
    </head>
    <body>
        <h1>JSP que Modifica a un  JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
            Modificamos los atributos:
            <br/>
            <br/>
        <%
            int baseValor = 5;
            int alturaValor = 10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"/>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>
        <br/>
        nuevo valor de base:<%=baseValor%>
        <br/>
        nuevo valor de altura:<%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
