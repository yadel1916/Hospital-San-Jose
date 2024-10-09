package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo modelas las caracteriticas de el medicamento propio de los pacientes
 * @author Andres Rodriguez
 */
public class MedicamentoPaciente {
    
    //Atributos//
    private String nombre;
    private String descripción;
    private String enfermedadCurada;
    
    
    //Constructor//

    public MedicamentoPaciente(String nombre, String descripción, String enfermedadCurada) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.enfermedadCurada = enfermedadCurada;
    }
    
    
    //Metodos de acceso o modificadores//

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

    public String getEnfermedadCurada() {
        return enfermedadCurada;
    }

    public void setEnfermedadCurada(String enfermedadCurada) {
        this.enfermedadCurada = enfermedadCurada;
    }
    
    
    //Metodo//
    public String toString(){
        return "Medicamento Paciente" + "\n" +
               "Nombre Medicamento: " + nombre + "\n" + 
               "Descripción: " + descripción + "\n" +
               "Enfermedad Curada: " + enfermedadCurada + "\n";
    }
    
    
}
