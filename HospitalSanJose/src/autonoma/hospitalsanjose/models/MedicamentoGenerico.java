
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo hereda las caracteristicas de un medicamento
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class MedicamentoGenerico extends Medicamento {
    
    //Atributos//
    private double costo;
    private double precioVenta;
    
    //Constructor//

    public MedicamentoGenerico(double costo, double precioVenta, String nombre, String descripción) {
        super(nombre, descripción);
        this.costo = costo;
        this.precioVenta = precioVenta;
    }
    
    //Metodos get  y set//

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
    
    //Metodo abstracto//
    @Override 
    public double calcularVenta(){
        return precioVenta = (( costo * 0.10)+ costo);
    }
    
    //Metodo//
    @Override
    public String toString(){
        return "Medicamento Generico: " + "\n" +
               "Costo: " + costo + "\n" +
               super.toString() + "\n" +
               "Precio Venta: " + calcularVenta() + "\n";
    }
}
