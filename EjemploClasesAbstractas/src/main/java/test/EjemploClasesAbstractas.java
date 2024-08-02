package test;

import abstracto.domain.*;

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        //Creacion de objetos
        //FiguraGeometrica figurageometrica = new FiguraGeometrica();

        FiguraGeometrica circulo = new Circulo("circulo");
        System.out.println(circulo);
        circulo.dibujar();

        FiguraGeometrica triangulo = new Triangulo("triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();

        FiguraGeometrica rectangulo = new Rectangulo("rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
    }
}
