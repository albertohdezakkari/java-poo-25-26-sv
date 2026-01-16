public class CuentaCorriente {
    private int numeroCuenta;
    private double saldo;
    private Cliente titular;
    private Cliente autorizado;
    private static int conObjetosCuentaCorriente = 0;

    public CuentaCorriente(double saldo,Cliente titular){
        this.saldo = saldo;
        this.titular = titular;
        conObjetosCuentaCorriente++;
    }

    public Cliente getTitular() {
        return titular;
    }

    public CuentaCorriente(double saldo, Cliente titular
            , Cliente autorizado){
        this.saldo = saldo;
        this.titular = titular;
        this.autorizado = autorizado;
        conObjetosCuentaCorriente++;
    }
    public void ingresarEfectivo(double saldo){
        this.saldo = this.saldo + saldo;
    }
    public boolean retirarEfectivo(double saldo){
        if (this.saldo>=saldo) {
            this.saldo = this.saldo - saldo;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", titular=" + titular.toString() +
                ", autorizado=" + autorizado.toString() +
                '}';
    }
}
