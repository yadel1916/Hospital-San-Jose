
package autonoma.hospitalsanjose.models;

import autonoma.hospitalsanjose.exceptions.PresupuestoNegativo;
import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un Hospital.
 * @author Andres Rodriguez
 * @since 1.0.0
 * @version 20240910
 */
public class Hospital {
    
    //Atributos//
    private String nombre;
    private String dirección;
    private String telefono;
    private double presupuesto;
    private double patrocinio;
    private double metaVentaAnual;
    private String fechaFundación;
    private String estado;
    private Localización ubicación;
    private Gerente gerente;
    private Empleado empleados;
    private Paciente pacientes;
    private Inventario inventario;
    private ArrayList<Cita> citas;
    private ArrayList<Medicamento> medicamentos;
    private Nomina nomina;
    
   
    //Constructor//

    public Hospital(String nombre, String dirección, String telefono, double presupuesto, double metaVentaAnual, String fechaFundación, String estado, Localización ubicación, Gerente gerente, Empleado empleados, Paciente pacientes,Inventario inventario, Nomina nomina) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.patrocinio=0;
        this.metaVentaAnual = metaVentaAnual;
        this.fechaFundación = fechaFundación;
        this.estado = estado;
        this.ubicación = ubicación;
        this.gerente = gerente;
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.inventario = inventario;
        this.citas = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.nomina=nomina;
    }
    
    
    
    //Metodos get y set//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
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

    public String getFechaFundación() {
        return fechaFundación;
    }

    public void setFechaFundación(String fechaFundación) {
        this.fechaFundación = fechaFundación;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Localización getUbicación() {
        return ubicación;
    }

    public void setUbicación(Localización ubicación) {
        this.ubicación = ubicación;
    }
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public Paciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }
    
    
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public ArrayList<Empleado> obtenerEmpleados(){
       return this.empleados.getEmpleados();
    }
    
    public ArrayList<Paciente> obtenerPacientes(){
       return this.pacientes.getPacientes();
    }
    
    //Registrar cita//
    public void registrarCita(Cita cita){
        citas.add(cita);
        
        this.presupuesto += cita.getValorConsulta();
    }
    
    public void registrarMedicamento(Hospital hospital,Medicamento medicamento) throws PresupuestoNegativo {
        try {
            medicamentos.add(medicamento);
            this.presupuesto -= medicamento.getCosto();
            inventario.agregarMedicamento(hospital,medicamento);
        }
        catch(PresupuestoNegativo pn){
            hospital.registrarPatrocinio();
            throw pn;
        }
        
    }
    
    
    //Metodo//
    @Override
    public String toString(){
        return "Hospital: " + "\n" +
               nombre + "\n" +
               "Gerente: " + gerente.toString() + "\n" +
               "Dirección: " + dirección + "\n" +
               "Telefono: " + telefono + "\n" +
               "Presupuesto: " + presupuesto + "\n" + 
               "Meta Venta Anual: " + metaVentaAnual + "\n" +
               "Fecha fundación: " + fechaFundación + "\n" +
               "Estado: " + estado + "\n" + 
               "Localización: " + ubicación + "\n" +
               "Gerente: " + gerente + "\n";
    }
    
    /////// 
    
    public boolean registrarPatrocinio(){
        if ((this.patrocinio + this.presupuesto) >= 0 ) {
            setEstado("Activo");
            setPresupuesto(this.patrocinio+presupuesto);
            return true; 
        }
        return false; 
    }
    
    //CRUD Empleados//

    public boolean agregarEmpleado(Empleado empleado){
        return this.empleados.agregarEmpleado(empleado);
    }
    
    
    public Empleado buscarEmpleado(Empleado empleado){
        return this.empleados.buscarEmpleado(empleado);
    }
    
    
    public Empleado buscarEmpleadoId(int id){
        return this.empleados.buscarEmpleadoId(id);
    }
    
    public Empleado buscarEmpleadoNumDocumento(String numeroDocumento){
        return this.empleados.buscarEmpleadoNumDocumento(numeroDocumento);
    }
    
    public Empleado actualizarEmpleado(int id, Empleado empleado){
        return this.empleados.actualizarEmpleado(id,empleado);
    }
    
    public Empleado eliminarEmpleado(int id){
        return this.empleados.eliminarEmpleados(id);
    }
    
    //CRUD Pacientes//
    
    public boolean agregarPaciente(Paciente paciente){
        return this.pacientes.agregarPaciente(paciente);
    }
    
    
    public Paciente buscarPaciente(Paciente paciente){
        return this.pacientes.buscarPacientes(paciente);
    }
    
    
    public Paciente buscarPaciente(String nombre){
        return this.pacientes.buscarPaciente(nombre);
    }
    
    public Paciente buscarPaciente(long id){
        return this.pacientes.buscarPaciente(id);
    }
    
    public Paciente actualizarPaciente(int id, Paciente paciente){
        return this.pacientes.actualizarPaciente(id,paciente);
    }
    
    public Paciente eliminarPaciente(int id){
        return this.pacientes.eliminarPaciente(id);
    }
    
    //CRUD Reportes//
    
    //CRUD NOMINA////
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
