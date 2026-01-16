import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private CuentaCorriente lstCuentasCorriente[] = new CuentaCorriente[10];
    private ArrayList<CuentaCorriente> lstCuentasTuneado
                            = new ArrayList();

    public ArrayList<CuentaCorriente> getLstCuentasTuneado() {
        return lstCuentasTuneado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
