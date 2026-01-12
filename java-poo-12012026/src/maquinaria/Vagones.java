package maquinaria;


public class Vagones {
    public enum TipoMercancia{
        PASAJEROS,
        MADERA,
        PRODUCTOS_QUIMICOS
    }
    /*
    * Vagones: tienen capacidad máxima de carga (en Kg),
    * capacidad actual y
    * tipo de mercancía que contienen.
    * */
    //ATRIBUTOS
    private int capacidadMax;
    private int capacidadActual;
    private TipoMercancia tipoMercancia;  //
    // CONSTRUCTORES
    public Vagones(){

    }

    public int getCapacidadMax() {
        return capacidadMax;
    }
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    public int getCapacidadActual() {
        return capacidadActual;
    }
    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

// MÉTODOS
        //getter/setters
        // toString();


}
