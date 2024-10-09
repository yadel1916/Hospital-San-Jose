
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *Este Algoritmo modelas las caracteristicas de un paciente
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 
*/

public class Paciente {
    
    //Atributos//
    
    private static int autoincremental = 0;
    private int id;
    private String nombre;
    private String numDocumento;
    private int edad;
    private String correoElectronico;
    private String telefono;
    private String estado;
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<MedicamentoPaciente> medicamentoPacientes;
    private ArrayList<Paciente> pacientes;
    
    //Constructor//

    public Paciente(int id, String nombre, String numDocumento, int edad, String correoElectronico, String telefono, String estado) {
        Paciente.autoincremental ++;
        this.id = Paciente.autoincremental;
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.estado = estado;
        this.enfermedades = new ArrayList<>();
        this.medicamentoPacientes = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }
    
    //Metodos get y set//

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList<MedicamentoPaciente> getMedicamentoPacientes() {
        return medicamentoPacientes;
    }

    public void setMedicamentoPacientes(ArrayList<MedicamentoPaciente> medicamentoPacientes) {
        this.medicamentoPacientes = medicamentoPacientes;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    

    
    //Metodo CRUD Enfermedades//
    
    public boolean agregarEnfermedad(Enfermedad enfermedad){
        return this.enfermedades.add(enfermedad);
        
    }
    
    public Enfermedad buscarEnfermedad(Enfermedad enfermedad){
        for(int i = 0;i < this.enfermedades.size(); i++){
            Enfermedad em = this.enfermedades.get(i);
            if (em.equals(enfermedades)){
               return em;
            }
        }
        return null;
    }
    
    
    public Enfermedad buscarEnfermedad (String nombre){
        for (int i = 0; i < this.enfermedades.size(); i++){
            Enfermedad em = this.enfermedades.get(i);
            if (em.getNombre().equals(nombre)){
                return em;
            }
        }
        return null;
    }
    
    public void eliminarEnfermedad (String nombre) throws Exception{
        Enfermedad enfermedad = this.buscarEnfermedad(nombre);
        if (enfermedad != null) {
                enfermedades.remove(enfermedad);
                if (enfermedades.isEmpty()){
                    this.estado = "Saludable";
                }
        }else{
            throw new Exception("Enfermedad no encontrada");
        }
    }
    
    public String mostrarEnfermedades(){
        String archivoEm = "";
        for ( int i=0; i > this.enfermedades.size(); i++ ){
            Enfermedad em = this.enfermedades.get(i);
            archivoEm += em.toString() + "\n";
        }
        return archivoEm;
    }
    
    
    
   
    //CRUD Medicamentos
     public boolean agregarMedicamento(MedicamentoPaciente medicamento){
        return this.medicamentoPacientes.add(medicamento);
        
    }
    
    public MedicamentoPaciente buscarMedicamento(MedicamentoPaciente medicamento){
        for(int i = 0;i < this.medicamentoPacientes.size(); i++){
            MedicamentoPaciente me = this.medicamentoPacientes.get(i);
            if (me.equals(enfermedades)){
               return me;
            }
        }
        return null;
    }
    
    
    public MedicamentoPaciente buscarMedicamento (String nombre){
        for (int i = 0; i < this.medicamentoPacientes.size(); i++){
            MedicamentoPaciente me = this.medicamentoPacientes.get(i);
            if (me.getNombre().equals(nombre)){
                return me;
            }
        }
        return null;
    }
    
    public MedicamentoPaciente eliminarMedicamento (String nombre) throws Exception{
        MedicamentoPaciente medicamento = this.buscarMedicamento(nombre);
        if (medicamento != null) {
                 medicamentoPacientes.remove(medicamento);
                
        }else{
            throw new Exception("Enfermedad no encontrada");
        }
        return medicamento;
    }
    
    
    
    public String mostrarMedicamentos(){
        String lista = "";
        for ( int i=0; i > this.medicamentoPacientes.size(); i++ ){
            MedicamentoPaciente medicamento = this.medicamentoPacientes.get(i);
            lista += lista.toString() + "\n";
        }
        return lista;
    }
    
    //CRUD Pacientes//
    
    
    public boolean  agregarPaciente(Paciente paciente){
        return this.pacientes.add(paciente);
    }
    
    public Paciente buscarPacientes(Paciente paciente){
        for(int i = 0;i < this.pacientes.size(); i++){
            Paciente pac = this.pacientes.get(i);
            if (pac.equals(paciente)){
               return pac;
            }
        }
        return null;
    }
    
    public Paciente buscarPaciente(String nombre){
       for(int i = 0;i < this.pacientes.size(); i++){
           Paciente pac = this.pacientes.get(i);
           if (pac.equals(nombre)){
              return pac;
           }
       }
       return null;
    }
    
    public Paciente buscarPaciente( long id){
        for (int i = 0; i < this.pacientes.size(); i++){
            Paciente pac = this.pacientes.get(i);
            if (pac.getId() == id){
                return pac;
            }
        }
        return null;
    }
    
    private Paciente buscarIndicePaciente (String nombre){
        for (int i = 0; i < this.pacientes.size(); i++){
            Paciente pac = this.pacientes.get(i);
            if (pac.getNombre().equals(nombre)){
                return pac;
            }
        }
        return null;
    }
    
    private int buscarIndicePaciente (int id){
        for (int i = 0; i < this.pacientes.size(); i++){
            Paciente pac = this.pacientes.get(i);
            if (pac.getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public Paciente actualizarPaciente(int id, Paciente paciente){
        int index = this.buscarIndicePaciente(id);
        if (index >= 0){
            return this.pacientes.set(index,paciente);
        }else {
            return null;
        }
    }
    
    public Paciente eliminarPaciente(int id){
        int index = this.buscarIndicePaciente(id);
        if (index >= 0){
            return this.pacientes.remove(index);
        }else {
            return null;
        }
    }
    
    public String archivoPacientes(){
        String archivo = "";
        for ( int i=0; i > this.pacientes.size(); i++ ){
            Paciente pac = this.pacientes.get(i);
            archivo += pac.toString() + "\n";
        }
        return archivo;
    }
    
    
    //Metodos//
    public String toString(){
        return "Gestión Paciente: " + "\n" +
               "Nombre: " + nombre + "\n" + 
               "Numero Documento: " + numDocumento + "\n" +
               "Edad: " + edad + "\n" +
               "Correo electronico: " + correoElectronico + "'n" +
               "Telefono: " + telefono + "\n" +
               "Estado: " + estado + "\n" + "\n";    }
    
    
    //Curar Enfermedad//
    public void curarEnfermedad(Enfermedad enfermedad, MedicamentoPaciente medicamento) throws Exception{
       Enfermedad  enfermedad1 = this.buscarEnfermedad(enfermedad);
       if(enfermedad1 != null){
               enfermedades.remove(enfermedad);
               medicamentoPacientes.add(medicamento);
       }else{
           throw new Exception("El paciente no tiene esta enfermedad.");
       }
    }
    
}
