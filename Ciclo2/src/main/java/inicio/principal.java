
package inicio;

import java.util.Scanner;


public class principal 
{
    //metodo para arrancar el programa
    public static void main(String args[])
    {
        //instanciar (crear) el objeto empleados_comcel de la clase empleados
        //instanciar el objeto empleados_comcel de la clase empleados
        empleados empleados_comcel = new empleados();
        
        //acciones al objeto empleados_comcel asignando valores
        //empleados_comcel.cedula=5555;
        //empleados_comcel.nombre="felipe completo";
        //empleados_comcel.sueldo=50000;
        //llamando las acciones
        /*int intTotalSueldo = empleados_comcel.calcularSueldo();
        System.out.println("total sueldo "+intTotalSueldo);*/
        
                Scanner scanner = new Scanner(System.in);
                System.out.println("ingrese prestamos");
                int prestamos = scanner.nextInt();

        
        int intTotalSueldo2 = empleados_comcel.calcularSueldo(prestamos, 5, 70000);
        System.out.println("total sueldo "+intTotalSueldo2);

        
        //instanciar
                vehiculo transmilenio = new vehiculo();
                transmilenio.kmsActualmente=20000;
                transmilenio.modelo=2005;
                
                vehiculo sitp = new vehiculo();
                
        
                /*Scanner scanner = new Scanner(System.in);
                System.out.println("ingrese numero 1");
                int numero_entero1 = scanner.nextInt();
                System.out.println("ingrese numero 2");*/
                int numero_entero2 = scanner.nextInt();
                int suma = 0;
                
                System.out.println("resultado suma "+suma);
                
                String nombre = "";
                System.out.println("Ingresar nombre ");
                nombre =scanner.next();
                System.out.println("Ingresó el  nombre "+nombre);
                
                float numero1float=233.44f;
                float numero2float=23.2f;
                float resultadofloat = numero1float + numero2float;
                System.out.println("resultado float "+resultadofloat);
                
    }
}
