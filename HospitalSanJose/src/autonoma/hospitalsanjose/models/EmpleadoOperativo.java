
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo hereda las caracteristicas de un Empleado
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class EmpleadoOperativo extends Empleado {
    
    //Atributos//
    private String area;
    private double salario;
    
    //Constructor//

    public EmpleadoOperativo(String area, String nombre, String numeroDocumento, String edad,double salarioBase, int id) {
        super(nombre, numeroDocumento, edad, salarioBase, id);
        this.area = area;
        this.salario = salarioBase;
    }
    
    //Metodos get y set//

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioBase() {
        return salario;
    }

    public void setSalarioBase(double salario) {
        this.salario = salario;
    }
    
    //Metodo//
    
   
    @Override
    public double calcularSalario(){
        return salario+ (salario * 0.20);
    }
   
    public String toString(){
        return "Empleado Operativo" + "\n" +
               "Area: " + area + "\n" +
               "Salario Base: " + salario + "\n" +
               "Salario: " + calcularSalario() + 
               super.toString() + "\n";
    }
    
    
}
