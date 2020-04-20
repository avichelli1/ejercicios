package apps;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner ingresoNumero = new Scanner(System.in);
        int stop = 0;
        int suma = 0;

        while (stop != -1){

            suma = suma + stop;
            System.out.println("Ingrese un número");
            stop = ingresoNumero.nextInt();

        }

        System.out.println("La suma obtenida es: " + suma);
    }
}
