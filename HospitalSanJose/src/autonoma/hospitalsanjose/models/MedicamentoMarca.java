
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo hereda las caracteristicas de un Medicamento
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class MedicamentoMarca extends Medicamento {
    
    //Atributos//
    private double precioVenta;
    private String fabricante;
    
   
    
    //Constructor//

    public MedicamentoMarca(String fabricante, double costo, String nombre, String descripción,int cantidad) {
        super(nombre, descripción,costo,cantidad);
        this.fabricante = fabricante;
        this.precioVenta=calcularVenta()*cantidad;
    }
    
    //Metodos get y set//

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    
    
    //Metodo CalcularVenta//
    @Override
    public double calcularVenta(){
        return ((costo * 0.25)+ costo)* this.cantidad;
    }
    
    //Metodos//
    @Override 
    public String toString(){
        return "Medicamento Marca: " + "\n" +
               "Fabricante: " + fabricante + "\n" +
               "Costo: " + costo + "\n" +
               super.toString() + "\n" +
               "Precio Venta: " + calcularVenta() + "\n";
    }
    
    
    
}
