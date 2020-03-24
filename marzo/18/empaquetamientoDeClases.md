### Empaquetamiento, organización de clases.

```java
package
```
* la palabra ``` package ``` es una palabra reservada para indicar 
donde está ubicada una clase con respecto a la/s carpeta/s donde
fue guardada.
* tal indicación se escribe en la primer línea

#### Ejemplo 1:
La carpeta llamada "clases" contiene la clase Persona.java.
Entonces, la clase "Persona.java" tendrá como primer línea 
lo siguiente
```java
package clases;
```
#### La clase:
```java
package clases;

public class Persona{

    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
```

#### Ejemplo 2:
La carpeta llamada "clases" contiene una carpeta llamada "seresvivos".
Y la carpeta "seresvivos" contiene la clase "Leon.java".
Entonces, la primer línea de dicha clase sería:
```java
package clases.seresvivos;
```
#### La clase:
```java
package clases.seresvivos;

public class Leon {
    private String nombre;
    private float peso;

    public Leon(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
```

#### Ejemplo 3:
La carpeta llada "clases" contiene una carpeta llamada "seresvivos",
la carpeta "seresvivos" contiene una carpeta llamada "animales" y 
la carpeta "animales" contiene la *clase* llamada "Leon.java".
Entonces, la primer línea de dicha clase sería:
```java
package clases.seresvivos.animales;
```
#### La clase:
```java
package clases.seresvivos.animales;

public class Leon {
    private String nombre;
    private float peso;

    public Leon(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
```
### A tener en cuenta:
* Los nombres de los paquetes siempre se escriben en minúsculas.
* Los nombres de las clases siempre deben empezar con letra mayúscula.

### Formas de crear los paquetes

#### Forma 1 (con IntelliJ)
1. Abrir proyecto creado con la IDE
2. click derecho, seleccionar "new"
3. luego, seleccionar "package" e ingresar el nombre del paquete
4. escribir ```package``` y su respectiva ubicación 
en las clases pertenecientes al nuevo paquete

##### Posible inconveniente con IntelliJ:
Tal vez, al usar la IDE, se les presente el problema de cómo crear más de un paquete
dentro de un paquete ya creado.
A modo de ejmplo, describiré los pasos para crear dos paquetes llamados ```carnivoros```
y ```herbivoros```, dentro del paquete llamado ```animales```.
Los pasos para hacerlo son:
1. crear el paquete ```animales``` usando la forma 1.
2. click derecho en el paquete creado
3. click en "new"
4. click en package
Se desplegará un campo que tendrá escrito lo siguiente: ```animales.```.
5. sin borrar nada, agregar la palabra ```carnivoros``` y apretar la tecla enter.
Notarán que les quedó un paquete llamado ```animales.carnivoros```
6. para crear al segundo paquete dentro de ```animales```, click derecho
en ```animales.carnivoros```
7. elegir la opción "new" y luego la opción "package"
Se desplegará un campo que tendrá escrito lo siguiente: ```animales.carnivoros```.
8. borrar del campo la palabra  ```carnivoros``` y agregar la palabra ```herbivoros```.
Apretar la recla enter y luego verán que tendrán creados los paquetes como queríamos.

#### Forma 2 (con IntelliJ)
1. crear la clase en la carpeta "src"
2. escribir la sentencia ```package``` con su respectiva ubicación
en la línea 1 del archivo correspondiente a la clase
3. esperar a que la línea se subraye en rojo
4. colocar el cursor en dentro de la/s palabra/s subrayadas
5. apretar alt + enter
6. seleccionar la opción "move to package ..." y se crearán la/s
carpetas o paquetes de forma automática

#### Forma 3 (sin IntelliJ)
1. Desde el explorador de archivos, crear las carpetas una por una
según la organización deseada. 
2. Y colocar en todas las clases su correspondiente sentencia
```package``` más la ubicación que le corresponde a la clase.


