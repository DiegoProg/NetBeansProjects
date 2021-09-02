/**
*   Clase	:   CuentasBancarias.java
*   @proposito  Crear un programa para un banco el cual va manejar el saldo de las cuentas. las cuentas van manejar el 
* nombre cliente, id de la cuenta, saldo. si la cuenta tiene un deposito realizar la suma al saldo y si retiran descontar del saldo.
* validar que si se va a realizar un retiro tenga el dinero suficiente sino mostrar un aviso "fondos insuficientes".
*
*               ATRIBUTOS SON ->   nombre_cliente String, 
*                                                        id_cuenta int 
*                                                        saldo int
*               ACCIONES- ingresar depositos y realizar retiros
*   @author	:   Nombre autor de la clase o programa
*   @version    :   1.0
*   @fecha_de_creación : 14/07/2021
*   Consideraciones : 
*   -------------- ACTUALIZACIONES --------------------------------------------
*   Descripcion:
*   Autor      :
*   Fecha      :
*/
package semana2.sesion2;

public class CuentasBancarias {
    String nombre_cliente ="";
    int id_cuenta=0;
    int saldo=0;

    public CuentasBancarias()
    {
    }
    
    //constructor
    public CuentasBancarias(int saldo)
    {
        this.saldo=saldo;
    }

    public CuentasBancarias(String nombre_cliente, int id_cuenta, int saldo)
    {
        this.saldo=saldo;
        this.nombre_cliente=nombre_cliente;
        this.id_cuenta=id_cuenta;
    }

    public void IngresarDeposito(int ValorDepositado){
        saldo = saldo+ValorDepositado;
    }
            //metodo
    public String RealizarRetiro(int valorSolicitado){
        String mensaje="";
        if(saldo>=valorSolicitado)
        {
            saldo = saldo - valorSolicitado;
            mensaje = "Su nuevo saldo es "+saldo;
        }
        else
        {
            mensaje="Fondos insuficiente";
        
        }
        return mensaje;
    }
    
            //
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "nombre_cliente=" + nombre_cliente + ", id_cuenta=" + id_cuenta + ", saldo=" + saldo + '}';
    }
}
