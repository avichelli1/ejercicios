package sistemas.administracion.registros;

import seresvivos.humanos.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroDeDatos {

    public static void main(String[] args) {

        ArrayList<Persona> personasRegistradas = new ArrayList<>();

        boolean registrarDatos = true;

        System.out.println("Bienvenido al sistema de registro de datos personales.");
        System.out.println("Nuevo registro: \n");

        while (registrarDatos) {

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

            Persona nuevosDatos = new Persona(nombre,apellido,edad,ocupacion);
            personasRegistradas.add(nuevosDatos);
            System.out.println("La registración ha sido un éxito!\n");

            Scanner ingresoDeOpcion = new Scanner(System.in);
            System.out.println("Quiere realizar un nuevo registro?");
            System.out.println("ingrese una opción: si / no ");
            String opcion = ingresoDeOpcion.nextLine();

            opcion = opcion.toLowerCase();

            if (opcion.equals("si")) {
                System.out.println("ok! \n");
                registrarDatos = true;
            }else {
                System.out.println("Bye!");
                registrarDatos = false;
            }
        }
    }
}
