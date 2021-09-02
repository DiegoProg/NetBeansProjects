package semana2.sesion1;

public class Principal2 {
    public static void main(String args[])
    {
        Estudiante estudiante_colegio_a = new Estudiante("Rafa",5);
        estudiante_colegio_a.setNotas1(4.2f);
        estudiante_colegio_a.setNotas2(1.3f);
        estudiante_colegio_a.setNotas3(2.2f);
        estudiante_colegio_a.setNotas4(4.3f);
        estudiante_colegio_a.calcularPromedio();
        System.out.println("el promedio es "+estudiante_colegio_a.getPromedio());
    }
}
