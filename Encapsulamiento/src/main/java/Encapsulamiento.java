
public class Encapsulamiento {

    public static void main(String[] args) {
        Persona persona = new Persona("juan", 4566, false);

//        System.out.println("Su nombre es:" + persona.getNombre());
//        System.out.println("El sueldo es:" + persona.getSueldo());
//        System.out.println("Su nombre es:" + persona.isEliminado());
        System.out.println("Persona: " + persona.toString());

        persona.setNombre("jose");
        persona.setSueldo(45612);
        persona.setEliminado(true);

//        System.out.println("Su nombre es:" + persona.getNombre());
//        System.out.println("El sueldo es:" + persona.getSueldo());
//        System.out.println("Su nombre es:" + persona.isEliminado());
        System.out.println("Persona: " + persona);
    }
}
