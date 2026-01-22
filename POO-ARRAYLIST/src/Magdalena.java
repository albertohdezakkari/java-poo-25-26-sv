import java.util.Objects;

public class Magdalena {
    private String nombre;

    public Magdalena(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magdalena magdalena = (Magdalena) o;
        return Objects.equals(nombre, magdalena.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    @Override
    public String toString() {
        return "Magdalena{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
