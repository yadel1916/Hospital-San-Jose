
package autonoma.hospitalsanjose.models;

import autonoma.hospitalsanjose.exceptions.PresupuestoNegativo;
import java.util.ArrayList;

/**
 * Este algoritmo modela las caracteristicas de un inventario
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Inventario {
    
    /**
    * el atributo inventario de tipo Inventario  se refiere al inventario que tiene la farmacia. 
    */
    private static int autoincremental = 0;
    
    
    /**
    * el atributo codigo de tipo int  se refiere al identificador unico del inventario. 
    */
    private int codigo;
    
    /**
    * el atributo anioActualización de tipo String  se refiere al año de actualizacion del inventario. 
    */
    private String anioActualizacion;
    
    /**
    * el atributo ArrayListo de tipo Medicamento  se refiere a la lista de los medicamentos que tiene el        inventario. 
    */
    private ArrayList<Medicamento> listaMedicamentos;
    
    /**
    * el atributo ArrayListo de tipo Venta  se refiere a la lista de ventas de los medicamentos. 
    */
    private ArrayList<Venta> listaVentas;
    
    
    /////////////////////////////////////////// CONSTRUCTOR ////////////////////////////////////////

    public Inventario(int codigo, String anioActualizacion) {
        
        //Inventario.autoincremental++; 
        this.codigo = codigo;
        this.anioActualizacion = anioActualizacion;
        this.listaMedicamentos = new ArrayList<>();
        this.listaVentas = new ArrayList<>(); 
        
    }
    
    /////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////////

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

    public String getAnioActualizaciOn() {
        return anioActualizacion;
    }

    public void setAnioActualización(String anioActualizacion) {
        this.anioActualizacion = anioActualizacion;
    }

    public ArrayList<Medicamento> getlistaMedicamentos() {
        return listaMedicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    ////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////////////

    @Override
    public String toString() {
        return "Inventario{" + "codigo:" + codigo + "\n"+
                ", anioActualizacion:" + anioActualizacion + "\n"+
                ", medicamentos:" + listaMedicamentos + '}';
    }
    
    /////////////////////////////////////// CRUD VENTAS //////////////////////////////////////////
    
    /**
    * el método agregarVenta agrega una venta a la lista.
    * @param  recibe como parametros un medicamento tipo Medicamento, una cantidad tipo int y un id tipo int.
    * @return no retorna. 
    */
    public boolean agregarVenta(Medicamento medicamento, int cantidad, int id){
        Venta venta=new Venta(id);
        venta.vender(medicamento, cantidad);
        if (this.listaVentas.add(venta)){
            for (int i = 0; i < cantidad; i++) {
            this.listaMedicamentos.remove(medicamento);
            }  
            return true;  
        }
        return false; 
          
    }
    
    
    /**
    * el método buscarVentaId busca la venta por el id.
    * @param  recibe como parametros un id tipo int
    * @return retorna una Venta.
    */
    
    public Venta buscarVentaId(int id){
        for (int i = 0; i < this.listaVentas.size(); i++) {
            if (this.listaVentas.get(i).getId() == id ) {
                return  this.listaVentas.get(id); 
            }
        }
        return null; 
    }
    
    /**
    * el método buscarVenta busca la venta por la venta.
    * @param  recibe como parametros un venta tipo Venta
    * @return retorna una Venta.
    */
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
    
    /**
    * el método buscarIndiceVenta busca el indice de la venta por el id.
    * @param  recibe como parametros un id tipo int.
    * @return retorna un int.
    */
    public int buscarIndiceVenta(int id){
        for (int i = 0; i < this.listaVentas.size(); i++){
            Venta v = this.listaVentas.get(i);
            if (v.getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    /**
    * el método actualizarVenta actualiza los cambios realizados en la venta. 
    * @param  recibe como parametros un venta tipo Venta.
    * @return retorna una Venta.
    */
    public  Venta actualizarVenta(Venta venta){
        int index = this.buscarIndiceVenta(venta.getId());
        if (index >= 0){
            return this.listaVentas.set(index,venta);
        }else {
            return null;
        }
    }  
    
    /**
    * el método eliminarVenta elimina la venta de la lista.  
    * @param  recibe como parametros un venta tipo Venta.
    * @return no retorna. 
    */
    public boolean eliminarVenta(Venta venta){
        return this.listaVentas.remove(venta);
    }
    

    //////////////////////////////////////// CRUD MEDICAMENTOS ////////////////////////////////////
    
    /**
    * el método agregarMedicamento agrega un medicamento a la lista.
    * @param  recibe como parametros un hospital tipo Hosptal, un medicamento tipo Medicamento.
    * @return retorna un booleano. 
    */
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
        return this.listaMedicamentos.add(medicamento);
    }
    
    /**
    * el método buscarMedicamento busca un medicamento en la lista.
    * @param  recibe como parametros un medicamento tipo Medicamento
    * @return retorna un Medicamento
    */
    public Medicamento buscarMedicamento(Medicamento medicamento){
        for(int i = 0;i < this.listaMedicamentos.size(); i++){
            Medicamento medc = this.listaMedicamentos.get(i);
            if (medc.equals(medicamento)){
               return medc;
            }
        }
        return null;
    }
    
    /**
    * el método buscarMedicamentoNombre busca un medicamento en la lista por el nombre.
    * @param  recibe como parametros un nombre tipo String.
    * @return retorna un Medicamento
    */
    public Medicamento buscarMedicamentoNombre(String nombre){
        for (int i = 0; i < this.listaMedicamentos.size(); i++){
            Medicamento medc = this.listaMedicamentos.get(i);
            if (medc.getNombre().equals(nombre)){
                return medc;
            }
        }
        return null;
    }
    
    /**
    * el método eliminarMedicamento elimina el medicamento de la lista por el nombre.
    * @param  recibe como parametros un nombre tipo String.
    * @return retorna un Medicamento
    */
    public Medicamento eliminarMedicamento(String nombre){
        Medicamento medi = this.buscarMedicamentoNombre(nombre);
        if (medi != null){
            listaMedicamentos.remove(medi);
            return medi;
        }else {
            return null;
        }
    }
    /**
    * el método buscarIndiceEmpleadoId busca el indice del empleado por el id
    * @param  recibe como parametro id de tipo int.
    * @return retorna un Empleado em.
    */
    private int buscarIndiceMedicamentoId (int id){
        for (int i = 0; i < this.listaMedicamentos.size(); i++){
            Medicamento m = this.listaMedicamentos.get(i);
            if (m.getId() == id){
                return i;
            }
        }
        return -1;
    }
    /**
    * el método actualizarEmpleado actualiza los cambios realizados  del empleado
    * @param  recibe como parametro id de tipo int y un empleado de tipo Empleado.
    * @return retorna un Empleado em.
    */
    public Medicamento actualizarMedicamento(int id, Medicamento medicamento){
        int index = this.buscarIndiceMedicamentoId(id);
        if (index >= 0){
            return this.listaMedicamentos.set(index,medicamento);
        }else {
            return null;
        }
    }
    /**
    * el método validarPresupuesto valida el presupuesto del hospital.
    * @param  recibe como parametros un hospital tipo Hospital y un medicamento tipo Medicamento.
    * @return no retorna. 
    * @exception tiene una excepcion PresupuestoNegativo
    */
    public void validarPresupuesto(Hospital hospital,Medicamento medicamento) throws PresupuestoNegativo {
        if (hospital.getPresupuesto() - medicamento.getCosto()  < 0) {
            throw new PresupuestoNegativo();
        }
    }
}
    
//    public String mostrarArchivoEmpleados(){
//        String archivomedc= "";
//        for ( int i=0; i > this.listaMedicamentos.size(); i++ ){
//            Medicamento medc = this.listaMedicamentos.get(i);
//            archivomedc += archivomedc.toString() + "\n";
//        }
//        return archivomedc;
//    }
    
    

