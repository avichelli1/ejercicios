package ejemplos.foreach.arreglos;

import seresvivos.humanos.Persona;
import java.util.ArrayList;

public class Ejemplo3 {

    public static void main(String[] args) {

        ArrayList<Persona> listaDePersonas = new ArrayList<>();

        Persona p1 = new Persona("Julio");
        listaDePersonas.add(p1);

        Persona p2 = new Persona("Laura");
        listaDePersonas.add(p2);

        Persona p3 = new Persona("Florencia");
        listaDePersonas.add(p3);

        Persona p4 = new Persona("Lautaro");
        listaDePersonas.add(p4);

        System.out.println("ArrayList de personas");

        for ( Persona persona :  listaDePersonas) {
            System.out.println("nombre: " + persona.getNombre());
        }


    }
}
