package apps;

import java.util.Scanner;

public class Npares {

    public static void main(String[] args) {

        Scanner ingresoNumN = new Scanner(System.in);
        System.out.println("Ingrese un número natural");
        int n = ingresoNumN.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
    }
}
