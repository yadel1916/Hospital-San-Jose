
package autonoma.hospitalsanjose.models;

/**
 *Este algoritmo modela  la ubicacion del Hospital
 * @author Andres Rodriguez
 * @version 1.0.0
 * @since 20240910
 */
public class Localización {
    
    //Atributos//
    private double longitud;
    private double latitud;
    
    //Constructor//

    public Localización(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
    
    
    //Metodos modificadores//

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

   
    
    //Metodos//
    @Override 
    public String toString(){
        return "Localizacion:" + "\n" +
               "Longitud: " + longitud + "\n" + 
               "Latitud: " + latitud + "\n";
    }
    
}
