### Cómo resolver los ejercicios de la materia?

1. Identificar los elementos relevantes involucrados, es decir, identificar
las personas, animales o cosas que están involucrados en el problema.

Este paso determinará qué clases crearán para resolver el problema.

En los problemas que vimos hasta ahora, hemos visto que se involucraban
personas, productos, compras, hotel, habitaciones, etc.

2. Identificar las características relevantes de los elementos involucrados, 
es decir, identificar los datos que nos sirven de los elementos en cuestión 
para resolver el problema. 
Este paso determinará los atributos de las clases.

Vimos que en algunos problemas, los atributos eran directamente pedidos
en el enunciado; en otros problemas que vimos y en los problemas futuros, 
tendrán que determinar qué elegir como atributo y qué no. 

Para hacerlo, tenemos que tener en cuenta que existen datos que podemos 
obtener de los atributos y éstos no necesariamente tienen que ser atributos también.

Por ejemplo, si a una clase llamada "Persona" le colocamos "edad" como atributo,
no será necesario colocarle el atributo "private boolean esMayorDeEdad" pues esta información
la podemos obtener a travéz de un método, utilizando el atributo "edad".

Lo que puede servir para identificar cómo elegir los atributos es
pensar que los atributos serían la información que nos dará el usuario
del sistema. Ésta información, es decir, éstos datos, serán almacenados
como atributos que pueden ser de tipos primitivos y/o pueden ser estructuras
de datos como los ArrayLists o HashSets.

Luego, nosotros debemos procesar esa información y otorgar nueva información de la 
recibida. Esto implica que en la aplicación que programaremos, crearemos los métodos 
necesarios para resolver el problema en cuestión y dichos métodos utilizarán la información
que les proveen los atributos ya sea para calcular información y/o para realizar
cambios en ellos.

3. Crear métodos necesarios para resolver el problema y proveer una aplicación
mantenible con código reutilizable y relativamente fácil de comprender.

En este punto, debemos tener en cuenta la relación de los elementos del
problema. En este contexto, nos referimos a las acciones de dar y recibir datos a
travéz de métodos. Dichos datos serán transmitidos de objeto a objeto con el propósito 
de cumplir determinadas tareas.

Notemos cómo organizamos las clases. Recordemos que podemos hacerlo de manera muy similar 
a la realidad. 

Por ejemplo, teniendo en cuenta el tp correspondiente a la temática "hotel" y el hecho
de que, en la realidad, un hotel tiene habitaciones y las habitaciones contienen a los huespedes, una
forma de organizar las clases sería:

```java
public class Hotel {
	ArrayList<Habitacion> habitaciones;
	...
}

```


```java
public class Habitacion {

	ArrayList<Huesped> huespedesPresentes;
	...
}

```


```java
public class Huesped {
	int edad;
	...
}

```


Y por ejemplo, si quisiéramos conocer si todos los huespedes tienen más de 18 años, 
podríamos utilizar la aiguiente implementación.


```java
public class Hotel {

	ArrayList<Habitacion> habitaciones;
	...

	public boolean todosLosHuespedesSonMayoresDeEdad(){
		for (Habitacion unaHabitacion : habitaciones ){
			...
			unaHabitacion.sonMayoresDeEdad();
			...
		}
	}
	...
}

```


```java
public class Habitacion {

	ArrayList<Huesped> huespedesPresentes;
	...
	public boolean sonMayoresDeEdad(){
		boolean sonMayoresDeEdad = true;
		for (Huesped unHuesped : huespedesPresentes ){
			if (sunHuesped.esMayorDeEdad() == true ){
				...
			}
		}
	}
	...
}

```


```java
public class Huesped {

	int edad;
	...

	public boolean esMayorDeEdad(){
		return edad >= 18;
	}

	...
}

```


* Notemos la relación entre los objetos de las clases y dónde se ubican los métodos.
Cada método es como un "pedido" de información. Y cada "pedido" puede ser realizado 
a ciertos objetos no a todos. Depende de qué información contiene cada clase.


#### Ejemplo:

``` todosLosHuespedesSonMayoresDeEdad() ```, es un pedido de información que le podemos hacer 
al hotel porque el hotel es quien contiene a toda la información de todos los huespedes.
Este pedido no podría realizarse a las habitaciones o al huesped pues éstos no contienen
la información suficiente para decirnos si tooodos los huespededs son mayores de edad.


