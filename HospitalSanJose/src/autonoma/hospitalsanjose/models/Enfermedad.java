
package autonoma.hospitalsanjose.models;

/**
 * la clase Enfermedad se refiere a la enfermedad que podrá tener cada paciente.
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 2024 09 10
 */
public class Enfermedad {
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre de la enfermedad.
    */
    private String nombre;
    
    /**
    * el atributo descripción de tipo String  tiene la descripción de la enfermedad.
    */
    private String descripción;
    
    /////////////////////////////////////// CONSTRUCTOR //////////////////////////////////////////////

    public Enfermedad(String nombre, String descripción) {
        this.nombre = nombre;
        this.descripción = descripción;
    }
    
    ///////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////////7

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    ///////////////////////////////////// METODOS /////////////////////////////////////////////////
    public String toString(){
        return "Enfermedad: " + "\n" +
               "Nombre: " + nombre + "\n" +
               "Descripción: " + descripción + "\n";
    }
    
    
}
