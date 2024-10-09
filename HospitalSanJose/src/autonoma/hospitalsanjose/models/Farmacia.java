
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo modela un inventario de medicamentos
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Farmacia {
    
    //Atributos//
    private Inventario inventario;
    
    //Constructor//
    public Farmacia (Inventario inventario){
        this.inventario = inventario;
    }
    
    //Metodos get //

    public Inventario getInventario() {
        return inventario;
    }
    
    
}
