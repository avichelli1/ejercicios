package sistemas.administracion.salud;

import seresvivos.humanos.Persona;
import java.util.ArrayList;

public class Hospital {

    private String nombre;
    private ArrayList<Persona> pacientesPorAtender;
    private ArrayList<Persona> pacientesSiendoAtendidos;
    private ArrayList<Persona> pacientesAtendidos;
    private ArrayList<Persona> doctoresDeTurno;
    private int camasDisponibles;

    public Hospital() {
        this.nombre = "Hospital Gutierrez";
        this.pacientesPorAtender = new ArrayList<>();
        this.pacientesSiendoAtendidos = new ArrayList<>();
        this.pacientesAtendidos = new ArrayList<>();
        this.doctoresDeTurno = new ArrayList<>();
        this.camasDisponibles = 245;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPacientesPorAtender(ArrayList<Persona> pacientesPorAtender) {
        this.pacientesPorAtender = pacientesPorAtender;
    }

    public void setPacientesSiendoAtendidos(ArrayList<Persona> pacientesSiendoAtendidos) {
        this.pacientesSiendoAtendidos = pacientesSiendoAtendidos;
    }

    public void setPacientesAtendidos(ArrayList<Persona> pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public void setDoctoresDeTurno(ArrayList<Persona> doctoresDeTurno) {
        this.doctoresDeTurno = doctoresDeTurno;
    }

    public void setCamasDisponibles(int camasDisponibles) {
        this.camasDisponibles = camasDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Persona> getPacientesPorAtender() {
        return pacientesPorAtender;
    }

    public ArrayList<Persona> getPacientesSiendoAtendidos() {
        return pacientesSiendoAtendidos;
    }

    public ArrayList<Persona> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public ArrayList<Persona> getDoctoresDeTurno() {
        return doctoresDeTurno;
    }

    /* método que indique el número de camas disponibles en el hospital */
    public int getCamasDisponibles() {
        return camasDisponibles;
    }

    /* método que retorna la cantidad total de pacientes atendidos */
    public int getCantidadPacientesAtendidos(){
        int cantidad = this.pacientesAtendidos.size();
        return cantidad;
    }

    /* método que retorne el nombre, apellido y edad de los pacientes
       que están siendo atendidos actualmente */
    public String getInformacionDePacientesSiendoAtendidos(){

        String infoDeTodosLosPacientes = "";

        for (int i = 0; i < this.pacientesSiendoAtendidos.size(); i++) {

            Persona paciente = this.pacientesSiendoAtendidos.get(i);
            String infoPaciente = "Nombre completo: " + paciente.getNombre() + "\n";
            infoPaciente += "Edad: " + paciente.getEdad() + "\n\n";

            infoDeTodosLosPacientes += infoPaciente;

        }
        return infoDeTodosLosPacientes;
    }

    /* método que agregue nuevos pacientes por atender */
    public void agregarPacientePorAtender(Persona paciente){
        this.pacientesPorAtender.add(paciente);
    }

    /* método que elimine pacientes atendidos de la lista "pacientes por atender" */
    public void actualizarListaPacientesPorAtender(){
        for (int i = 0; i < this.pacientesAtendidos.size(); i++) {
            Persona pacienteAtendido = this.pacientesAtendidos.get(i);
            for (int j = 0; j < this.pacientesPorAtender.size(); j++) {
                Persona pacientePorAtender = this.pacientesPorAtender.get(i);
                if (pacientePorAtender.esIgualA(pacienteAtendido)){
                    this.pacientesPorAtender.remove(pacientePorAtender);
                }
            }
        }
    }

    /* método para agregar pacientes atendidos a la lista "pacientes atendidos" */
    public void agregarPacienteAtendido(Persona paciente){
        this.pacientesAtendidos.add(paciente);
    }

}
