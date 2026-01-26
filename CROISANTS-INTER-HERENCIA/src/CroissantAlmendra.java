import interfaces.CroissantActions;
import interfaces.Cubierta;
import interfaces.Horneable;
import interfaces.Rellenable;

public class CroissantAlmendra
    extends Croissant
    implements Horneable, Cubierta {
    private int porcentajeAlmendra;
    public CroissantAlmendra(int id, String nombre,
                             double precio, int gramos,
                            int porcentajeAlmendra) {
        super(id, nombre, precio, gramos);
        this.porcentajeAlmendra = porcentajeAlmendra;
    }
    public void modificarGramos(int gramos){
        super.setGramos(gramos);
        // this.
        // BONITO ACADÉMICAMENTE
            // super.gramos = gramos;
    }

    @Override
    public void hornear() {
        System.out.println("Croissant horneado. ");
    }

    @Override
    public void coberturaTopping() {
        System.out.println("Croissant cubierto de almendra. ");
    }



    /*@Override
    public void horneable() {
        // Sí
    }

    @Override
    public void rellenable() {
        // No
    }

    @Override
    public void cubierto() {
        // Sí
    }*/

    @Override
    public String toString() {
        return "CroissantAlmendra{" +
                "porcentajeAlmendra=" + porcentajeAlmendra +
                "} " + super.toString();
    }
}
