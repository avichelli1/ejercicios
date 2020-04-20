package ejemplos.foreach.conjuntos;

import seresvivos.humanos.Persona;
import java.util.HashSet;

public class Ejemplo2 {

    public static void main(String[] args) {

        Persona p1 = new Persona("Julio");
        Persona p2 = new Persona("Laura");
        Persona p3 = new Persona("Florencia");
        Persona p4 = new Persona("Lautaro");


        HashSet<Persona> conjuntoDePersonas = new HashSet<>();
        conjuntoDePersonas.add(p1);
        conjuntoDePersonas.add(p2);
        conjuntoDePersonas.add(p3);
        conjuntoDePersonas.add(p4);


        for (int i = 0; i < 12; i++) {
            conjuntoDePersonas.add(p1);
        }

        /*
            Notar que a pesar de que se agrega 12 veces
            el elemento p1, en el conjunto aparece sólo una vez

         */

        System.out.println("HashSet de personas");
        for ( Persona persona : conjuntoDePersonas ) {
            System.out.println("nombre: " + persona.getNombre());
        }

    }
}
