
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo hereda las caracteristicas de un medicamento
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class MedicamentoGenerico extends Medicamento {
    
    //Atributos//
    private double precioVenta;
   
    
    //Constructor//

    public MedicamentoGenerico(String nombre, String descripcion,double costo, int cantidad) {
        super(nombre, descripcion, costo,cantidad);
        this.precioVenta=calcularVenta()*cantidad;
        
    }
    
    //Metodos get  y set//

   
    
    //Metodo abstracto//
    @Override 
    public double calcularVenta(){
        return ((costo * 0.10)+ costo);
//        return (( c * 0.10)+ costo);
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
