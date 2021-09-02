package semana2.sesion2;

import java.util.Scanner;
import semana2.sesion1.Estudiante;

public class Arreglos {
    public void arregloConEnteros()
    {
        int[] enteros = new int[5];
        enteros[0]=5;
        enteros[1]=32;
        enteros[2]=53;
        enteros[3]=22;
        enteros[4]=55;
        //for normal ol antiguo
        for(int i=0;i<enteros.length;i++)
        {
            System.out.println("arreglo "+i+" es "+enteros[i]);
        }
        //for-each solo para arreglos
        for(int j : enteros)
        {
            System.out.println("recorrerlo" +j);
        }
    }
    public void CrearArregloCuentasBancariasUnoaUno()
     {
            //int[] enteros = new int[3];
            //crear arreglo de tipo objeto
            CuentasBancarias[] CuentasBancariasBancoX;
        CuentasBancariasBancoX = new CuentasBancarias[2];
            Scanner sc = new Scanner(System.in);
            String nombre_cliente ="";
            int id_cuenta=0;
            int saldo =0;   
            
             //llenarlo
            CuentasBancariasBancoX[0] = new CuentasBancarias();
            CuentasBancariasBancoX[0].setNombre_cliente("Margarita");
            CuentasBancariasBancoX[0].setId_cuenta(54575545);
            CuentasBancariasBancoX[0].setSaldo(20000);

            CuentasBancariasBancoX[1] = new CuentasBancarias();
            CuentasBancariasBancoX[1].setNombre_cliente("Pedro");
            CuentasBancariasBancoX[1].setId_cuenta(54545);
            CuentasBancariasBancoX[1].setSaldo(50000);
        
            //recorrerlo ->for -each
            for(CuentasBancarias indicesCuentasBancarias : CuentasBancariasBancoX)
            {
                System.out.println("nombre "+indicesCuentasBancarias.getNombre_cliente());
                System.out.println("id cuenta "+indicesCuentasBancarias.getId_cuenta());
                System.out.println("valores "+indicesCuentasBancarias);
            }
            for(int i=0; i<CuentasBancariasBancoX.length; i++)
            {
                System.out.println("nombre cliente "+CuentasBancariasBancoX[i].getNombre_cliente());
                System.out.println(CuentasBancariasBancoX[i]);
            }
     }
     
     public void CrearArregloCuentasBancariasSet()
     {
         //int[] enteros = new int[3];
         //crear arreglo de tipo objeto
         CuentasBancarias[] CuentasBancariasBancoX = new CuentasBancarias[2];
         try
         {
            Scanner sc = new Scanner(System.in);
            String nombre_cliente ="";
            int id_cuenta=0;
            int saldo =0;   
            for(int i=0; i<CuentasBancariasBancoX.length; i++)
            {
                CuentasBancariasBancoX[i] = new CuentasBancarias();
                System.out.println("Ingresa nombre Cliente");
                nombre_cliente =sc.next();
                System.out.println("id cuenta");
                id_cuenta =sc.nextInt();
                System.out.println("Saldo");
                saldo =sc.nextInt();
                CuentasBancariasBancoX[i] = new CuentasBancarias();
                CuentasBancariasBancoX[i].setNombre_cliente(nombre_cliente);
                CuentasBancariasBancoX[i].setId_cuenta(id_cuenta);
                CuentasBancariasBancoX[i].setSaldo(saldo);
                
            }
         }catch(Exception error)
         {
             System.out.println("se presento error al llenar el array de cuentas bancarias "+error);
         }
         try
         {
            //recorrerlo ->for -each
            for(CuentasBancarias indicesCuentasBancarias : CuentasBancariasBancoX)
            {
                System.out.println("nombre "+indicesCuentasBancarias.getNombre_cliente());
                System.out.println("id cuenta "+indicesCuentasBancarias.getId_cuenta());
                System.out.println("valores "+indicesCuentasBancarias);
            }
            for(int i=0; i<CuentasBancariasBancoX.length; i++)
            {
                System.out.println("nombre cliente "+CuentasBancariasBancoX[i].getNombre_cliente());
                System.out.println(CuentasBancariasBancoX[i]);
            }
         }catch(Exception error2)
         {
             System.out.println("se presento error al recorrer el array de cuentas bancarias "+error2);
         }

     }
    
    //metodo para hacer pruebas creando arreglos de tipo estudiante
    public void ArregloEstudiante()
    {
            Estudiante[] arreglo_estudiante = new Estudiante[2];
            
            //como llenar el arreglo
            //tarea hacer for (for(int i=0; i<arreglo_estudiante.length; i++))
            arreglo_estudiante[0] = new Estudiante();
            arreglo_estudiante[0].setNombre("Pepito");
            arreglo_estudiante[0].setGrado(5);
            arreglo_estudiante[0].setNotas1(2.4f);
            
            arreglo_estudiante[1] = new Estudiante();
            arreglo_estudiante[1].setNombre("Margarita");
            arreglo_estudiante[1].setGrado(4);
            arreglo_estudiante[1].setNotas1(4.1f);
            //como recorrelo
            for(int i=0; i<arreglo_estudiante.length; i++)
            {
                System.out.println(arreglo_estudiante[i]);
            }
    }
}
