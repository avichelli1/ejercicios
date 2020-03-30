#### Variables primitivas
Así se denominan a las variables que son de los tipos:
```java
char, byte, short, int, long, float, double, boolean
```

#### Clases envolventes
Así se denominan a las clases cuyo comportamiento es casi 
idéntico a las variables primitivas. 

Existe una clase envolvente correspondiente a cada variable primitiva.

| Variable primitiva  | Clase envolvente correspondiente |
| ------------------- | -------------------------------- |
| int                 | Integer				             |
| boolean		      | Boolean					         |
| float 			  | Float 						     |
| byte                | Byte                             |
| short               | Short                            |
| long                | Long							 |
| double 			  | Double 							 |
| char 				  | Character 				         |


#### Colecciones
Son estructuras de datos que sirven para asociar y organizar objetos
según ciertas caracteristicas.

##### Ejemplos de colecciones del lenguaje Java:
```java ArrayList, Set, Map, Stack, Vector, Iterator, Queue, etc.```

Dichas clases sólo pueden usar clases envolventes en su definición.
Es decir que si se desea crear un ArrayList que almacene números
enteros, se debe definir de la siguiente forma:

```java
	ArrayList<Integer> numerosEnteros;
```

Si en vez de utilizar ```Integer```, se utilizar ```int`` verán que 
tendrán un error de compilación.








