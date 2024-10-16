
package autonoma.hospitalsanjose.models;

/**
 * la clase Gerente definirá el nombre y sus atributos del Gerente del hospital
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 2024 09 10
 */
public class Gerente  {
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre del gerente del gerente.
    */
    private String nombre; 
    
    /**
    * el atributo numeroDocumento de tipo String  se refiere al ID identificativo del gerente.
    */
    private String numeroDocumento; 
    
    /**
    * el atributo edad de tipo int  se refiere a la edad del gerente.
    */
    private int edad;
    
    /**
    * el atributo carrera de tipo String  se refiere a la carrera profesional del gerente. .
    */
    private String carrera; 
    
    
    /////////////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////////////7

    public Gerente(String nombre, String numeroDocumento, int edad, String carrera) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    
    
    //////////////////////////////////////////// METODOS DE ACCESO ///////////////////////////////////////

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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    //////////////////////////////////////////// METODOS ////////////////////////////////////////////
    
    /**
    * el método toString devuelve  una cadena con todos los atributos deL Gerente.
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    @Override
    public String toString() {
        return "Gerente{" + "nombre=" + nombre + ", numeroDocumento=" + numeroDocumento + ", edad=" + edad + ", carrera=" + carrera + '}';
    }
}
    