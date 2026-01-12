package maquinaria;

import personal.Mecanico;

public class Locomotora {
    /*
    Locomotoras: tienen matrícula, potencia de motor y
    año de fabricación. Además,
    cada locomotora tiene asignado un mecánico
    que se encarga de su mantenimiento.
    * */
    // ATRIBUTOS
    private String matricula;
    private int potenciaCV;
    private String anyoFabricacion;
    private Mecanico mecanico;
    // CONSTRUCTOR/ES
    public Locomotora(Mecanico mecanico, String matricula,
                        int potenciaCV, String anyoFabricacion){
        this.mecanico = mecanico;
        this.matricula = matricula;
        this.potenciaCV = potenciaCV;
        this.anyoFabricacion = anyoFabricacion;
    }
    public Locomotora(String matricula,
                      int potenciaCV, String anyoFabricacion){
        this.matricula = matricula;
        this.potenciaCV = potenciaCV;
        this.anyoFabricacion = anyoFabricacion;
    }
    public void addMecanino(Mecanico mecanico){
        this.mecanico = mecanico;
    }
    public Locomotora(Mecanico mecanico){
        this.mecanico = mecanico;
    }
    // MÉTODOS
        // getter/setter
        // toString();
}
