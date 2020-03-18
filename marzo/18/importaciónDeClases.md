### Clases provistas por la biblioteca estándar de Java
Actualmente existen muchas clases ya implmentadas y
listas para usarlas. Las mismas son parte de la llamada
"biblioteca estándar de Java" o también "application 
programming interface" (API).

Existe una página que contiene las especificaciones de cada
una de las clases provistas, es decir, la descripción de
cuál es la función, número y tipo de parámetrosde cada método 
perteneciente a cada una de las clases ya implementadas.

Se pueden ver [aquí](https://docs.oracle.com/javase/8/docs/api/).

##### Observación:
Noten que todas las clases están organizadas mediante el modo
de [empaquetamiento](https://github.com/labopoo/ejercicios/blob/master/marzo/18/empaquetamientoDeClases.md) descripto anteriormente.

### Importación de clases
Para importar una clase es necesario tener en cuenta la
ubicación de la misma.

#### Ejemplo:
Si queremos importar la clase llamada [ArrayList](https://docs.oracle.com/javase/8/docs/api/)
basta con saber dónde está ubicada.
La misma está ubicada dentro de la carpeta "util" y la carpeta "util" está dentro de la
carpeta "java". Entonces, para importarla debemos escribir lo siguiente:
```java
import java.util.ArrayList;
```
Tal línea se escribe luego de indicar el ```package``` correspondiente a la clase
que utlilizará la clase ArrayList.
