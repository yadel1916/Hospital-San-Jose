
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

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
    private ArrayList<Medicamento> listaMedicamentos; 
    
    //Constructor//

    public Venta(int id) {
        //Venta.autoincremental ++;
        this.id = id;
        this.valorTotal = valorTotalVenta();
        this.listaMedicamentos = new ArrayList<>(); 
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

    public ArrayList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }
    
    
    //Metodos//
    @Override
    public String toString(){
        return "Venta" + "\n" +
               "Id: " + id + "\n" +
               "Valor Total Venta: " + "\n";
    }
    
    public int vender(Medicamento medicamento,int cantidad){
        this.listaMedicamentos.add(medicamento);
        if (medicamento.getCantidad()-cantidad >= 0) {
            medicamento.setCantidad(medicamento.getCantidad()-cantidad);
            return medicamento.getCantidad(); 
        }
        return -1; 
    }

    public double valorTotalVenta(){
        double valorTotal = 0;
        if (this.listaMedicamentos != null) {
            for (int i = 0; i < this.listaMedicamentos.size(); i++) {
                valorTotal += this.listaMedicamentos.get(i).getPrecioVenta();
            }
        }
        else{
            return 0;
        }
        return valorTotal; 
        
        
    }
    
}
