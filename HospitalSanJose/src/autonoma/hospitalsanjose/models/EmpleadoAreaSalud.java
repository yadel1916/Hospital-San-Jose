
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo hereda las caracteristicas de un Empleado
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class EmpleadoAreaSalud extends Empleado {
    
    //Atributos//
    private String especialidad;
    private int numHoraTrabajo;
    private double salario;
    
    
    //Constructor//

    public EmpleadoAreaSalud(String especialidad, int numHoraTrabajo, String nombre, String numeroDocumento, String edad,double salarioBase, int id) {
        super(nombre, numeroDocumento, edad,salarioBase,id);
        this.especialidad = especialidad;
        this.numHoraTrabajo = numHoraTrabajo;
        this.salario = salarioBase;
    }
    
   
    
    //Metodos get set//

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumHoraTrabajo() {
        return numHoraTrabajo;
    }

    public void setNumHoraTrabajo(int numHoraTrabajo) {
        this.numHoraTrabajo = numHoraTrabajo;
    }

    public double getSalarioBase() {
        return salario;
    }

    public void setSalarioBase(double salario) {
        this.salario = salario;
    }
    
    //Metodo//
    @Override
    public  double calcularSalario(){
        return salario + ((salario * 1.2 ) * numHoraTrabajo );
    }
    
    public String toString(){
        return "Empleado Salud: " + "\n" + 
               "Especialida: " + especialidad + "\n" +
               "Numero de horas trabajadas: " + numHoraTrabajo + "\n" +
               "Salario base: " + salario + "\n" +
               "Salario: " + calcularSalario() + "\n" +
                super.toString() + "\n";
    }
    
}
