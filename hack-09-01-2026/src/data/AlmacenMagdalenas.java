package data;

import beans.Magdalena;

public class AlmacenMagdalenas {
    // 1º) ATRIBUTOS
    private static final int SIZE = 5;
    private Magdalena[] lstMagdalenas= new Magdalena[SIZE];
    private static int posArrayMagdalenas = -1;
    private static int contadorMagdalenas = 0;
    // 2º) CONSTRUCTOR
     /*public AlmacenMagdalenas(Magdalena magdalena){
         contMagdalenas++;
         this.lstMagdalenas[contMagdalenas] = magdalena;
     }*/
    /*public AlmacenMagdalenas(String nombreMagdalena){

    }*/
    public AlmacenMagdalenas(){

    }
    public void addMagdalena(Magdalena miMagdalena){
        posArrayMagdalenas++;
        this.lstMagdalenas[posArrayMagdalenas] = miMagdalena;
        contadorMagdalenas++;
    }
    public void addMagdalenaSinContador(Magdalena miMagdalena){
        int posEncontrada = -1;
        for (int i = 0; i < this.lstMagdalenas.length; i++) {
            if(this.lstMagdalenas[i] == null){
                posEncontrada = i;
                break;
            }
        }
        this.lstMagdalenas[posEncontrada] = miMagdalena;
    }
    public Magdalena getMagdalenaPorPosicion(int posicionMagdalena){
        Magdalena magEncontrada =
                this.lstMagdalenas[posicionMagdalena];
        return magEncontrada;
    }

    public void printAlmacen(){
        for (int i = 0; i < this.lstMagdalenas.length; i++) {
            Magdalena magEncontrada = this.lstMagdalenas[i];
            magEncontrada.printNombre();
            System.out.println(magEncontrada.toString());
        }
    }



}