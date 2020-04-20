package sistemas.administracion.registros;

import java.util.Scanner;

public class RegistroDeProductos {

    public static void main(String[] args) {

        float decimal = 3.14f;

        Scanner ingresoPrecio = new Scanner(System.in);
        System.out.println("Ingrese precio");
        float precio = ingresoPrecio.nextFloat();

        Scanner ingresoNombre = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto");
        String nombreProducto = ingresoNombre.nextLine();

        Scanner ingresoMarca = new Scanner(System.in);
        System.out.println("Ingrese marca");
        String marca = ingresoMarca.nextLine();

        Scanner ingresoUnidades = new Scanner(System.in);
        System.out.println("Ingrese unidades");
        int unidades = ingresoUnidades.nextInt();

    }

}
