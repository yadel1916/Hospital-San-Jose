/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.main;

import autonoma.hospitalsanjose.models.Empleado;
import autonoma.hospitalsanjose.models.EmpleadoAreaSalud;
import autonoma.hospitalsanjose.models.EmpleadoOperativo;
import autonoma.hospitalsanjose.models.Farmacia;
import autonoma.hospitalsanjose.models.Gerente;
import autonoma.hospitalsanjose.models.Hospital;
import autonoma.hospitalsanjose.models.Inventario;
import autonoma.hospitalsanjose.models.Localizacion;
import autonoma.hospitalsanjose.models.Nomina;
import autonoma.hospitalsanjose.models.Paciente;
import autonoma.hospitalsanjose.views.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres Rodriguez
 */
public class Prueba {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Localizacion ubicación = new Localizacion(12.3, 11.3);
        Gerente gerente = new Gerente("jabier","1232344", 19,"administrador");
//        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
//        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        //Paciente p = new Paciente("Katherin","123",27,"kathe@.com","340976","Saludable");
        Inventario i = new Inventario(12,"1900");
        Farmacia f = new Farmacia(i); 
        Nomina n = new Nomina("2024-17-10"); 
        
        Hospital h1 = new Hospital("juan","calle27-A","448-242-255", 120000000, 100000000, "13/06/2000", "Activo", ubicación,gerente,n,f);
        VentanaPrincipal ventana =  new VentanaPrincipal(h1);
        ventana.setVisible(true);
//        
//        EmpleadoAreaSalud emp1 = new EmpleadoAreaSalud("Cirujano",13,2.400,"Nicolas", "143343","30",1);
//        EmpleadoOperativo emp2 = new EmpleadoOperativo("Infantil",1.500,"Elena","394800","26",3);
//        
//        
//        Nomina nomina = new Nomina("120723",1,56.54423,null);
//        nomina.agregarEmpleado(emp1);
//        nomina.agregarEmpleado(emp2);
//        
//        nomina.generarNomina(h1);
//        
//        System.out.println(nomina.getTotalNomina());
//        System.out.println(h1.getPresupuesto());
//        System.out.println(h1.getEstado());
//        
//        
//        System.out.println(h1.toString());
    }
    
}
