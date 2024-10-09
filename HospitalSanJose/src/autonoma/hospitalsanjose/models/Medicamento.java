
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un medicamento
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public abstract class Medicamento {
    
    //Atributos//
    
    private String nombre;
    private String descripción;
    private ArrayList<Medicamento> medicamentos;
    
    //Constructor//

    public Medicamento(String nombre, String descripción) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.medicamentos = new ArrayList<>();
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

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    
    public abstract double getCosto();
    
    
    //CRUD medicamentos//
    public boolean agregarEmpleado(Medicamento medicamento){
        return this.medicamentos.add(medicamento);
    }
    
    public Medicamento buscarMedicamento(Medicamento medicamento){
        for(int i = 0;i < this.medicamentos.size(); i++){
            Medicamento medc = this.medicamentos.get(i);
            if (medc.equals(medicamento)){
               return medc;
            }
        }
        return null;
    }
    
   
    public Medicamento buscarMedicamentoNombre(String nombre){
        for (int i = 0; i < this.medicamentos.size(); i++){
            Medicamento medc = this.medicamentos.get(i);
            if (medc.getNombre().equals(nombre)){
                return medc;
            }
        }
        return null;
    }
    
    public Medicamento eliminarMedicamento(String nombre){
        Medicamento medi = this.buscarMedicamentoNombre(nombre);
        if (medi != null){
            medicamentos.remove(medi);
            return medi;
        }else {
            return null;
        }
    }
    
    public String mostrarArchivoEmpleados(){
        String archivomedc= "";
        for ( int i=0; i > this.medicamentos.size(); i++ ){
            Medicamento medc = this.medicamentos.get(i);
            archivomedc += archivomedc.toString() + "\n";
        }
        return archivomedc;
    }
    
    //Metodos//
    @Override
    public String toString(){
        return "Medicamento: " + "\n" +
               "Nombre: " + nombre + "\n" + 
               "Descripción: " + descripción + "\n";
    }
    
    public abstract double calcularVenta();
    
}
