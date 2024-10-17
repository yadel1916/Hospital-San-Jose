
package autonoma.hospitalsanjose.models;

/**
 * la clase EmpleadoAreaSalud se convierte en la clase hija, la cual hereda atributos y metodos a las clase padre ( Empleado).
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 2024 09 10
 */
public class EmpleadoAreaSalud extends Empleado {
    
    
    /**
    * el atributo especialidad de tipo String  se refiere a la especialidad del empleado.
    */
    private String especialidad;
    
    /**
    * el atributo numeroHorasTrabajadas de tipo double  se refiere a las horas trabajadas del empleado.
    */
    private int numeroHorasTrabajadas;
    
    
    ////////////////////////////////////////// CONSTRUCTOR /////////////////////////////////////////////////

    public EmpleadoAreaSalud(String especialidad, int numHoraTrabajo, String nombre, String numeroDocumento, String edad,double salarioBase, int id) {
        super(nombre, numeroDocumento, edad,salarioBase,id);
        this.especialidad = especialidad;
        this.numeroHorasTrabajadas = numHoraTrabajo;
    }
    
   
    
    //////////////////////////////////////// METODOS DE ACCESO //////////////////////////////////////////

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumHoraTrabajo() {
        return numeroHorasTrabajadas;
    }

    public void setNumHoraTrabajo(int numHoraTrabajo) {
        this.numeroHorasTrabajadas = numHoraTrabajo;
    }

    
    ////////////////////////////////////////////// METODOS ///////////////////////////////////////////////////
    
    /**
    * el método toString devuelve  una cadena con todos los atributos deL empleado del area de la salud.
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    @Override
    
    public String toString(){
        return "Empleado Salud: " + "\n" + 
               "Especialidad: " + especialidad + "\n" +
               "Numero de horas trabajadas: " + numeroHorasTrabajadas + "\n" +
               "Salario: " + calcularSalario() + "\n" +
                super.toString() + "\n";
    }
    
    /**
    * el método calcularSalario calcula el salario del empleado
    * @param  no recibe parámetros.
    * @return retorna un double .
    */
    @Override
    public double calcularSalario(){
        return salarioBase + (salarioBase * 0.012 * numeroHorasTrabajadas); 
    }
}
