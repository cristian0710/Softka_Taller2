package Naves;

public class CrearTripulada extends Nave implements Tripulada{

    private String transport;
    private String fuel;
    private int cantPas;
    private String dest;

    public CrearTripulada(String name) {
        super(name);
    }


    @Override
    public void fuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void cantidadPasajeros(int cantPas) {
        this.cantPas = cantPas;
    }

    @Override
    public void mission(String dest) {
        this.dest = dest;
    }


}
