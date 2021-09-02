package semana3.sesion1;

public class Principal {
     public static void main(String args[])
    {
        //int identificacion, String nombre, int edad, float nota1, float nota2, float nota3, float nota4
        //instanciar 
        Estudiante estud1= new Estudiante(54444, "Adriana", 23, 2,5,3,5);
        System.out.println("el nombre ingresado es "+estud1.getEdad());
        System.out.println(estud1);
        
        /*Persona persona1 = new Persona(12112, "apuntandole a clase persona ", 454);
        System.out.println(persona1);*/
        
        
    }
}
