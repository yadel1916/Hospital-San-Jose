
package autonoma.hospitalsanjose.models;

import autonoma.hospitalsanjose.exceptions.PresupuestoNegativo;
import autonoma.hospitalsanjose.models.Cita;
import autonoma.hospitalsanjose.models.Empleado;
import autonoma.hospitalsanjose.models.Gerente;
import autonoma.hospitalsanjose.models.Inventario;
import autonoma.hospitalsanjose.models.Localizacion;
import autonoma.hospitalsanjose.models.Medicamento;
import autonoma.hospitalsanjose.models.Nomina;
import autonoma.hospitalsanjose.models.Paciente;
import java.util.ArrayList;

/**
 * la clase Hospital será la clase control.
 * @author Andres Rodriguez
 * @since 1.0.0
 * @version 2024 09 10
 */
public class Hospital {
    
    /////////////////////////////////////////////// Atributos ////////////////////////////////////////
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre del gerente del hospital.
    */
    private String nombre;
    
    /**
    * el atributo dirección de tipo String  se refiere a la dirección que tiene el hospital.
    */
    private String direccion;
    
    /**
    * el atributo telefono de tipo String  se refiere al telefono que tiene el hospital.
    */
    private String telefono;
    
    /**
    * el atributo presupuesto de tipo double  se refiere al presupuesto que tiene el hospital.
    */
    private double presupuesto;
    
    /**
    * el atributo patrocinio de tipo double  se refiere al patrocinio que tiene el hospital.
    */
    private double patrocinio;
    
    /**
    * el atributo metaVentaAnual de tipo double  se refiere al meta de ventas anuales que tiene el hospital.
    */
    private double metaVentaAnual;
    
    /**
    * el atributo fechaFundación de tipo String  se refiere a la fecha de Fundación del hospital.
    */
    private String fechaFundacion;
    
    /**
    * el atributo estado de tipo String  se refiere al estado del hospital.
    */
    private String estado;
    
    /**
    * el atributo ubicación de tipo Localizacion  se refiere a la localización del hospital.
    */
    private Localizacion ubicacion;
    
    /**
    * el atributo gerente de tipo Gerente  se refiere al gerente del hospital.
    */
    private Gerente gerente;
    
    /**
    * el atributo ArrayList de tipo Paciente  se refiere a la lista de los pacientes.
    */
    private ArrayList <Paciente> listaPacientes;
    
    /**
    * el atributo ArrayList de tipo Cita  se refiere a la lista de las citas.
    */
    private ArrayList<Cita> listaCitas;
    
    /**
    * el atributo ArrayList de tipo Medicamento  se refiere a la lista de los medicamentos
    */
    private ArrayList<Medicamento> listaMedicamentos;
    
    /**
    * el atributo inventario de tipo inventario  se refiere al inventario del hospital.
    */
    private Inventario inventario;
    
    /**
    * el atributo nomina de tipo Nomina  se refiere a la Nomina del hospital.
    */
    private Nomina nomina;
    
    /**
    * el atributo farmacia de tipo Farmacia  se refiere a la Farmacia del hospital.
    */
    private Farmacia farmacia;
    
   
    ////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////////////

    public Hospital(String nombre, String direccion, String telefono, double presupuesto, double metaVentaAnual, String fechaFundacion, String estado, Localizacion ubicacion, Gerente gerente, Paciente pacientes, Nomina nomina, Farmacia farmacia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.patrocinio=0;
        this.metaVentaAnual = metaVentaAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.gerente = gerente;
        this.listaPacientes = new ArrayList<>();
        this.listaCitas = new ArrayList<>();
        this.listaMedicamentos = new ArrayList<>();
        this.nomina=nomina;
        this.farmacia=farmacia; 
    }
    
    
    
    ////////////////////////////////////////// METODOS DE ACCESO ////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDirección(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPresupuesto(){
        return presupuesto;
        
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(double patrocinio) {
        this.patrocinio = patrocinio;
    }
    
    

    public double getMetaVentaAnual() {
        return metaVentaAnual;
    }

    public void setMetaVentaAnual(double metaVentaAnual) {
        this.metaVentaAnual = metaVentaAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Localizacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicación(Localizacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public ArrayList<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(ArrayList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public ArrayList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }


    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
    
    
//    
//    public ArrayList<Empleado> obtenerEmpleados(){
//       return this.empleados.getEmpleados();
//    }
//    
//    public ArrayList<Paciente> obtenerPacientes(){
//       return this.pacientes.getPacientes();
//    }
    
    ////////////////////////////////////////// METODOS //////////////////////////////////////////
    
    /**
    * el método toString devuelve  una cadena con todos los atributos deL hospital.
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    @Override
    public String toString(){
        return "Hospital{" + "nombre:" + nombre + ", direccion:" + direccion + ", telefono:" + telefono + ", presupuesto:" + presupuesto + ", patrocinio:" + patrocinio + ", metaVentaAnual:" + metaVentaAnual + ", fechaFundacion:" + fechaFundacion + ", estado:" + estado + ", ubicacion:" + ubicacion + ", gerente:" + gerente +  ", listaPacientes:" + listaPacientes + ", listaCitas:" + listaCitas + ", listaMedicamentos:" + listaMedicamentos + ", inventario:" + inventario + ", nomina:" + nomina + '}';
    }

    ///////////////////////////////////////// CRUD PACIENTES //////////////////////////////////////7
    
    /**
    * el método agregarPaciente agrega el paciente  a  la lista.
    * @param  rcibe como parametros un paciente tipo Paciente
    * @return retorna un booleano.
    */
    public boolean  agregarPaciente(Paciente paciente){
        return this.listaPacientes.add(paciente);
    }
    
    
    
    /**
    * el método buscarPaciente agrega el paciente  a  la lista.
    * @param  rcibe como parametros un paciente tipo Paciente
    * @return retorna un booleano.
    */
    public Paciente buscarPacientes(Paciente paciente){
        for(int i = 0;i < this.listaPacientes.size(); i++){
            Paciente pac = this.listaPacientes.get(i);
            if (pac.equals(paciente)){
               return pac;
            }
        }
        return null;
    }
    
    /**
    * el método buscarPaciente busca el paciente por id 
    * @param  rcibe como parametros un paciente tipo Paciente
    * @return retorna un Paciente.
    */
    public Paciente buscarPacienteId( int id){
        for (int i = 0; i < this.listaPacientes.size(); i++){
            Paciente pac = this.listaPacientes.get(i);
            if (pac.getId() == id){
                return pac;
            }
        }
        return null;
    }
    
    /**
    * el método buscarPacienteNumDocumento busca el paciente por numero de documento.
    * @param  recibe como parametro numeroDocumento de tipo String.
    * @return retorna un Paciente
    */
    public Paciente buscarPacienteNumDocumento(String numeroDocumento){
       for(int i = 0;i < this.listaPacientes.size(); i++){
           Paciente p = this.listaPacientes.get(i);
           if (p.equals(numeroDocumento)){
              return p;
           }
       }
       return null;
    }
    
    
    /**
    * el método buscarIndicePacienteNombre busca el indice del paciente por el nombre
    * @param  recibe como parametro nombre de tipo String.
    * @return retorna un Paciente
    */
    private Paciente buscarIndicePacienteNombre (String nombre){
        for (int i = 0; i < this.listaPacientes.size(); i++){
            Paciente p = this.listaPacientes.get(i);
            if (p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    /**
    * el método buscarIndicePacienteId busca el indice del paciente por el id
    * @param  recibe como parametro id de tipo String 
    * @return retorna un Paciente
    */
    private int buscarIndicePacienteId (int id){
        for (int i = 0; i < this.listaPacientes.size(); i++){
            Paciente p = this.listaPacientes.get(i);
            if (p.getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    /**
    * el método actualizarPaciente actualiza los cambios realizados  del oaciente
    * @param  recibe como parametro id de tipo int y un  paciente de tipo Paciente 
    * @return retorna un Paciente
    */
    public Paciente actualizarPaciente(int id, Paciente paciente){
        int index = this.buscarIndicePacienteId(id);
        if (index >= 0){
            return this.listaPacientes.set(index,paciente);
        }else {
            return null;
        }
    }
    
    /**
    * el método eliminarPaciente actualiza elimina el paciente.
    * @param  recibe como parametro id de tipo int 
    * @return retorna un Paciente
    */
    public Paciente eliminarPaciente(int id){
        int index = this.buscarIndicePacienteId(id);
        if (index >= 0){
            return this.listaPacientes.remove(index);
        }else {
            return null;
        }
    }
    
    //////////////////////////////////////// CRUD CITAS /////////////////////////////////
    
    /**
    * el método registrarCita registra la cita. 
    * @param  recibe como parametros un cita tipo Cita
    * @return no retorna.
    */
    public void registrarCita(Cita cita) {
        listaCitas.add(cita);
        
        this.presupuesto += cita.getValorConsulta();
    }
    
    /**
    * el método buscarCita busca la cita.
    * @param  rcibe como parametros un cita tipo Cita
    * @return retorna ua Cita.
    */
    public Cita buscarCita(Cita cita){
        for(int i = 0;i < this.listaCitas.size(); i++){
            Cita c = this.listaCitas.get(i);
            if (c.equals(listaCitas)){
               return c;
            }
        }
        return null;
    }
    
    /**
    * el método buscarCita busca la cita.
    * @param  rcibe como parametros un cita tipo Cita
    * @return retorna ua Cita.
    */
    public int buscarIndiceCita(Cita cita){
        for(int i = 0;i < this.listaCitas.size(); i++){
            Cita c = this.listaCitas.get(i);
            if (c.equals(listaCitas)){
               return i;
            }
        }
        return -1;
    }
    
    /**
    * el método buscarCitaFechaConsulta busca la cita por fecha de consulta
    * @param  rcibe como parametros una fechaConsulta tipo String
    * @return retorna una Cita.
    */
    public Cita buscarCitaFechaConsulta( String fechaConsulta){
        for (int i = 0; i < this.listaCitas.size(); i++){
            Cita c= this.listaCitas.get(i);
            if (c.getFechaConsulta()== fechaConsulta){
                return c;
            }
        }
        return null;
    }

    /**
    * el método actualizarCita actualiza los cambios realizados  de la cita
    * @param  recibe como parametro cita de tipo Cita 
    * @return retorna una Cita.
    */
    public Cita actualizarCita(Cita cita){
        
        if (buscarCita(cita) != null){
            return this.listaCitas.set(buscarIndiceCita(cita), cita);
        }else {
            return null;
        }
    }
    
    /**
    * el método eliminarCta  elimina la cita de la lista.
    * @param  recibe como parametro cita de tipo Cita 
    * @return retorna una Cita.
    */
    public Cita eliminarCita(Cita cita){
        int index = this.buscarIndiceCita(cita);
        if (index >= 0){
            return this.listaCitas.remove(index);
        }else {
            return null;
        }
    }
    
    
    //////////////////////////////////// CRUD EMPLEADOS ///////////////////////////////////
    
    /**
    * el método agregarEmpleado agrega el empleado.
    * @param  recibe como parametro el empleado tipo Empleado.
    * @return retorna una booleano
    */
    public boolean agregarEmpleado(Empleado empleado){
        return this.nomina.agregarEmpleado(empleado); 
    }
    
    
    /**
    * el método buscarPaciente busca el empleado 
    * @param  recibe como parametro el empleado tipo Empleado.
    * @return retorna un Empleado.
    */
    public Empleado buscarEmpleado(Empleado empleado){
        return this.nomina.buscarEmpleado(empleado); 
    }
    
    
    /**
    * el método buscarEmpleadoNombre busca el empleado por el numero del documento.
    * @param  recibe como parametro numeroDocumento  de tipo String.
    * @return retorna un Empleado.
    */
    public Empleado buscarEmpleadoNumDocumento(String numeroDocumento){
        return this.nomina.buscarEmpleadoNumDocumento(numeroDocumento); 
    }
    
    
    /**
    * el método buscarEmpleadoId busca el empleado por el id.
    * @return retorna un Empleado.
    */
    public Empleado buscarEmpleadoId(int id){
        return this.nomina.buscarEmpleadoId(id);
    }
    
    
    /**
    * el método actualizarEmpleado actualiza el empleado.
    * @param  recibe como parametro id de tipo int y un empleado de tipo Empleado.
    * @return retorna un Empleado.
    */
    public Empleado actualizarEmpleado(int id, Empleado empleado){
        return this.nomina.actualizarEmpleado(id, empleado);
    }
    
    
    /**
    * el método eliminarEmpleado elimina el empleado 
    * @param  recibe como parametro id de tipo int.
    * @return retorna un Empleado em.
    */
    public Empleado eliminarEmpleado(int id){
        return this.nomina.eliminarEmpleados(id);
    }
    
     //////////////////////////////////// CRUD MEDICAMENTOS ///////////////////////////////////
    
    /**
    * el método agregarMedicamento agrega el emmedicamentopleado.
    * @param  recibe como parametro el medicamento tipo Medicamento.
    * @return retorna una booleano
    */
    public boolean agregarMedicamento(Medicamento medicamento){
        return this.farmacia.getInventario().agregarMedicamento(this,medicamento); 
    }
    
    
    /**
    * el método buscarMedicamento busca el medicamento 
    * @param  recibe como parametro el medicamento tipo Medicamento.
    * @return retorna un Empleado.
    */
    public Medicamento buscarMedicamento(Medicamento medicamento){
        return this.farmacia.getInventario().buscarMedicamentoNombre(nombre); 
    }
    
    
     /**
    * el método buscarMedicamentoNombre busca un medicamento en la lista por el nombre.
    * @param  recibe como parametros un nombre tipo String.
    * @return retorna un Medicamento
    */
    public Medicamento buscarMedicamentoNombre(String nombre){
        return this.farmacia.getInventario().buscarMedicamentoNombre(nombre);
    }
    
    /**
    * el método eliminarMedicamento elimina el medicamento
    * @param  recibe como parametros un nombre tipo String.
    * @return retorna un Medicamento
    */
    public Medicamento eliminarMedicamento(String nombre){
        return this.farmacia.getInventario().eliminarMedicamento(nombre); 
    }
    
    
    /////////////////////////////////////////// CRUD VENTAS ///////////////////////////////////////
    
    /**
    * el método agregarVenta agrega una venta a la lista.
    * @param  recibe como parametros un medicamento tipo Medicamento, una cantidad tipo int y un id tipo int.
    * @return no retorna. 
    */
    public boolean agregarVenta(Medicamento medicamento, int cantidad, int id){
        return this.farmacia.getInventario().agregarVenta(medicamento, cantidad, id);
                
    }
    
    
    /**
    * el método buscarVentaId busca la venta por el id.
    * @param  recibe como parametros un id tipo int
    * @return retorna una Venta.
    */
    public Venta buscarVentaId(int id){
        return this.farmacia.getInventario().buscarVentaId(id); 
    }
    
    
    /**
    * el método buscarVenta busca la venta por la venta.
    * @param  recibe como parametros un venta tipo Venta
    * @return retorna una Venta.
    */
    public Venta buscarVenta(Venta venta){
        return this.farmacia.getInventario().buscarVenta(venta); 
    }
    
    
    /**
    * el método actualizarVenta actualiza los cambios realizados en la venta. 
    * @param  recibe como parametros un venta tipo Venta.
    * @return retorna una Venta.
    */
     public Venta actualizarVenta(Venta venta){
        return this.farmacia.getInventario().actualizarVenta(venta); 
    }
    
     /**
    * el método eliminarVenta elimina la venta. 
    * @param  recibe como parametros un venta tipo Venta.
    * @return no retorna. 
    */
    public boolean eliminarVenta(Venta venta){
        return this.farmacia.getInventario().eliminarVenta(venta);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////
    
    /**
    * el método registrarMedicamento registra el medicamento.
    * @param  recibe como parametro un hospital de tipo Hospital, un medicamento de tipo medicamento
    * @exception tiene una excepcion PresupuestoNegativo
    * @return no retorna.
    */
    public void registrarMedicamento(Hospital hospital,Medicamento medicamento) throws PresupuestoNegativo {
        try {
            listaMedicamentos.add(medicamento);
            this.presupuesto -= medicamento.getCosto();
            inventario.agregarMedicamento(hospital,medicamento);
        }
        catch(PresupuestoNegativo pn){
            hospital.registrarPatrocinio();
            throw pn;
        }
        
    }
    
    /**
    * el método registrarPatrocinio registra el patrocinio del hospital.
    * @param  no recibe parámetros.
    * @return retorna un booleano.
    */
    
    public boolean registrarPatrocinio(){
        if ((this.patrocinio + this.presupuesto) >= 0 ) {
            setEstado("Activo");
            setPresupuesto(this.patrocinio+presupuesto);
            return true; 
        }
        return false; 
    }
    
    /**
    * el método generarNomina genera la nómina del hospital.
    * @param  recibe como parámetros un hospital de tipo Hospital.
    * @exception tiene una excepción PresupuestoNegativo
    * @return no retorna.
    */
    public void generarNomina(Hospital hospital) throws PresupuestoNegativo {
        try {
            nomina.generarNomina(hospital);
        }
        catch(PresupuestoNegativo pn){
            hospital.registrarPatrocinio();
            throw pn;
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   
    
    
    //CRUD Pacientes//
    
//    public boolean agregarPaciente(Paciente paciente){
//        return this.pacientes.agregarPaciente(paciente);
//    }
//    
//    
//    public Paciente buscarPaciente(Paciente paciente){
//        return this.pacientes.buscarPacientes(paciente);
//    }
//    
//    
//    public Paciente buscarPaciente(String nombre){
//        return this.pacientes.buscarPaciente(nombre);
//    }
//    
//    public Paciente buscarPaciente(long id){
//        return this.pacientes.buscarPaciente(id);
//    }
//    
//    public Paciente actualizarPaciente(int id, Paciente paciente){
//        return this.pacientes.actualizarPaciente(id,paciente);
//    }
//    
//    public Paciente eliminarPaciente(int id){
//        return this.pacientes.eliminarPaciente(id);
//    }
    
    //CRUD Reportes//
    
    //CRUD NOMINA////
    
    
    
    
    
    
    
    

