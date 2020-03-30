package sistemas.administracion.comercios;

import seresvivos.humanos.Persona;

public class OrdenDeCompra {

    private String fecha;
    private String hora;
    private float importeApagar;
    private Persona cliente;
    private int cantidadDeProductos;
    private String formaDePago;

    public OrdenDeCompra() {
        this.fecha = "24/3/2019";
        this.hora = "7:00";
        this.importeApagar = 0.00f;
        this.cliente = new Persona();
        this.cantidadDeProductos = 0;
        this.formaDePago = "tarjeta de débito";
    }

    public OrdenDeCompra(String fecha, String hora, float importeApagar, Persona cliente, int cantidadDeProductos, String formaDePago) {
        this.fecha = fecha;
        this.hora = hora;
        this.importeApagar = importeApagar;
        this.cliente = cliente;
        this.cantidadDeProductos = cantidadDeProductos;
        this.formaDePago = formaDePago;
    }

    public boolean compraMenosDe255Productos(){
        boolean menosDe255 = this.cantidadDeProductos < 255;
        return menosDe255;
    }

    public boolean abonaEnEfectivo(){
        boolean enEfectivo = this.formaDePago == "efectivo";
        return enEfectivo;
    }
}
