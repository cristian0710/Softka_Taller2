package Naves;

/**
 * Clase para crear naves tripuladas que extiendes de la clase abstracta Nave e implementa la interface de Tripulada
 */

public class CrearTripulada extends Nave implements Tripulada{
    /**
     * Atributos de la clase
     */
    static String transport ;
    private String fuel;
    private String cantPas;
    private String dest;

    /**
     * constructor
     * @param name
     */
    public CrearTripulada(String name) {
        super(name);
        this.transport = "Trasbordador";
    }

    /**
     * metodo get que retorna un string
     * @return
     */
    public String getTransport() {
        return transport;
    }

    /**
     * metodo que hereda de la clase abstracta
     * @param fuel
     */
    @Override
    public void fuel(String fuel) {
        this.fuel = fuel;
    }

    /**
     * Metodo que debe ser implementado de la interface
     * @param cantPas
     */
    @Override
    public void cantidadPasajeros(String cantPas) {
        this.cantPas = cantPas;
    }

    /**
     * Metodo que debe ser implementado de la interface
     * @param dest
     */
    @Override
    public void mission(String dest) {
        this.dest = dest;
    }

    /**
     * Metodos que me retornan tipo de combustible - cantidad pasajeros - Desntino
     * @return
     */
    public String getFuel() {
        return fuel;
    }

    public String getCantPas() {
        return cantPas;
    }

    public String getDest() {
        return dest;
    }
}
