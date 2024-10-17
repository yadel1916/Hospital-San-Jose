package autonoma.hospitalsanjose.models;

import autonoma.hospitalsanjose.exceptions.EnfermedadNegativa;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * la clase Paciente tendrá toda la información de cada paciente
 *
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 2024 09 10
 */
public class Paciente {

    //Atributos//
    private static int autoincremental = 0;
    private int id;

    /**
     * el atributo nombre de tipo String se refiere al nombre del paciente.
     */
    private String nombre;

    /**
     * el atributo numeroDocumento de tipo String se refiere al ID
     * identificativo del paciente.
     */
    private String numDocumento;

    /**
     * el atributo edad de tipo int se refiere a la edad del paciente.
     */
    private int edad;

    /**
     * el atributo correoElectronico de tipo String se refiere al correo del
     * paciente.
     */
    private String correoElectronico;

    /**
     * el atributo telefono de tipo String se refiere al telefono que tendrá el
     * paciente.
     */
    private String telefono;

    /**
     * el atributo estado de tipo String se mostrará el estado en el que se
     * encuentra el paciente.
     */
    private String estado;

    /**
     * el atributo listaEnfermedades de tipo ArrayList tendrá la lista de las
     * enfermedades del paciente.
     */
    private ArrayList<Enfermedad> enfermedades;

    /**
     * el atributo listaMedicamentos de tipo ArrayList tendrá la lista de las
     * listaMedicamentos del paciente.
     */
    private ArrayList<MedicamentoPaciente> medicamentoPacientes;

    /**
     * el atributo listaPacientes de tipo ArrayList tendrá la lista de las
     * listaMedicamentos del paciente.
     */
    private ArrayList<Paciente> pacientes;

    ///////////////////////////////////////////// CONSTRUCTOR //////////////////////////////////////////////
    public Paciente(int id, String nombre, String numDocumento, int edad, String correoElectronico, String telefono, String estado) {
        Paciente.autoincremental++;
        this.id = Paciente.autoincremental;
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.estado = "Saludable";
        this.enfermedades = new ArrayList<>();
        this.medicamentoPacientes = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    //////////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////////
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

    /**
     * el método toString devuelve una cadena con todos los atributos del
     * paciente.
     *
     * @param no recibe parámetros.sl
     * @return retorna una cadena.
     */
    public String toString() {
        return "Gestión Paciente: " + "\n"
                + "Nombre: " + nombre + "\n"
                + "Numero Documento: " + numDocumento + "\n"
                + "Edad: " + edad + "\n"
                + "Correo electronico: " + correoElectronico + "'n"
                + "Telefono: " + telefono + "\n"
                + "Estado: " + estado + "\n" + "\n";
    }

    //CRUD Enfermedades//
    /**
     * el método agregarEnfermedad agrega una enfermedad a la lista.
     *
     * @param recibe como parametros una enfermedad tipo Enfermedad
     * @return retorna un booleano
     */
    public boolean agregarEnfermedad(Enfermedad enfermedad) {
        return this.enfermedades.add(enfermedad);

    }

    /**
     * el método buscarEnfermedad busca la enfermedad por la enfermedad
     *
     * @param recibe como parametros un enfermedad tipo Enfermedad
     * @return retorna null.
     */
    public Enfermedad buscarEnfermedad(Enfermedad enfermedad) {
        for (int i = 0; i < this.enfermedades.size(); i++) {
            Enfermedad enf = this.enfermedades.get(i);
            if (enf.equals(enfermedad)) {
                return enf;
            }
        }
        return null;
    }

    /**
     * el método buscarEnfermedad busca la enfermedad por el nombre
     *
     * @param recibe como parametros un nombre tipo String
     * @return retorna null.
     */
    public Enfermedad buscarEnfermedad(String nombre) {
        for (int i = 0; i < this.enfermedades.size(); i++) {
            Enfermedad enf = this.enfermedades.get(i);
            if (enf.getNombre().equals(nombre)) {
                return enf;
            }
        }
        return null;
    }

    /**
     * el método eliminarEnfermedad elimina la enfermedad de la lista
     *
     * @param recibe como parametros una enfermedad tipo Enfermedad
     * @return no retorna
     * @exception maneja una exception
     */
    public void eliminarEnfermedad(String nombre) throws EnfermedadNegativa {
        Enfermedad enfermedad = this.buscarEnfermedad(nombre);
        if (enfermedad != null) {
            enfermedades.remove(enfermedad);
            if (enfermedades.isEmpty()) {
                this.estado = "Saludable";
            }
        } else {
            throw new EnfermedadNegativa();
        }
    }

    /**
     * el método mostrarEnfermedades muestra la lista de las enfermedades del
     * paciente
     *
     * @param no recibe parametros
     * @return retorna String
     */
    public String mostrarEnfermedades() {
        String archivoEm = "";
        for (int i = 0; i > this.enfermedades.size(); i++) {
            Enfermedad em = this.enfermedades.get(i);
            archivoEm += em.toString() + "\n";
        }
        return archivoEm;
    }

    //CRUD Medicamentos
    /**
     * el método agregarMedicamento agrega un medicamento a la lista.
     *
     * @param recibe como parametros un medicamento tipo Medicamento
     * @return no retorna
     */
    public boolean agregarMedicamento(MedicamentoPaciente medicamento) {
        return this.medicamentoPacientes.add(medicamento);

    }

    /**
     * el método buscarMedicamento busca un medicamento de la lista
     *
     * @param recibe como parametros un medicamento tipo MedicamentoPaciente
     * @return retorna null.
     */
    public MedicamentoPaciente buscarMedicamento(MedicamentoPaciente medicamento) {
        for (int i = 0; i < this.medicamentoPacientes.size(); i++) {
            MedicamentoPaciente mp = this.medicamentoPacientes.get(i);
            if (mp.equals(enfermedades)) {
                return mp;
            }
        }
        return null;
    }

    /**
     * el método buscarMedicamento busca un medicamento de la lista por el
     * nombre
     *
     * @param recibe como parametros un nombre tipo String
     * @return retorna null.
     */
    public MedicamentoPaciente buscarMedicamento(String nombre) {
        for (int i = 0; i < this.medicamentoPacientes.size(); i++) {
            MedicamentoPaciente me = this.medicamentoPacientes.get(i);
            if (me.getNombre().equals(nombre)) {
                return me;
            }
        }
        return null;
    }

    /**
     * el método eliminarMedicamento elimina un medicamento de la lista.
     *
     * @param recibe como parametros un nombre tipo String
     * @exception tiene una excepcion
     * @return retorna null.
     */
     public MedicamentoPaciente eliminarMedicamento (String nombre) throws EnfermedadNegativa{
        MedicamentoPaciente medicamento = this.buscarMedicamento(nombre);
        if (medicamento != null) {
            medicamentoPacientes.remove(medicamento);

        } else {
            throw new EnfermedadNegativa();
        }
        return medicamento;
    }

    /**
     * el método mostrarMedicamento muestra los medicamentos existentes en la
     * lista.
     * @param no recibe parametros
     * @return retorna un String.
     */
    public String mostrarMedicamentos() { 
        String lista = "";
        for (int i = 0; i > this.medicamentoPacientes.size(); i++) {
            MedicamentoPaciente medicamento = this.medicamentoPacientes.get(i);
            lista += medicamento.toString() + "\n";
        }
        return lista;
    }

    public String archivoPacientes() {
        String archivo = "";
        for (int i = 0; i > this.pacientes.size(); i++) {
            Paciente pac = this.pacientes.get(i);
            archivo += pac.toString() + "\n";
        }
        return archivo;
    }

    //Curar Enfermedad//
    public void curarEnfermedad(Enfermedad enfermedad, MedicamentoPaciente medicamento) throws EnfermedadNegativa {
        Enfermedad enfermedad1 = this.buscarEnfermedad(enfermedad);
        if (enfermedad1 != null || buscarMedicamento(medicamento) == null) {
            enfermedades.remove(enfermedad);
            medicamentoPacientes.add(medicamento);

        } else {
            setEstado("Critico");
             throw new EnfermedadNegativa();
        }
        if (enfermedades.isEmpty()) {
            setEstado("Saludable");
        }
    }

}
