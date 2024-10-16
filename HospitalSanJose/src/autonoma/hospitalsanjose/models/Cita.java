
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo modela las caracteristicas de una cita medica
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Cita {
    
    //Atributos//
    
    private Paciente paciente;
    private EmpleadoAreaSalud medicoConsulta;
    private String fechaConsulta;
    private double valorConsulta;
    
    //Constructor//

    public Cita(Paciente paciente, EmpleadoAreaSalud medicoConsulta, String fechaConsulta, double valorConsulta) {
        this.paciente = paciente;
        this.medicoConsulta = medicoConsulta;
        this.fechaConsulta = fechaConsulta;
        this.valorConsulta = valorConsulta;
    }
    
    //Metodos get y set//

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public EmpleadoAreaSalud getMedicoConsulta() {
        return medicoConsulta;
    }

    public void setMedicoConsulta(EmpleadoAreaSalud medicoConsulta) {
        this.medicoConsulta = medicoConsulta;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    
    //Metodos//
    public String toString(){
        return "Cita: " + "\n" +
               "Paciente: " + paciente + "\n" +
               "Medico: " + medicoConsulta + "\n" +
               "Fecha conculta: " + fechaConsulta + "\n" +
               "Valor consulta: " + valorConsulta + "\n";
               
    }
}
