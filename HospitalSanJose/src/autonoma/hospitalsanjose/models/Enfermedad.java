
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo modela la caracteristicas de una enfermedad
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Enfermedad {
    
    //Atributos//
    
    private String nombre;
    private String descripción;
    
    //Constructor//

    public Enfermedad(String nombre, String descripción) {
        this.nombre = nombre;
        this.descripción = descripción;
    }
    
    //Metodos get y set//

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
    
    //Metodos//
    public String toString(){
        return "Enfermedad: " + "\n" +
               "Nombre: " + nombre + "\n" +
               "Descripción: " + descripción + "\n";
    }
    
    
}
