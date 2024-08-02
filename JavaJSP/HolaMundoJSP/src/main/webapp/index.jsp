<%-- 
    Document   : index
    Created on : 24 de jan de 2024, 20:23:47
    Author     : luisc
--%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSP</title>
    </head>
    <body>
        <h1>HolaMundo JSP</h1>
        <ul>
            <li><% out.print("Hola mundo con Scripleats"); %></li>
            <li>${"Hola mundo con Expression languaje (EL)"}</li>
            <li><%="Hola mundo con Expresiones"%></li>
            <li><c:out value="Hola mundo con JSTL"/></li>
            
        </ul>
    </body>
</html>
