package sistemas.administracion.registros;

import java.util.Scanner;

public class RegistroDeDatos {

    public static void main(String[] args) {

        Scanner ingresoNombre = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = ingresoNombre.nextLine();

        Scanner ingresoApellido = new Scanner(System.in);
        System.out.println("Ingrese apellido");
        String apellido = ingresoApellido.nextLine();

        Scanner ingresoEdad = new Scanner(System.in);
        System.out.println("Ingrese edad");
        int edad = ingresoEdad.nextInt();

        Scanner ingresoOcupacion = new Scanner(System.in);
        System.out.println("Ingrese ocupación");
        String ocupacion = ingresoOcupacion.nextLine();

    }

}
