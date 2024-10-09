
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *Este algoritmo modela la nomina de un arreglo de empleados
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Nomina {
    
    //Atributos//
    
    private static int autoincremental = 0;
     
    private String fechaNomina;
    private int id;
    private double totalNomina;
    private ArrayList<Empleado> empleados;
    
    //Constructor//

    public Nomina(String fechaNomina, int id, double totalNomina, ArrayList<Empleado> empleados) {
        Nomina.autoincremental ++;
        this.fechaNomina = fechaNomina;
        this.id = Nomina.autoincremental;
        this.totalNomina = totalNomina;
        this.empleados = new ArrayList<>();
    }
    
    //Metodos get y set//

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

    public double getTotalNomina() {
        return totalNomina;
    }

    public void setTotalNomina(double totalNomina) {
        this.totalNomina = totalNomina;
    }
    
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void generarNomina(Hospital hospital){
        totalNomina = 0;
        for (Empleado em : empleados){
            totalNomina = em.calcularSalario();
        }
        fechaNomina = "";
        
        if (hospital.getPresupuesto() < totalNomina){
           hospital.setEstado("En Quiebra");
        System.out.println("El Hospital ah entrado en estado de quiebra");
        }else{
            hospital.setPresupuesto(hospital.getPresupuesto() - totalNomina);
            System.out.println("Nomina generada exitosamente. ID " + id);
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
    
    
    
    
}
