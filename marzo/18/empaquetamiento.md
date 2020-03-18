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
