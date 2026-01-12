package maquinaria;

import personal.Maquinista;

public class Tren {
    private static final int CAPAC_MAX = 5;
    private Locomotora locomotora;
    private Vagones[] lstVagones;
    private Maquinista maquinista;
    private int posLstVagon = 0;
    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.lstVagones = new Vagones[CAPAC_MAX];
    }
    public void addVagon(Vagones vagones){
        this.lstVagones[this.posLstVagon] = vagones;
    }
}
