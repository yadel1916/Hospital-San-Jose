
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
    protected double costo; 
    protected double precioVenta; 
    
    
    
    //Constructor//

    public Medicamento(String nombre, String descripción, double costo) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.costo=costo; 
        this.precioVenta= calcularVenta(); 
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
    ///////////////////////////
    
    
    public abstract double calcularVenta();
    

    

    
    
   
    
    
    
    
    //Metodos//
    @Override
    public String toString(){
        return "Medicamento: " + "\n" +
               "Nombre: " + nombre + "\n" + 
               "Descripción: " + descripción + "\n";
    }
    
   
    
}
