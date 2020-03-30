package sistemas.administracion.comercios;

import java.util.ArrayList;

public class ProductoAlimenticio {

    private String nombre;
    private float precio;
    private String fechaDeElaboracion;
    private String fechaDeVencimiento;
    private float peso;

    public ProductoAlimenticio() {
        this.nombre = "arroz";
        this.precio = 12.50f;
        this.fechaDeElaboracion = "12/03/2019";
        this.fechaDeVencimiento = "12/09/2021";
        this.peso = 1.00f;
    }

    public ProductoAlimenticio(String nombre, float precio, String fechaDeElaboracion, String fechaDeVencimiento, float peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaDeElaboracion = fechaDeElaboracion;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFechaDeElaboracion() {
        return fechaDeElaboracion;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFechaDeElaboracion(String fechaDeElaboracion) {
        this.fechaDeElaboracion = fechaDeElaboracion;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean pesaMasDe5Kg(){
        return this.peso >= 5;
    }

    /* Si la fecha actual es el día de vencimiento, retornará false. */
    public boolean esProductoVencido(String fechaActual){

        int anioDeVencimiento = this.extraerAnio(fechaDeVencimiento);
        int mesDeVencimiento = this.extraerMes(fechaDeVencimiento);
        int diaDeVencimiento = this.extraerDia(fechaDeVencimiento);

        int anioActual = this.extraerAnio(fechaActual);
        int mesActual = this.extraerMes(fechaActual);
        int diaActual = this.extraerDia(fechaActual);

        boolean estaVencido = anioActual > anioDeVencimiento ||
                              anioActual == anioDeVencimiento && mesActual > mesDeVencimiento ||
                              anioActual == anioDeVencimiento && mesActual == mesDeVencimiento &&  diaActual > diaDeVencimiento;

        return estaVencido;
    }

    //métodos auxiliares
    public int extraerAnio(String fecha){
        String anioString = "" + fecha.charAt(6) + fecha.charAt(7) +
                                 fecha.charAt(8) + fecha.charAt(9);
        int anio = parseStringToInt(anioString);
        return anio;
    }

    public int extraerMes(String fecha){
        String mesString = "" + fecha.charAt(3) + fecha.charAt(4);
        int mes = parseStringToInt(mesString);
        return mes;
    }

    public int extraerDia(String fecha){
        String diaString = "" + fecha.charAt(0) + fecha.charAt(1);
        int dia = parseStringToInt(diaString);
        return dia;
    }

    public int parseCharToInt(char numeroComoChar){
        int numeroCorrespondiente = 0;
        switch (numeroComoChar){
            case '0':
                numeroCorrespondiente = 0;
                break;
            case '1':
                numeroCorrespondiente = 1;
                break;
            case '2':
                numeroCorrespondiente = 2;
                break;
            case '3':
                numeroCorrespondiente = 3;
                break;
            case '4':
                numeroCorrespondiente = 4;
                break;
            case '5':
                numeroCorrespondiente = 5;
                break;
            case '6':
                numeroCorrespondiente = 6;
                break;
            case '7':
                numeroCorrespondiente = 7;
                break;
            case '8':
                numeroCorrespondiente = 8;
                break;
            case '9':
                numeroCorrespondiente = 9;
        }
        return numeroCorrespondiente;
    }

    public int obtenerAnioComoInt(int m, int c, int d, int u){
        int anio = m * 1000 + c * 100 + d * 10 + u;
        return anio;
    }

    public int obtenerMesODiaComoInt(int d, int u){
        int mes = d * 10 + u;
        return mes;
    }

    public int parseStringToInt(String numeroComoString){
        ArrayList<Integer> numeros = new ArrayList<>();
        int numeroConvertido = 0;

        for (int i = 0; i < numeroComoString.length(); i++) {
            char numeroComoChar = numeroComoString.charAt(i);
            int numero = parseCharToInt(numeroComoChar);
            numeros.add(numero);
        }

        numeroConvertido = parseArrayToInt(numeros);
        return numeroConvertido;
    }

    public int parseArrayToInt(ArrayList<Integer> numeros){
        int cantidadDeNumeros = numeros.size();
        int numeroBuscado = 0;

        if (cantidadDeNumeros == 4){
            numeroBuscado = obtenerAnioComoInt(numeros.get(0),numeros.get(1),numeros.get(2),numeros.get(3));
        }else{
            numeroBuscado = obtenerMesODiaComoInt(numeros.get(0),numeros.get(1));
        }
        return numeroBuscado;
    }

    public static void main(String[] args) {

        ProductoAlimenticio p = new ProductoAlimenticio();
        p.setFechaDeVencimiento("24/06/2020");

        System.out.println(true == p.esProductoVencido("25/06/2020"));
        System.out.println(true == p.esProductoVencido("25/07/2021"));

        System.out.println(true == p.esProductoVencido("22/06/2022"));
        System.out.println(true == p.esProductoVencido("22/07/2021"));

        System.out.println(true == p.esProductoVencido("25/05/2022"));
        System.out.println(true == p.esProductoVencido("25/04/2021"));

        System.out.println(true == p.esProductoVencido("22/05/2022"));
        System.out.println(true == p.esProductoVencido("22/04/2021"));

        System.out.println("-----------------------------------------------");

        System.out.println(false == p.esProductoVencido("24/06/2020"));

        System.out.println(false == p.esProductoVencido("25/06/2019"));
        System.out.println(false == p.esProductoVencido("25/07/2018"));

        System.out.println(false == p.esProductoVencido("22/06/2019"));
        System.out.println(false == p.esProductoVencido("22/07/2018"));

        System.out.println(false == p.esProductoVencido("25/05/2020"));
        System.out.println(false == p.esProductoVencido("25/04/2019"));

        System.out.println(false == p.esProductoVencido("22/05/2020"));
        System.out.println(false == p.esProductoVencido("22/04/2019"));

    }
}
