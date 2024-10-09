/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un Empleado
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public abstract class Empleado {
    
    //Atributos//
    private static int autoincremental = 0;
    
    private String nombre;
    private String numeroDocumento;
    private String edad;
    private double salarioBase;
    private ArrayList<Empleado> empleados;
    private int id;
    
    //Constructor//

    public Empleado(String nombre, String numeroDocumento, String edad,double salarioBase, int id) {
        Empleado.autoincremental ++;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.empleados = new ArrayList<>();
        this.id = Empleado.autoincremental;
    }
    
    //Metodos get y set//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public int getId() {
        return id;
    }
    
   //CRUD Empleados//
    public boolean  agregarEmpleado(Empleado empleado){
        return this.empleados.add(empleado);
    }
    
    public Empleado buscarEmpleado(Empleado empleado){
        for(int i = 0;i < this.empleados.size(); i++){
            Empleado em = this.empleados.get(i);
            if (em.equals(empleado)){
               return em;
            }
        }
        return null;
    }
    
    public Empleado buscarEmpleado(String nombre){
       for(int i = 0;i < this.empleados.size(); i++){
           Empleado em = this.empleados.get(i);
           if (em.equals(nombre)){
              return em;
           }
       }
       return null;
    }
    
    public Empleado buscarEmpleado( long id){
        for (int i = 0; i < this.empleados.size(); i++){
            Empleado em = this.empleados.get(i);
            if (em.getId() == id){
                return em;
            }
        }
        return null;
    }
    
    public Empleado buscarIndicePlato (String nombre){
        for (int i = 0; i < this.empleados.size(); i++){
            Empleado em = this.empleados.get(i);
            if (em.getNombre().equals(nombre)){
                return em;
            }
        }
        return null;
    }
    
    private int buscarIndicePlato (int id){
        for (int i = 0; i < this.empleados.size(); i++){
            Empleado em = this.empleados.get(i);
            if (em.getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public Empleado actualizarEmpleado(int id, Empleado empleado){
        int index = this.buscarIndicePlato(id);
        if (index >= 0){
            return this.empleados.set(index,empleado);
        }else {
            return null;
        }
    }
    
    public Empleado eliminarEmpleados(int id){
        int index = this.buscarIndicePlato(id);
        if (index >= 0){
            return this.empleados.remove(index);
        }else {
            return null;
        }
    }
    
    public String archivoEmpleados(){
        String archivo = "";
        for ( int i=0; i > this.empleados.size(); i++ ){
            Empleado em = this.empleados.get(i);
            archivo += em.toString() + "\n";
        }
        return archivo;
    }
    
    //Metodo abstracto//
    public abstract double calcularSalario();
    
    public String toString(){
        return "Empleado: " + "\n" +
               "Id: " + id + "\n" +
               "Nombre: " + nombre + "\n" +
               "Documento Identidad: " + numeroDocumento + "\n" +
               "Edad: " + edad + "\n";
    }
    
    
}
