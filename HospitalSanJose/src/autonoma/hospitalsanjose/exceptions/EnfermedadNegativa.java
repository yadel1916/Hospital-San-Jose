/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class EnfermedadNegativa extends RuntimeException {
    
    public EnfermedadNegativa(){
        super("Enfermedad No Encontrada");
    }
    
}
