package Naves;

public class CrearTripulada extends Nave implements Tripulada{

    static String transport ;
    private String fuel;
    private String cantPas;
    private String dest;

    public CrearTripulada(String name) {
        super(name);
        this.transport = "Trasbordador";
    }


    public String getTransport() {
        return transport;
    }

    @Override
    public void fuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void cantidadPasajeros(String cantPas) {
        this.cantPas = cantPas;
    }

    @Override
    public void mission(String dest) {
        this.dest = dest;
    }

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
