public class Main {
    public static void main(String[] args) {
        Cliente cliente3 = new Cliente();
        cliente3.setNombre("ANA");

        CuentaCorriente cuentaCorriente1
                    = new CuentaCorriente(150.00,
                                new Cliente());

        CuentaCorriente cuentaCorriente2
                = new CuentaCorriente(200.00,
                new Cliente());

        CuentaCorriente cuentaCorriente3
                = new CuentaCorriente(150.00,
                cliente3);
            // cuentaCorriente1.getTitular().setNombre("PEPE");
            // cuentaCorriente1.getTitular().setApellidos("FEDERICO");
        cliente3.getLstCuentasTuneado().add(cuentaCorriente1);
        cliente3.getLstCuentasTuneado().add(cuentaCorriente2);
        cliente3.getLstCuentasTuneado().add(cuentaCorriente3);

        System.out.println(cliente3.toString());
        for (int i = 0; i < cliente3.getLstCuentasTuneado().size()  ; i++) {
            CuentaCorriente cuentC = cliente3.getLstCuentasTuneado().get(i);
            System.out.println(cuentC.toString());
        }



    }
}