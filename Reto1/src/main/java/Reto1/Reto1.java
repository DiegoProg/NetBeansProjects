/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto1;

import java.util.Scanner;

/**
 *
 * @author ARL
 */
public class Reto1 {
    
    
   
   
    public static void main (String [] args)
          
    {
        
     Scanner sc = new Scanner(System.in);
     
     int maximo = 3;
     int mayor = 0;
     int num;
     
     for (int i=0;i<=maximo;i++)
            {
                System.out.print("Ingrese numero");
                num=sc.nextInt();
                
                if (num>mayor)
                    {   
                        mayor=num;
                
                    }
                
                
                
            }
   System.out.print("El numero mayor es" + mayor);
    }
    
}