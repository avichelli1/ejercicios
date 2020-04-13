#### For each

Es otro tipo de ```for``` que, a comparación del for que venimos usando,
no tiene la típica variable que se usa para el índice.

Este tipo de for se utiliza para recorrer colecciones. 
Especialmente para recorrer colecciones con elementos
que no tienen asociado un índice. Por ejemplo, los ```sets```, que veremos
más adelante. Además, recorre *todos* los elementos de izquierda a derecha.


Veamos cómo usar un ```for each``` para recorrer un ArrayList.

```java

ArrayList<Integer> enteros = new ArrayList();

        enteros.add(3);
        enteros.add(2);
        enteros.add(1);
        enteros.add(4);

        for ( Integer numero : enteros ) {
            System.out.println(numero);
        }

		    int suma = 0;
        for ( Integer numero : enteros ) {
            suma = suma + numero;
        }
```

Veamos con detenimiento las 3 secciones que componen a este tipo de ```for```:


```java

for ( sector1 : sector2 ) {
           sector3
}

```
#### Sector 1:
En este sector se crea una variable que nos servirá como variable auxiliar.
En cada iteración, esta variable pasará a "guardar" el valor correspondiente 
al elemento de la colección.

Es decir, teniendo en cuenta al arraylist llamado "enteros",
en la primera iteración, la variable ```numero``` guardará el valor 3
en la segunda iteración, la variable ```numero``` guardará el valor 2
en la tercera iteración, la variable ```numero``` guardará el valor 1
en la cuarta iteración, la variable ```numero``` guardará el valor 4

#### Sector 2:
Aquí se escribe el nombre de la colección a recorrer.

#### Sector 3:
En este sector se debe colocar lo que queremos que hagan con la
variable ```numero```.
En el ejemplo, se decidió imprimir el valor que guarda dicha variable.

Teniendo en cuenta el ejemplo, lo que se imprime por consola es:
```
3
2
1
4
```

El segundo ```foreach``` imprime el número diez. 
