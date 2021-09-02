
package inicio;


public class empleados 
{
    //atributos o variables
    int cedula=0;
    String nombre= "";
    int sueldo=0;
    //metodos o accion retorne un valor
    public int calcularSueldo()
    {
        //calcule el sueldo
        int total_pagar=0;
        total_pagar = sueldo-5000;
        return total_pagar;
    }

    //metodos o accion retorne un valor
    public int calcularSueldo(int parPrestamos, int horas_extras, int subsidio)
    {
        //calcule el sueldo
        int total_pagar=0;
        total_pagar = sueldo-parPrestamos+subsidio;
        return total_pagar;
    }


}
