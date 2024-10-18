
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 * la clase Empleado es una clase abstracta, que heredará sus características a las clases hijas.
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 2024 09 10
 */
public abstract class Empleado {
    
    /**
    * el atributo autoincremental de tipo int  autoincrementa lo asignado.
    */
    private static int autoincremental = 0;
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre del empleado del hospital.
    */
    protected String nombre; 
    
    /**
    * el atributo numeroDocumento de tipo String  se refiere al ID identificativo del empleado.
    */
    protected String numeroDocumento; 
    
    /**
    * el atributo edad de tipo int  se refiere a la edad del empleado.
    */
    protected int edad; 
    
    /**
    * el atributo salarioBase de tipo double  se refiere al salario que tiene el empleado.
    */
    protected double salarioBase; 
    
    /**
    * el atributo id de tipo int  se refiere a identificador.
    */
    private int id;
    
    ///////////////////////////////////////////// CONSTRUCTOR /////////////////////////////////////////////

    public Empleado(String nombre, String numeroDocumento, int edad,double salarioBase) {
        Empleado.autoincremental ++;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.id = Empleado.autoincremental;
    }
    
    ////////////////////////////////////////////METODOS DE ACCESO ////////////////////////////////////

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public int getId() {
        return id;
    }
    
    ////////////////////////////////////////////// METODOS ////////////////////////////////////////////

    /**
    * el método toString devuelve  una cadena con todos los atributos deL empleado.
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numeroDocumento=" + numeroDocumento + ", edad=" + edad + ", salarioBase=" + salarioBase + '}';
    }
    
    
    
    /**
    * el método calcularSalario reune los requisitos para calcular el salario de cada empleado .
    * @param  no recibe parámetros.
    * @return retorna un double.
    */
    public abstract double calcularSalario();
    
    
    
    
}
    
    
//    public String archivoEmpleados(){
//        String archivo = "";
//        for ( int i=0; i > this.listaEmpleados.size(); i++ ){
//            Empleado em = this.listaEmpleados.get(i);
//            archivo += em.toString() + "\n";
//        }
//        return archivo;
//    }
    
   
