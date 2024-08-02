<%-- Agregamos una declaracion de Jsp --%>
<%!
    //Declaramos una variable con su metodo GET
    private String usuario = "Alberto";

    public String getUsuario() {
        return this.usuario;
    }

//Declaramos un contador de visitas
    private int contadorVisitas = 1;
    
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSPs</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSPs</h1>
        Valor de usuario por medio del Atributo: <%=this.usuario%>
        <br>
        Valor de usuario por medio del Metodo: <%=this.getUsuario()%>
        <br>
        Contador visitas: <%=contadorVisitas++%>
    </body>
</html>
