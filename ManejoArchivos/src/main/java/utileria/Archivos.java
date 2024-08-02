package utileria;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
    public static void  crearArchivo (String nombreArchivo){
    File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se creo correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo){
    File archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println("Contenido escrito en el archivo");
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void leerArchivo (String nombreArchivo){
    File archivo = new File (nombreArchivo);
        try {
            BufferedReader entrada  = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexando la informacion del archivo");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
