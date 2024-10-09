
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo hereda las caracteristicas de un Medicamento
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class MedicamentoMarca extends Medicamento {
    
    //Atributos//
    private String fabricante;
    private double costo;
    private double precioVenta;
    
    //Constructor//

    public MedicamentoMarca(String fabricante, double costo, double precioVenta, String nombre, String descripción) {
        super(nombre, descripción);
        this.fabricante = fabricante;
        this.costo = costo;
        this.precioVenta = precioVenta;
    }
    
    //Metodos get y set//

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public void setPrecioVenta(double PrecioVenta) {
        this.precioVenta = PrecioVenta;
    }
    
    //Metodo CalcularVenta//
    @Override
    public double calcularVenta(){
        return precioVenta =((costo * 0.25)+ costo);
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
