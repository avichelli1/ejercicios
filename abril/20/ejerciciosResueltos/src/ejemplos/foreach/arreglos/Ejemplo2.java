package ejemplos.foreach.arreglos;

import java.util.ArrayList;

public class Ejemplo2 {

    public static void main(String[] args) {

        ArrayList<Float> decimales = new ArrayList();
        decimales.add(1.23f);
        decimales.add(2.345f);
        decimales.add(3.2f);
        decimales.add(4.2232f);

        System.out.println("Usando Float... ");

        for (Float unDecimal : decimales ) {
            System.out.println(unDecimal);
        }


        float suma = 0;

        for ( float unDecimal : decimales ) {
            suma = suma + unDecimal;
        }

        System.out.println("la suma total es: " + suma);

    }
}
