
import java.util.Scanner;

public class CondicionesIf {

    public static void main(String[] args) {
        ///EJERCICIO DE ESTACIONES DEL AÑO 
        /*var consola = new Scanner(System.in);
        System.out.println("Digite el mes a comprobar:");
    var mes = consola.nextInt(); //mes del año
    String estacion = ""; 
    
    if(mes == 1 || mes == 2 || mes ==12){
    estacion = "Invierno";
    }else if (mes == 3 || mes == 4 || mes == 5){
    estacion = "Primavera";
    }else if (mes == 6 || mes == 7 || mes == 8){
    estacion = "Verano";
    }else if (mes == 9 || mes == 10 || mes == 11){
    estacion = "Otoño";
    }else{
    estacion = "Mes incorrecto";
    }
        System.out.println("estacion: " + estacion + " Para el mes: " + mes);
    ///////////////////////////ESTURUCTURA SWITCH//////////////////////////
    //////////////////////////////////////////////////////////////////////////////
    var numero = 3;
    var numeroTexto = "Numero Desconocido";
    
    switch (numero){
        case 1:
            numeroTexto = "Numero uno";
            break;
        case 2:
            numeroTexto = "Numero dos";
            break;
        case 3:
            numeroTexto = "Numero tres";
            break;
        default: 
            numeroTexto = "Numero desconocido";
    }
        System.out.println("Numero texto: " + numeroTexto + " para el numero proporcionado " + numero);*/
        var scanner = new Scanner(System.in);
        System.out.print("Proporciona el valor del mes:");
        var meses = scanner.nextInt();
        String estacion = null;

        switch (meses) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("estacion: " + estacion + " para el mes:" + meses);
    }
}
