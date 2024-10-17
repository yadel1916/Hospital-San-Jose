
package autonoma.hospitalsanjose.models;

/**
 * la clase Cita, tendrá las carácteristicas de la cita.
 * @author Katherin Monroy
 * @version 1.0.0
 * @since 2024 17 10
 */
public class Cita {
    
    /**
    * el atributo paciente de tipo Paciente  se refiere al paciente que tensrá la cita.
    */
    private Paciente paciente;
    
    /**
    * el atributo medicoConsulta de tipo EmpleadoAreaSalud  se refiere al medico que atenderá la cita.
    */
    private EmpleadoAreaSalud medicoConsulta;
    
    /**
    * el atributo fechaConsulta de tipo String  se refiere a la fecha de la cita.
    */
    private String fechaConsulta;
    
    /**
    * el atributo valorConsulta de tipo double  se refiere al valor de la cita.
    */
    private double valorConsulta;
    
    ////////////////////////////////////////////CONSTRUCTOR//////////////////////////////////////////////

    public Cita(Paciente paciente, EmpleadoAreaSalud medicoConsulta, String fechaConsulta, double valorConsulta) {
        this.paciente = paciente;
        this.medicoConsulta = medicoConsulta;
        this.fechaConsulta = fechaConsulta;
        this.valorConsulta = valorConsulta;
    }
    
    /////////////////////////////////////////////// METODOS DE ACCESO //////////////////////////////////////

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
    
    
   /////////////////////////////////////////////////// METODOS /////////////////////////////////////////////
    public String toString(){
        return "Cita: " + "\n" +
               "Paciente: " + paciente + "\n" +
               "Medico: " + medicoConsulta + "\n" +
               "Fecha conculta: " + fechaConsulta + "\n" +
               "Valor consulta: " + valorConsulta + "\n";
               
    }
}
