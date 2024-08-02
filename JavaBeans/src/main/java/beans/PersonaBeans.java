package beans;

import java.io.Serializable;

public class PersonaBeans implements Serializable {
     private String nombre;
     private int edad;
     
     public PersonaBeans(){
     }
     
     public PersonaBeans (String nombre , int edad){
     this.nombre = nombre;
     this.edad = edad;
     }
     public String getNombre (){
     return this.nombre;
     } 
     public void setNombre (String nombre){
     this.nombre = nombre;
     }
     public int getEdad (){
     return this.edad;
     }
     public void setEdad (int edad){
     this.edad = edad;
     }
}