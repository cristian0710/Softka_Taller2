package Naves;

/**
 * Clase para crear naves no tripuladas que extiendes de la clase abstracta Nave e implementa la interface de NoTripulada
 */
public class CrearNoTripulada extends Nave implements NoTripulada {
    /**
     * atributos de la clase
     */
    private String type;
    private String fuel;
    private String planet;

    /**
     * metodo constructor
     * @param name
     */
    public CrearNoTripulada(String name) {
        super(name);
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
     * @param type
     */
    @Override
    public void typeNave(String type) {
        this.type = type;
    }

    /**
     *
     * @param planet
     */
    @Override
    public void study(String planet) {
        this.planet = planet;
    }

    /**
     * Metodos que retornan tipo de nave - tipo de combustible - destino de la nave
     * @return
     */
    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public String getPlanet() {
        return planet;
    }
}
