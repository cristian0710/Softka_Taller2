package Naves;

public class CrearNoTripulada extends Nave implements NoTripulada {
    private String type;
    private String fuel;
    private String planet;

    public CrearNoTripulada(String name) {
        super(name);
    }

    @Override
    public void fuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void typeNave(String type) {
        this.type = type;
    }

    @Override
    public void study(String planet) {
        this.planet = planet;
    }

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
