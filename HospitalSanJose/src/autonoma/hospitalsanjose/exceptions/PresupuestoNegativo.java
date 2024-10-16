/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.exceptions;

/**
 *
 * @author Katherin
 */
public class PresupuestoNegativo extends RuntimeException {
    
    public PresupuestoNegativo(){
        super("El presupuesto del hospital es negativo"); 
    }
    
}
