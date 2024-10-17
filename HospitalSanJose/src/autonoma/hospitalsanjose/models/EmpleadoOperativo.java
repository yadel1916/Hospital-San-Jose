
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

    public EmpleadoOperativo(String area, String nombre, String numeroDocumento, String edad,double salarioBase, int id) {
        super(nombre, numeroDocumento, edad, salarioBase, id);
        this.area = area;
    }
    
    /////////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

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
