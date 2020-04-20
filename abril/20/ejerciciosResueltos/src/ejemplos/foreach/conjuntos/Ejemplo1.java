package ejemplos.foreach.conjuntos;

import java.util.HashSet;

public class Ejemplo1 {

    public static void main(String[] args) {

        System.out.println("Conjunto de números!");
        HashSet<Integer> enterosSinOrden = new HashSet<>();
        enterosSinOrden.add(3);
        enterosSinOrden.add(99);
        enterosSinOrden.add(98);
        enterosSinOrden.add(97);

        for ( Integer entero : enterosSinOrden ) {
            System.out.println(entero);
        }

        System.out.println("Conjunto de palabras!");
        HashSet<String> conjuntoDePalabras = new HashSet<>();
        conjuntoDePalabras.add("pollo");
        conjuntoDePalabras.add("casa");
        conjuntoDePalabras.add("variable");
        conjuntoDePalabras.add("remera");

        // los hashsets NO admiten repetición de elementos
        for (int i = 0; i < 15; i++) {
            conjuntoDePalabras.add("casa");
        }

        for ( String palabra : conjuntoDePalabras) {
            System.out.println(palabra);
        }

        for (String conjuntoDePalabra : conjuntoDePalabras) {

        }

        for (int i = 0; i < conjuntoDePalabras.size(); i++) {

        }


    }


}
