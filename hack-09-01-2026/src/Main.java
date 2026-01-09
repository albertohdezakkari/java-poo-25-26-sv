import beans.Magdalena;
import data.AlmacenMagdalenas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1º PILAR FUNDAMENTAL DE LA POO = ENCAPSULACIÓN
        Magdalena miMagdlena1 = new Magdalena("Pistacho Boom!");
        Magdalena miMagdlena2 = new Magdalena("Chocolate Sexy!");
        System.out.println(miMagdlena2.getNombre());
        miMagdlena2.printNombre1();
        System.out.println(miMagdlena2.toString());
        miMagdlena2.setNombre("Pistacho rabioso!!!");
        miMagdlena2.getNombre();
        System.out.println(miMagdlena2.toString());

        miMagdlena2.printNombre();

        AlmacenMagdalenas miAlmacenMagdalenas1 =
                new AlmacenMagdalenas();
        miAlmacenMagdalenas1.
                addMagdalena(miMagdlena1);
        miAlmacenMagdalenas1.addMagdalena(miMagdlena2);
        miAlmacenMagdalenas1.addMagdalena(miMagdlena1);
        miAlmacenMagdalenas1.addMagdalena(miMagdlena2);
        miAlmacenMagdalenas1.addMagdalena(miMagdlena1);
        miAlmacenMagdalenas1.printAlmacen();

        // AlmacenMagdalenas miAlmacenMagdalenas2 =
        //       new AlmacenMagdalenas(miMagdlena1);


    }
}