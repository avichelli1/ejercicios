package ejemplos.muestras;

import seresvivos.humanos.Persona;
import java.util.HashSet;

public class Ejemplo1 {

    public static void main(String[] args) {

        Persona p1 = new Persona("Gloria",25);
        Persona p2 = new Persona("Gloria",25);
        Persona p3 = new Persona("Holmes",45);

        p1.esIgualA(p2);

        System.out.println("referencia de p1: " + p1);

        System.out.println("this: " + p1.impirmirThis());

        System.out.println("referencia de p2: " + p2);

        System.out.println("referencia de p3: " + p3);

        System.out.println(" p1 == p2 es " + (p1 == p2) );

        System.out.println("p1 es igual a p2?" + p1.esIgualA(p2) );

    }
}
