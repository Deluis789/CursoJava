<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <br/>
        <div style="color: red">
            ${mensaje}
        </div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al servlet controlador SIN parametros
        </a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariables">
            Link al servlet controlador para agregar Variables
        </a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al servlet controlador para listar Variables
        </a>
    </body>
</html>
