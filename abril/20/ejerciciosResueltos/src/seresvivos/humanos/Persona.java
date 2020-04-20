package seresvivos.humanos;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private int tel;
    private String direccion;
    private String ocupacion;

    public Persona() {
        this.nombre = "Roberto";
        this.apellido = "Equis";
        this.edad = 22;
        this.dni = 42111444;
        this.tel = 12123434;
        this.direccion = "Av. Gaona 1234";
    }

    public Persona(String nombre, String apellido, int edad, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public Persona(String nombre, int edad, int dni, int tel, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.tel = tel;
        this.direccion = direccion;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

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

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int tel) {
        this.tel = tel;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor = this.edad >= 18;
        return esMayor;
    }

    public boolean esIgualA(Persona p){
        boolean sonIguales = this.nombre == p.getNombre() &&
                             this.edad == p.getEdad() &&
                             this.dni == p.getDni() &&
                             this.tel == p.getTelefono() &&
                             this.direccion == p.getDireccion();
        return sonIguales;
    }

    public boolean tienenLaMismaEdad(Persona p){
        boolean edadesIguales = this.edad == p.getEdad();
        return edadesIguales;
    }

    /*
     El método main puede ser implementado en cualquier clase que creemos.
     Se ejecutará sólo lo que está dentro del mismo.
    */
    public static void main(String[] args) {

        //3 instancias
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();


        System.out.println("-------------------------------------------");
        System.out.println("Edad actual de p1: " + p1.getEdad());

        //duplico la edad de p1
        int edadP1 = p1.getEdad();
        p1.setEdad(edadP1 * 2);
        System.out.println("Edad después del cambio: " + p1.getEdad());

        /* otra forma:
            p1.setEdad(p.getEdad() * 2);
        */

        System.out.println("-------------------------------------------");
        System.out.println("Teléfono actual de p2: " + p2.getTelefono());

        //cambio de número telefónico
        p2.setTelefono(98987676);
        System.out.println("Edad después del cambio: " + p2.getTelefono());



        System.out.println("-------------------------------------------");
        //impresión de datos de la tercer persona
        System.out.println("datos de la tercer instancia creada");
        System.out.println("nombre: " + p3.getNombre());
        System.out.println("edad: " + p3.getEdad());
        System.out.println("dni: " + p3.getDni());
        System.out.println("tel.: " + p3.getTelefono());
        System.out.println("dirección: " + p3.getDireccion());

    }

    public Persona impirmirThis(){
        return this;
    }
}
