package ejemplos.foreach.conjuntos;

import seresvivos.humanos.Persona;
import java.util.HashSet;

public class Ejemplo3 {

    public static void main(String[] args) {

        Persona p1 = new Persona("Julio");
        Persona p2 = new Persona("Laura");
        Persona p3 = new Persona("Florencia");
        Persona p4 = new Persona("Lautaro");
        Persona p5 = new Persona("Julio");
        Persona p6 = new Persona("Julio");


        HashSet<Persona> conjuntoDePersonas = new HashSet<>();

        conjuntoDePersonas.add(p1);
        conjuntoDePersonas.add(p2);
        conjuntoDePersonas.add(p3);
        conjuntoDePersonas.add(p4);
        conjuntoDePersonas.add(p5);
        conjuntoDePersonas.add(p6);


        System.out.println("HashSet de personas");
        for ( Persona persona : conjuntoDePersonas ) {
            System.out.println("nombre: " + persona.getNombre());
        }
    }
}
