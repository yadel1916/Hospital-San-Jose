/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo muestra  las caracteristicas del Gerente del hospital
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Gerente  {
    
    //Atributos//
    private String nombre;
    private String numDocumento;
    private int edad;
    private String carrera;
    
    //Constructor//

    public Gerente(String nombre, String numeroDocumento, int edad, String carrera) {
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    //Metods get y set//

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    public String toString(){
        return "Gerente: " + "\n" +
               "Nombre: " + nombre + "\n" +
               "Numer Documento: " + numDocumento + "\n" +
               "Edad: " + edad + "\n" +
               "Carrera: " + carrera + "\n";
               
    }
}
