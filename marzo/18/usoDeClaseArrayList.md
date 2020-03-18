### Usos de la clase ArrayList
Cada instancia de la clase ArrayList tiene un comportamiento similar
a los vectores que vieron el año pasado.

En ésta materia, los vamos a utlizar para representar listas ordenadas de 
cualquier tipo de Objeto. Por ejemplo: Personas, Productos, Animales, etc.

En la siguiente línea se crea una lista de Personas. 
El tipo de elementos que contendrá la lista es especificada entre los símbolos ```< > ```
```java
ArrayList<Persona> listaDePersonas = new ArrayList<>();

ArrayList<Producto> listaDeProductos = new ArrayList<>();
```

##### Observaciones:
* Al usar el operador ```new```, no es necesario colocar la especificación del 
tipo de dato que contendrá.

* "Ordenadas" porque las cosas pertenecientes a la lista tendrán un orden dado
por el índice que le corresponde.

* La API nos provee 3 tipos de constructores para esta clase. Pero por el 
momento sólo utilizaremos el constructor por defecto.

#### Ejemplo de uso:

Veamos un ejemplo donde usamos la clase ArrayList para representar a 
una lista de personas.


```java

packages banco.componentes;
import java.util.ArratList;

public class FilaParaCaja {

  private int numeroDeCaja;
  private ArrayList<Persona> clientes;
  private String nombreDelCajero;
  
  public FilaParaCaja(int numeroDeCaja, String nombreDelCajero) {
    this.numeroDeCaja = numeroDeCaja;
    this.nombreDelCajero = nombreDelCajero;
  }
  
  ...
  
}
  

```

#### Métodos más utilizados:
```java
  ArrayList<Persona> listaDePersonas = new ArrayList<>();
  Persona p1 = new Persona();
  Persona p2 = new Persona();
  Persona p3 = new Persona();
```

* Agregar elementos a la lista:
```java
listaDePersonas.add(p1);
listaDePersonas.add(p2);
```
* borrar elemento de la lista. Se pasa como parámetro el índice 
correspondient al elemento a borrar.
```java
listaDePersonas.remove(1);
```
##### Comentario:
Se ha eliminado a "p2" pues se encontraba en la posición nro. 2 
correspondiente al índice 1.

* método que retorna el tamaño del arraylist
```java
listaDePersonas.size();
```
* cambiar valor existente en el arraylist. 
Primer parámetro: índice correspondiente al elemento a reemplazar.
Segundo parámetro: elemento que será insertado en el arraylist.
```java
listaDePersonas.set(1,p3);
```
* eliminar todos los elementos del arraylist:
```java
listaDePersonas.clear();
```

* método que retorna ```true```si el arraylist está vacío y
retorna ```false``` si el arraylist tiene al menos un elemento.
```java
listaDePersonas.isEmpty();
```



