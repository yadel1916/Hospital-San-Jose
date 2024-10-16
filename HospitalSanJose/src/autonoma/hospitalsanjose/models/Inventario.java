
package autonoma.hospitalsanjose.models;

import autonoma.hospitalsanjose.exceptions.PresupuestoNegativo;
import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un inventario
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Inventario {
    
    //Atributos//
    private static int autoincremental = 0;
    
    private int codigo;
    private String anioActualización;
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Venta> listaVentas;
    
    
    ///////////////////////////////////////

    public Inventario(int codigo, String anioActualización, ArrayList<Medicamento> medicamentos) {
        
        //Inventario.autoincremental++; 
        this.codigo = codigo;
        this.anioActualización = anioActualización;
        this.medicamentos = medicamentos;
        this.listaVentas = new ArrayList<>(); 
    }
    
    ///////////////////////////////////////

    public static int getAutoincremental() {
        return autoincremental;
    }

    public static void setAutoincremental(int autoincremental) {
        Inventario.autoincremental = autoincremental;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAnioActualización() {
        return anioActualización;
    }

    public void setAnioActualización(String anioActualización) {
        this.anioActualización = anioActualización;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    
    
    
    ///////////////////////////////////////

    @Override
    public String toString() {
        return "Inventario{" + "codigo=" + codigo + ", anioActualizaci\u00f3n=" + anioActualización + ", medicamentos=" + medicamentos + '}';
    }
    
    public void agregarVenta(Medicamento medicamento, int cantidad, int id){
        Venta venta=new Venta(id);
        venta.vender(medicamento, cantidad);
        this.listaVentas.add(venta);
        for (int i = 0; i < cantidad; i++) {
            this.medicamentos.remove(medicamento);
        }
        
    }
    
    public void eliminarVenta(Venta venta){
        this.listaVentas.remove(venta);
    }
    
    public Venta buscarVenta(int id){
        for (int i = 0; i < this.listaVentas.size(); i++) {
            if (this.listaVentas.get(i).getId() == id ) {
                return  this.listaVentas.get(id); 
            }
        }
        return null; 
    }
    
    public Venta buscarVenta(Venta venta){
        for (int i = 0; i < this.listaVentas.size(); i++) {
            if (this.listaVentas.get(i)== venta ) {
               Venta v = this.listaVentas.get(i);
               if (v.equals(venta)){
                  return v;
               }
            }
        }
        return null;
    }
        
    public int buscarIndiceVenta(int id){
        for (int i = 0; i < this.listaVentas.size(); i++){
            Venta v = this.listaVentas.get(i);
            if (v.getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public  Venta actualizarVenta(Venta venta){
        int index = this.buscarIndiceVenta(venta.getId());
        if (index >= 0){
            return this.listaVentas.set(index,venta);
        }else {
            return null;
        }
    }  
    
//    CRUD medicamentos//
    
    
    public boolean agregarMedicamento(Hospital hospital,Medicamento medicamento){
        if (hospital.getPresupuesto() - medicamento.getCosto() < 0) {
            validarPresupuesto(hospital,medicamento);
            hospital.setEstado("En Quiebra");
            System.out.println("El Hospital ah entrado en estado de quiebra");
        } else {
            hospital.setPresupuesto(hospital.getPresupuesto() - medicamento.getCosto());
            hospital.setEstado("Activo");
            System.out.println("inventario generado exitoamente");

        }
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
    
    public void validarPresupuesto(Hospital hospital,Medicamento medicamento) throws PresupuestoNegativo {
        if (hospital.getPresupuesto() - medicamento.getCosto()  < 0) {
            throw new PresupuestoNegativo();
        }
    }
}

