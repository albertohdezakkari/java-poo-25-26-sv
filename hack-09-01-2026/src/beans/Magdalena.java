package beans;

public class Magdalena {
    // 1º) ATRIBUTOS
    private int id;
    private String nombre;
    private double precio;
    private boolean hasChocolate;
    // 2º) CONSTRUCTOR/RES
    // 2.º: CONSTRUCTOR VACÍO
    public Magdalena(){

    }
    public Magdalena(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void printNombre() {
        System.out.println(this.nombre);
    }
    // 3º) MÉTODOS (FUNCIONES/PROCEDIMIENTOS)
    // 3.1º)getter/setters
    // fin
    public void printNombre1(){
        System.out.println(this.nombre);
    }
    @Override
    public String toString() {
        return "Magdalena{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", hasChocolate=" + hasChocolate +
                '}';
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    public double getPrecio() {
        return precio;
    }
    public boolean isHasChocolate() {
        return hasChocolate;
    }
}
