package apps;

import java.util.Scanner;

public class NumeroMasGrande {

    public static void main(String[] args) {

        Scanner ingresoNum1 = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = ingresoNum1.nextInt();

        Scanner ingresoNum2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo número");
        int num2 = ingresoNum2.nextInt();

        if ( num1 > num2 ){
            System.out.println("El número más grande es: " + num1);
        }else if (num1 == num2 ){
            System.out.println("Los números son iguales.");
        }else{
            System.out.println("El número más grande es: " + num2);
        }

    }


}
