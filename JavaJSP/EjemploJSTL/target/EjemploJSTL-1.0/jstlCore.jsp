<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core(jsp standard tag Library)</h1>
        <!--Manipulacion de variables-->
        <!--Definimos la Variable-->
        <c:set var="nombre" value="Luis"></c:set>
            <!--Despegamos el valor de la variable-->
            Variable nombre: <c:out value="${nombre}"/>
        <br/>
        <br/>
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br/>
        <br/>
        <!--Codigo condicionado uso de if-->
        <c:set var="bandera" value="true"></c:set>
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!--Codigo condicionado uso de Switch-->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion proporcionada Desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
       <!--Itereacion en un Arreglo y usamos Scriptlets-->
       <%
       String nombres[] = {"Claudia","Pedro","Joselo","Maria"};
       request.setAttribute("nom", nombres);
       %>
       <br/>
       <br/>
       <h2>Lista de Nombres</h2>
       <ul>
           <c:forEach var="nombres" items="${nom}">
               <li>${nombres}</li>
           </c:forEach>
       </ul>
       <br/><br/>
       <a href="index.jsp">Regresar al inicio</a>
    </body>

</html>
