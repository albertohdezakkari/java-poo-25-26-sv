import java.util.Objects;

public class Croissant {
    private int id;
    private String nombre;
    private double precio;
    // protected int gramos;
    private int gramos;

    public Croissant(int id, String nombre, double precio, int gramos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.gramos = gramos;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getGramos() {
        return gramos;
    }
    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Croissant croissant = (Croissant) o;
        return id == croissant.id && Double.compare(croissant.precio, precio) == 0 && gramos == croissant.gramos && Objects.equals(nombre, croissant.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, gramos);
    }
    @Override
    public String toString() {
        return "Croissant{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", gramos=" + gramos +
                '}';
    }
}
