package semana2.sesion1;

public class Principal {
    public static void main(String args[])
    {
        
        //instanciar (crear) un objeto CuentasBancariasBancoX de la clase CuentasBancarias
          CuentasBancarias CuentasBancariasBancoX = new CuentasBancarias("Rafael Escalona", 454577, 10000);
          //CuentasBancariasBancoX.setSaldo(100000);
          CuentasBancariasBancoX.IngresarDeposito(40000);
          System.out.println("el saldo es "+CuentasBancariasBancoX.getSaldo());
          String mensaje = CuentasBancariasBancoX.RealizarRetiro(20000);
          System.out.println(mensaje);
    }
}
