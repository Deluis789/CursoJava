public class Suma {
    
    //Atributos de la clase
    int a;
    int b;
    

    public Suma (int a , int b){
    this.a = a;//Se utiliza this esto indica que es una variable de un atributo y no de un metodo
    this.b = b;
    System.out.println("Ejecutando constructor con dos argumentos");
    }
    
    public int sumar(){
    return this.a + this.b;    
    }
    public int restar(){
    return a - b;
    }
    public int producto(){
    return a * b;
    }
    public int  division(){
    return a / b;
    }
    
}
