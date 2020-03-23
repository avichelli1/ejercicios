
#### Uso de ```this```
Recuerden que ```this``` es una palabra reservada del lenguaje
para referirse a la clase donde se encuentra escrita tal palabra.

##### Ejemplo 1:
```java
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
```
##### Observaciones:
* Vean que se usó ```this``` para diferenciar el uso entre la variable ```nombre```
ingresada como parámetro en el constructor y el atributo ```nombre``` de 
la clase Persona.
* Si no se hiciera tal distinción, no compilaría. Estamos en una situación
donde se debe utilizar ```this``` sí o sí pues la variable que ingresa como parámetro se llama igual que algún atributo.
* Una forma de evitar su uso en esta situación es asegurarse de que el nombre del atributo y el nombre de la variable que ingresa como parámetro, sean diferentes. Como muestro en el siguiente ejemplo.
```java
public class Persona {

    private String nombre;
    private int edad;
    
    public Persona(String nuevoNombre, int nuevaEdad){
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }
}
```

#### Ejemplo 2:
```java
public class Persona {

    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
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
    
    public boolean sonPersonasIguales(Persona p){
    
        boolean nombresIguales = this.nombre == p.getNombre();
        boolean edadesIguales = this.edad == p.getEdad();
        boolean sonIguales = nombresIguales && edadesIguales;
        
        return sonIguales;
    }
}
```
En éste ejemplo, veamos que tampoco es necesario utilizar la palabra reservada ```this```
pues no es necesario hacer ninguna distinción entre variables.

Por ello, el método también pudo haberse escrito así:
```java
    public boolean sonPersonasIguales(Persona p){
    
        boolean nombresIguales = nombre == p.getNombre();
        boolean edadesIguales = edad == p.getEdad();
        boolean sonIguales = nombresIguales && edadesIguales;
        
        return sonIguales;
    }
```
##### Comentario:
Una forma equivalente de escribir el método "sonIguales" es:
```java
    public boolean sonPersonasIguales(Persona p){
    
        boolean sonIguales = this.nombre == p.getNombre() && this.edad == p.getEdad();
        return sonIguales;
    }    
```

#### Ejemplo 3:
Veamos ahora un ejemplo donde se puede utilizar ```thispara invocar métodos definidos
en la misma clase.

```java
public class Persona {

    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
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
    
    public boolean sonPersonasIguales(Persona p){
    
        boolean nombresIguales = this.nombre == p.getNombre();
        boolean edadesIguales = this.edad == p.getEdad();
        boolean sonIguales = nombresIguales && edadesIguales;
        
        return sonIguales;
    }
    
    public boolean esMayorDeEdad(){
        
        boolean esMayor = this.getEdad() >= 18;
        return esMayor;
    }
}
```
* Vemos que en el método ```esMayorDeEdad()``` se realiza una invocación
o llamado al método ```getEdad()```, también implementado (definido) en la clase Persona, usando la palabra reservada ```this```. 
* Para realizar llamados a métodos implementados en la misma clase, el uso de la palabra reservada ```this``` es opcional.
* Una implementación equivalente al método ```esMayorDeEdad()```, es:
```java
    public boolean esMayorDeEdad(){

        boolean esMayor = this.getEdad() >= 18;
    -   return esMayor;
    }
}
```
