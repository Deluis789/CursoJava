public class OperadorJava {

    public static void main(String[] args) {
    //Ejercicio si el numero es par o impar.......
    var numero = 13;
    var par = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println("El numero es :" +par);
        
    ///Ejercicio predecremento y posdecremento
    var a = 5;
    var b = 10;
    var c = ++a + b--;// a = 6 ; b = 10 c = 16
          //predecremnto--->posdecemnto
        System.out.println("a = " + a);
        System.out.println("b = " + b);//aqui ya se llamo la variable Segunda vez ya es 9
        System.out.println("c = " + c);// esto es = 16 se mantiene 
    } 
}
