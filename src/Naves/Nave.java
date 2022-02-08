package Naves;

/**
 * Clase abstracta de nave
 */
public abstract class Nave {
    private String name;

    /**
     * constructor de la clase abstracta
     * @param name
     */
    public Nave(String name) {
        this.name = name;
    }

    /**
     * metodo y metodo abstracto
     * @param num
     */
    public void typeTrans(int num){

    };

    /**
     * Metodo para definir tipo de combustible
     * @param fuel
     */
    public abstract void fuel(String fuel);

    /**
     * metodo que retorna el nombre de la nave
     * @return
     */
    public String getName() {
        return name;
    }
}
