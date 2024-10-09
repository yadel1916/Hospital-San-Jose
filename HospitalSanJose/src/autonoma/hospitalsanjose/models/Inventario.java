
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un inventario
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Inventario {
    
    //Atributos//
    private static int autoincremental = 0;
    
    private int codigo;
    private String anoActualización;
    private ArrayList<Medicamento> medicamentos;
    
}
