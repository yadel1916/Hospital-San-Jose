
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un medicamento
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public abstract class Medicamento {
    
   /**
    * el atributo autoincremental de tipo int  autoincrementa lo asignado.
    */
    private static int autoincremental = 0;
    private int id; 
    
    private String nombre;
    private String descripción;
    protected double costo; 
    protected double precioVenta; 
    /**
    * el atributo cantidad de tipo int  se refiere a la cantidad de los medicamentos que hay en el  inventario. 
    */
    protected int cantidad;
    
    
    
    //Constructor//

    public Medicamento(String nombre, String descripción, double costo, int cantidad) {
        Medicamento.autoincremental ++;
        this.nombre = nombre;
        this.descripción = descripción;
        this.costo=costo; 
        this.precioVenta= calcularVenta()*cantidad;
        this.id = Medicamento.autoincremental;
        this.cantidad = cantidad; 
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
