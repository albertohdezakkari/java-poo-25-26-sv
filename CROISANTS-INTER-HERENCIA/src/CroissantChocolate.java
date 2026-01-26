public class CroissantChocolate
    extends Croissant{

    private int porcentajeCacao;

    public CroissantChocolate(
            int id, String nombre, double precio,
                int gramos, int porcentajeCacao
    ){
        super(id, nombre, precio, gramos);
        // RELLENAR LOS ATRIBUTOS DE MI PADRE
            // Y LOS MÍOS
        this.porcentajeCacao = porcentajeCacao;
    }
}
