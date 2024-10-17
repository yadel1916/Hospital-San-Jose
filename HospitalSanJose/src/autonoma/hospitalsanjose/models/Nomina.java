package autonoma.hospitalsanjose.models;

import autonoma.hospitalsanjose.exceptions.PresupuestoNegativo;
import autonoma.hospitalsanjose.models.Empleado;
import autonoma.hospitalsanjose.models.Hospital;
import java.util.ArrayList;

/**
 * la clase Nomina, será la clase que controlará los salarios de los empleados
 *
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Nomina {

    //Atributos//
    private static int autoincremental = 0;

    /**
     * el atributo fechaNomina de tipo String se refiere a la fecha en la que se
     * realizó la nómina.
     */
    private String fechaNomina;

    /**
     * el atributo id de tipo String se refiere al id identificativo de cada
     * nómina
     */
    private int id;

    /**
     * el atributo totalSalarios de tipo String mostrará el total de los
     * salarios generados.
     */
    private double totalSalarios;

    /**
     * el atributo listaEmpleados de tipo ArrayList tendrá la lista de todos los
     * empleados
     */
    private ArrayList<Empleado> listaEmpleados;

    ///////////////////////////////////////////// CONSTRUCTOR /////////////////////////////////////////////
    public Nomina(String fechaNomina) {
        Nomina.autoincremental++;
        this.fechaNomina = fechaNomina;
        this.id = Nomina.autoincremental;
        this.totalSalarios = calcularTotalSalarios();
        this.listaEmpleados = new ArrayList<>();
    }

    //////////////////////////////////////////// METODOS DE ACCESO /////////////////////////////////////
    public static int getAutoincremental() {
        return autoincremental;
    }

    public static void setAutoincremental(int autoincremental) {
        Nomina.autoincremental = autoincremental;
    }

    public String getFechaInicioNomina() {
        return fechaNomina;
    }

    public void setFechaNomina(String fechaInicioNomina) {
        this.fechaNomina = fechaNomina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalSalarios() {
        return totalSalarios;
    }

    public ArrayList<Empleado> getlistaEmpleados() {
        return listaEmpleados;
    }

    public void setEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    ///////////////////////////////////////// METODOS /////////////////////////////////////7
    /**
     * el método toString devuelve una cadena con toda la informacion de la
     * nomina
     *
     * @param no recibe parámetros.
     * @return retorna una cadena.
     */
    @Override
    public String toString() {
        return "Nomina{" + "fechaNomina=" + fechaNomina + ", id=" + id + ", totalSalarios=" + totalSalarios + ", listaEmpleados=" + listaEmpleados + '}';
    }

    public void generarNomina(Hospital hospital) throws PresupuestoNegativo {

        fechaNomina = "";

        if (hospital.getPresupuesto() - totalSalarios < 0) {
            validarPresupuesto(hospital);
            hospital.setEstado("En Quiebra");
            System.out.println("El Hospital ah entrado en estado de quiebra");
        } else {
            hospital.setPresupuesto(hospital.getPresupuesto() - totalSalarios);
            hospital.setEstado("Activo");
            System.out.println("Nomina generada exitosamente. ID " + id);

        }

    }

    public void validarPresupuesto(Hospital hospital) throws PresupuestoNegativo {
        if (hospital.getPresupuesto() - totalSalarios < 0) {
            throw new PresupuestoNegativo();
        }
    }

//        
    /**
     * el método calcularTotalSalarios devuelve una double con el salario total
     * de los empleados
     *
     * @param no recibe parámetros.
     * @return retorna un double .
     */
    public double calcularTotalSalarios() {
        totalSalarios = 0;
        for (int i = 0; i < this.listaEmpleados.size(); i++) {
            totalSalarios += this.listaEmpleados.get(i).calcularSalario();
        }
        return totalSalarios;
    }
    
    /**
    * el método agregarEmpleado agrega el empleado a la lista
    * @param  recibe como parametro el empleado tipo Empleado.
    * @return retorna una booleano
    */
    public boolean  agregarEmpleado(Empleado empleado){
        return this.listaEmpleados.add(empleado);
    }
    
    /**
    * el método buscarEmpleado busca el empleado en  la lista
    * @param  recibe como parametro el empleado tipo Empleado.
    * @return retorna un Empleado em.
    */
    public Empleado buscarEmpleado(Empleado empleado){
        for(int i = 0;i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.equals(empleado)){
               return em;
            }
        }
        return null;
    }
    
    /**
    * el método buscarEmpleadoNombre busca el empleado en la lista por el nombre
    * @param  recibe como parametro numeroDocumento de tipo String.
    * @return retorna un Empleado em.
    */
    public Empleado buscarEmpleadoNumDocumento(String numeroDocumento){
       for(int i = 0;i < this.listaEmpleados.size(); i++){
           Empleado em = this.listaEmpleados.get(i);
           if (em.equals(numeroDocumento)){
              return em;
           }
       }
       return null;
    }
    
    /**
    * el método buscarEmpleadoId busca el empleado en la lista por el Id
    * @param  recibe como parametro id de tipo int.
    * @return retorna un Empleado em.
    */
    public Empleado buscarEmpleadoId( int id){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.getId() == id){
                return em;
            }
        }
        return null;
    }
    
    /**
    * el método buscarIndiceEmpleado busca el indice del empleado
    * @param  recibe como parametro nombre de tipo String.
    * @return retorna un Empleado em.
    */
    public Empleado buscarIndiceEmpleado(String nombre){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.getNombre().equals(nombre)){
                return em;
            }
        }
        return null;
    }
    
    /**
    * el método buscarIndiceEmpleadoId busca el indice del empleado por el id
    * @param  recibe como parametro id de tipo int.
    * @return retorna un Empleado em.
    */
    private int buscarIndiceEmpleadoId (int id){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.getId() == id){
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
    public Empleado actualizarEmpleado(int id, Empleado empleado){
        int index = this.buscarIndiceEmpleadoId(id);
        if (index >= 0){
            return this.listaEmpleados.set(index,empleado);
        }else {
            return null;
        }
    }
    
    /**
    * el método eliminarEmpleado elimina el empleado de la lista
    * @param  recibe como parametro id de tipo int.
    * @return retorna un Empleado em.
    */
    public Empleado eliminarEmpleados(int id){
        int index = this.buscarIndiceEmpleadoId(id);
        if (index >= 0){
            return this.listaEmpleados.remove(index);
        }else {
            return null;
        }
    }

}

//    //CRUD Empleados//
//    
//    public boolean agregarEmpleado(Empleado empleado){
//        return this.empleados.add(empleado);
//    }
//    
//    public Empleado buscarEmpleado(Empleado empleado){
//        for(int i = 0;i < this.empleados.size(); i++){
//            Empleado em = this.empleados.get(i);
//            if (em.equals(empleado)){
//               return em;
//            }
//        }
//        return null;
//    }
//    
//    public Empleado buscarEmpleado( int id){
//        for (int i = 0; i < this.empleados.size(); i++){
//            Empleado em = this.empleados.get(i);
//            if (em.getId() == id){
//                return em;
//            }
//        }
//        return null;
//    }
//    
//    public Empleado buscarIndiceEmpleado (String nombre){
//        for (int i = 0; i < this.empleados.size(); i++){
//            Empleado em = this.empleados.get(i);
//            if (em.getNombre().equals(nombre)){
//                return em;
//            }
//        }
//        return null;
//    }
//    
//     public int buscarIndiceEmpleado (int id){
//        for (int i = 0; i < this.empleados.size(); i++){
//            Empleado em = this.empleados.get(i);
//            if (em.getId() == id){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    public  Empleado actualizarEmpleado(int id, Empleado empleado){
//        int index = this.buscarIndiceEmpleado(id);
//        if (index >= 0){
//            return this.empleados.set(index,empleado);
//        }else {
//            return null;
//        }
//    }
//    
//    public Empleado eliminarEmpleado(int id){
//        int index = this.buscarIndiceEmpleado(id);
//        if (index >= 0){
//            return this.empleados.remove(index);
//        }else {
//            return null;
//        }
//    }
//
//
//    
//    public String mostrarArchivoEmpleados(){
//        String archivoEm = "";
//        for ( int i=0; i > this.empleados.size(); i++ ){
//            Empleado em = this.empleados.get(i);
//            archivoEm += em.toString() + "\n";
//        }
//        return archivoEm;
//    }

