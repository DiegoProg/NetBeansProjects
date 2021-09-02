package semana2.sesion3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal2 {
    
    public static void main(String args[])
    {

         ArrayList<Libros> arrayListLibros = new ArrayList<Libros>();
         Scanner sc = new Scanner(System.in);
         String respuesta ="";
         try
         {
            do
            {
                   System.out.println("Ingresa id");
                   int id =sc.nextInt();
                   System.out.println("Ingrese nombre libro");
                   String  nombre_libro =sc.next();
                   System.out.println("Ingrese autor");
                   String  autor =sc.next();
                   arrayListLibros.add(new Libros(id, nombre_libro, autor));
                   System.out.println("desea ingresar mas libros SI/NO");
                   respuesta =sc.nextLine();
                   respuesta =sc.next();
            }while(respuesta.equals("SI"));
         }
         catch(Exception e)
            {
               System.out.println("se presento un error al ingresar los libros "+e);

            }
         
         Iterator<Libros> iteratorLibros = arrayListLibros.iterator();
         while(iteratorLibros.hasNext())
         {
             Libros nuevoObjeto = iteratorLibros.next();
             System.out.println(nuevoObjeto);
             //System.out.println("autor "+ nuevoObjeto.getAutor());
             //System.out.println(nuevoObjeto);
             int num_idTemp = nuevoObjeto.getId();
             if(num_idTemp==1)
             {
                 System.out.println("el id 1 es de "+nuevoObjeto);
             }
               if(num_idTemp==1)
             {
                 iteratorLibros.remove();
             }
              
             
             String autorTemp = nuevoObjeto.getAutor();
             nuevoObjeto.setAutor("cambio autor");
             if(autorTemp.equals("AUTOR1"))
             {
                 nuevoObjeto.setAutor("CAMBIO AUTOR");
             }
             
         }
         System.out.println("RECORRER LA SEGUNDA VEZ ");
         Iterator<Libros> iteratorLibros2 = arrayListLibros.iterator();
         while(iteratorLibros2.hasNext())
         {
             Libros nuevoObjeto = iteratorLibros2.next();
             System.out.println("autor "+ nuevoObjeto.getAutor());
             System.out.println(nuevoObjeto);
             int num_idTemp = nuevoObjeto.getId();
         }
         
    }
    
}
