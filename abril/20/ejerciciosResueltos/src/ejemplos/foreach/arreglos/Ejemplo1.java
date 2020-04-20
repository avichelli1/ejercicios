package ejemplos.foreach.arreglos;

import java.util.ArrayList;

public class Ejemplo1 {

    public static void main(String[] args) {

        ArrayList<Integer> enteros = new ArrayList();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);

        System.out.println("Usando Integer... ");

        for ( Integer unEntero : enteros ) {
            System.out.println(unEntero);
        }

        System.out.println("Usando int... ");
        for ( int unEntero : enteros ) {
            System.out.println(unEntero);
        }

        int suma = 0;

        for ( Integer unEntero : enteros ) {
            suma = suma + unEntero;
        }

        System.out.println("la suma total es: " + suma);

    }
}
