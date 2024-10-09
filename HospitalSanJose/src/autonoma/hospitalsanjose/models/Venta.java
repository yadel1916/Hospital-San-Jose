
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo modela el estado de las ventas del hospital
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Venta {
    
    //Atributos//
    private static int autoincremental = 0;
    
    private int id;
    private double valorTotal;
    
    //Constructor//

    public Venta(int id, double valorTotal) {
        Venta.autoincremental ++;
        this.id = Venta.autoincremental;
        this.valorTotal = valorTotal;
    }
    
    //Metodos de acceso o modificadores//

    public static int getAutoincremental() {
        return autoincremental;
    }

    public static void setAutoincremental(int autoincremental) {
        Venta.autoincremental = autoincremental;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    //Metodos//
    @Override
    public String toString(){
        return "Venta" + "\n" +
               "Id: " + id + "\n" +
               "Valor Total Venta: " + "\n";
    }
    
    
}
