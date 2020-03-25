#### Clase Scanner

Es una clase que nos provee la funcionalidad de poder ingresar
valores (string, boolean, int, float, etc) mediante el teclado.

Esta clase ya está implementada y nos la provee la biblioteca estándar
de Java. Pueden ver los métodos que nos provee en [esta página](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html).

Para poder realzar ingresos por consola, primero es necesario importar la clase
declarando la sentencia en la clase donde se utilizará:

```java
import java.util.Scanner;
```

Luego, es necesario crear un objeto de la clase Scanner:
```java
Scanner ingreso = new Scanner(System.in);
```
#### Ingreso de strings:
Usaremos el objeto ```ingreso``` y el método ```nextLine()``` para poder
ingresar un string por teclado. 

```java
String stringIngresado = ingreso.nextLine();
```

#### Ingreso de números enteros:
Usaremos el objeto ```ingreso``` y el método ```nextInt()``` para poder
ingresar un número entero por teclado.

```java
int enteroIngresado = ingreso.nextInt();
```

#### Ingreso de números reales:
Usaremos el objeto ```ingreso``` y el método ```nextFloat()``` para poder
ingresar un número real por teclado.

```java
float realIngresado = ingreso.nextFloat();
```
##### comentario:
Al ingresar el número real, no se puede usar el ```.``` como sustituto de la coma. 

#### Ejemplo:
Lo siguiente es una aplicación que sirve para ingresar un string,
un int y un float por consola. Les recomiendo ejecutarlo para experimentar
y ver cómo funciona.

```java
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String textoIngresado = ingreso.nextLine();
        System.out.println("En texto que ha ingresado es: " + textoIngresado);

        System.out.println("---------------------------------------------------");

        System.out.println("Ingrese un número entero");
        int enteroIngresado = ingreso.nextInt();
        System.out.println("el número entero que ha ingresado es: " + enteroIngresado);

        System.out.println("---------------------------------------------------");

        System.out.println("Ingrese un número real");
        float realIngresado = ingreso.nextFloat();
        System.out.println("el número real que ha ingresado es: " + realIngresado);

        System.out.println("----------------------------------------------------");

    }
}

