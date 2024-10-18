
package autonoma.hospitalsanjose.models;

/*
 * la clase Empleadooperativo se convierte en la clase hija, la cual hereda atributos y metodos a las clase padre ( Empleado).
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 2024 09 10
 */
public class EmpleadoOperativo extends Empleado {
    
    /**
    * el atributo area de tipo String  se refiere al area en la que labora el empleado operativo.
    */
    private String area;
   
    ///////////////////////////////////////// CONSTRUCTOR //////////////////////////////////////////

    public EmpleadoOperativo(String area, String nombre, String numeroDocumento, int edad,double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.area = area;
    }
    
    /////////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    

    //////////////////////////////////////////// METODOS /////////////////////////////////////////////////
    
   
    /**
    * el método toString devuelve  una cadena con todos los atributos deL empleado operativo.
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    public String toString(){
        return "Empleado Operativo" + "\n" +
               "Area: " + area + "\n" +
               "Salario: " + calcularSalario() + 
               super.toString() + "\n";
    }
   
    /**
    * el método calcularSalario  calcula el salario del empleado operativo.
    * @param  no recibe parámetros.
    * @return retorna un double .
    */
    @Override
    public double calcularSalario(){
        return salarioBase + (salarioBase * 0.20); 
    }
   
    
    
    
}
