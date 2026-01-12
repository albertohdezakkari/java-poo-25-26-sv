import maquinaria.Vagones;
import personal.Maquinista;

public class Main {
    public static void main(String[] args) {
        Maquinista maq =
                new Maquinista();
        Maquinista maq1 =
                new Maquinista("FEDERICO");
        maq.setNombre("RODOLFO");
        System.out.println(maq.getNombre());

        Vagones vagon = new Vagones();
        vagon.setCapacidadMax(100000);
        vagon.setCapacidadActual(50000);
        vagon.setTipoMercancia("Pasajeros");
    }
}