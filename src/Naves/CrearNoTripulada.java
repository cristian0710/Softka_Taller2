package Naves;

public class CrearNoTripulada extends Nave implements NoTripulada {

    private String transport;
    private String fuel;

    public CrearNoTripulada(String name) {
        super(name);
    }

    public void typeTrans(String transport) {
        this.transport = transport;
    }

    @Override
    public void fuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void typeNave() {

    }

    @Override
    public void study() {

    }
}
