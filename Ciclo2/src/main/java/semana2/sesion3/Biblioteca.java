package semana2.sesion3;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
    
    public void CrearArregloLibros(){
        
    }
        //aqui va el codigo para llenar el arreglo
    public void PrimerArrayList() {
        
        ArrayList<String> nombreArrayList = new ArrayList<String>();
        nombreArrayList.add("nombre1");
        nombreArrayList.add("nombr3");
        nombreArrayList.add("nombr4");
        nombreArrayList.add("nombr23");
        //for-each
        for(String indices_string : nombreArrayList)
        {
            System.out.println("valores "+indices_string);
        }
    }        
    
    public void PrimerArrayListEnteros() {
        
        ArrayList<Integer> nombreArrayList = new ArrayList<Integer>();
        nombreArrayList.add(54787);
        nombreArrayList.add(54522);
        nombreArrayList.add(554445);
        nombreArrayList.add(8888888);
        //for-each
        for(Integer indices_integer : nombreArrayList)
        {
            System.out.println("valores "+indices_integer);
        }
    }      
    
    public void PrimerArrayListObjetos() {
        
        ArrayList<Libros> nombreArrayList = new ArrayList<Libros>();
        nombreArrayList.add(new Libros(1223, "la voragine", "jose estuasio rivera"));
        nombreArrayList.add(new Libros(123, "cien años de soledad", "Gabriel Garcia marquez"));
        
        Iterator<Libros> nombreIterator = nombreArrayList.iterator();
         while(nombreIterator.hasNext()){  

             Libros lb = nombreIterator.next();
             System.out.println("el autor es "+lb.getAutor());
             if(lb.getId()==123)
             {
                 nombreIterator.remove();
             }
         }
        //for-each
        for(Libros indices_libros : nombreArrayList)
        {
            System.out.println("valores "+indices_libros);
        }
        
          for(int i=0;i<nombreArrayList.size();i++)  
           {  
            System.out.println(nombreArrayList.get(i));     
           }  
        //iterator
    }   
    public void cadenas()
    {
        //mayusculas
        String cadena="hola mundo";
        cadena = cadena.toUpperCase();
        System.out.println("cadena "+cadena);
        //longitud
        String s = "abc";
        System.out.println(s.length());
        
        //extraccion de caracteres
        
        System.out.println("cadena "+cadena.charAt(3));

        //convertir string a int
        int x =Integer.parseInt("9");
      double c = Double.parseDouble("5");
      int b = Integer.parseInt("444");

      System.out.println(x);
      System.out.println(c);
      System.out.println(b);
        
      System.out.println("value of "+String.valueOf(856454));
      //int a String
      String pruebas= String.valueOf(856454);
      
      //substring
      String strS = "dsfasdf";
      String substring1 = strS.substring(2, 5);
      System.out.println("el substring1"+substring1);
              
        //https://ikastaroak.birt.eus/edu/argitalpen/backupa/20200331/1920k/es/DAMDAW/PROG/PROG02/es_DAMDAW_PROG02_Contenidos/website_5412_operaciones_con_cadenas_de_caracteres_iii.html
    }
}
