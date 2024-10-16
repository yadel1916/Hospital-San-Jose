
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *Este algoritmo modela las caracteristicas de un Empleado
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
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
    protected String edad; 
    
    /**
    * el atributo salarioBase de tipo double  se refiere al salario que tiene el empleado.
    */
    protected double salarioBase; 
    
    /**
    * el atributo listaEmpleado de tipo ArrayList  se refiere a la lista de los empleados 
    */
    private ArrayList<Empleado> listaEmpleados;
    
    /**
    * el atributo id de tipo int  se refiere a identificador.
    */
    private int id;
    
    ///////////////////////////////////////////// CONSTRUCTOR /////////////////////////////////////////////

    public Empleado(String nombre, String numeroDocumento, String edad,double salarioBase, int id) {
        Empleado.autoincremental ++;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.listaEmpleados = new ArrayList<>();
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
        return listaEmpleados;
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
    * el método agregarEmpleado agrega el empleado a la lista
    * @param  recibe como parametro el empleado tipo Empleado.
    * @return retorna una booleano
    */
    public boolean  agregarEmpleado(Empleado empleado){
        return this.listaEmpleados.add(empleado);
    }
    
    /**
    * el método buscarEmpleado busca el empleado en  la lista
    * @param  recibe como parametro el empleado tipo Empleado.
    * @return retorna un Empleado em.
    */
    public Empleado buscarEmpleado(Empleado empleado){
        for(int i = 0;i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.equals(empleado)){
               return em;
            }
        }
        return null;
    }
    
    /**
    * el método buscarEmpleadoNombre busca el empleado en la lista por el nombre
    * @param  recibe como parametro nombre de tipo String.
    * @return retorna un Empleado em.
    */
    public Empleado buscarEmpleadoNumDocumento(String numeroDocumento){
       for(int i = 0;i < this.listaEmpleados.size(); i++){
           Empleado em = this.listaEmpleados.get(i);
           if (em.equals(numeroDocumento)){
              return em;
           }
       }
       return null;
    }
    
    /**
    * el método buscarEmpleadoId busca el empleado en la lista por el Id
    * @param  recibe como parametro id de tipo long.
    * @return retorna un Empleado em.
    */
    public Empleado buscarEmpleadoId( int id){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.getId() == id){
                return em;
            }
        }
        return null;
    }
    
    /**
    * el método buscarIndiceEmpleado busca el indice del empleado
    * @param  recibe como parametro id de tipo long.
    * @return retorna un Empleado em.
    */
    public Empleado buscarIndiceEmpleado(String nombre){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.getNombre().equals(nombre)){
                return em;
            }
        }
        return null;
    }
    
    /**
    * el método buscarIndiceEmpleadoId busca el indice del empleado por el id
    * @param  recibe como parametro id de tipo long.
    * @return retorna un Empleado em.
    */
    private int buscarIndiceEmpleadoId (int id){
        for (int i = 0; i < this.listaEmpleados.size(); i++){
            Empleado em = this.listaEmpleados.get(i);
            if (em.getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    /**
    * el método actualizarEmpleado actualiza los cambios realizados  del empleado
    * @param  recibe como parametro id de tipo long.
    * @return retorna un Empleado em.
    */
    public Empleado actualizarEmpleado(int id, Empleado empleado){
        int index = this.buscarIndiceEmpleadoId(id);
        if (index >= 0){
            return this.listaEmpleados.set(index,empleado);
        }else {
            return null;
        }
    }
    
    /**
    * el método eliminarEmpleado elimina el empleado de la lista
    * @param  recibe como parametro id de tipo int.
    * @return retorna un Empleado em.
    */
    public Empleado eliminarEmpleados(int id){
        int index = this.buscarIndiceEmpleadoId(id);
        if (index >= 0){
            return this.listaEmpleados.remove(index);
        }else {
            return null;
        }
    }
    
//    public String archivoEmpleados(){
//        String archivo = "";
//        for ( int i=0; i > this.listaEmpleados.size(); i++ ){
//            Empleado em = this.listaEmpleados.get(i);
//            archivo += em.toString() + "\n";
//        }
//        return archivo;
//    }
    
    /**
    * el método calcularSalario devuelve  una double con los requisitos para calcular el salario de cada empleado .
    * @param  no recibe parámetros.
    * @return retorna un double.
    */
    public abstract double calcularSalario();
    
    
    
    
}
