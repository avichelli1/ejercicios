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

#### Ejemplo 2:
La carpeta llamada "clases" contiene una carpeta llamada "seresvivos".
Y la carpeta "seresvivos" contiene la clase "Leon.java".
Entonces, la primer línea de dicha clase sería:
```java
package clases.seresvivos;
```

#### Ejemplo 3:
La carpeta llada "clases" contiene una carpeta llamada "seresvivos",
la carpeta "seresvivos" contiene una carpeta llamada "animales" y 
la carpeta "animales" contiene la *clase* llamada "Leon.java".
Entonces, la primer línea de dicha clase sería:
```java
package clases.seresvivos.animales;
```

### Formas de crear los paquetes

#### Forma 1 con IntelliJ
1. Abrir proyecto creado con la IDE
2. click derecho, seleccionar "new"
3. luego, seleccionar "package" e ingresar el nombre del paquete
4. escribir ```package``` y su respectiva ubicación 
en las clases pertenecientes al nuevo paquete

#### Forma 2 con IntelliJ
1. crear la clase en la carpeta "src"
2. escribir la sentencia ```package``` con su respectiva ubicación
en la línea 1.
3. esperar a que la línea se subraye en rojo
4. colocar el cursor en dentro de la/s palabra/s subrayadas
5. apretar alt + enter
6. seleccionar la opción "move to package ..." y se crearán la/s
carpetas o paquetes de forma automática

#### Forma 3 sin IntelliJ
1. Desde el explorador de archivos, crear las carpetas una por una
según la organización deseada. 
2. Y colocar en todas las clases su correspondiente sentencia
```package``` más la ubicación que le corresponde a la clase.


