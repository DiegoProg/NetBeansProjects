package semana3.sesion2;

public class Estudiante extends Persona{
    int nota_1=0;
    int nota_2=0;
    int nota_3=0;

    
    public Estudiante(String nombres, int id, int edad, int nota_1, int nota_2, int nota_3) {
        super(nombres, id, edad);
        this.nota_1=nota_1;
        this.nota_2=nota_2;
        this.nota_3=nota_3;
    }
    
    public String IngresarDatos(String nombre, int edad)
    {
        String cadena = "nombre "+nombre+ " edad "+edad;
        return cadena;
    }
    
    public int getNota_1() {
        return nota_1;
    }

    public void setNota_1(int nota_1) {
        this.nota_1 = nota_1;
    }

    public int getNota_2() {
        return nota_2;
    }

    public void setNota_2(int nota_2) {
        this.nota_2 = nota_2;
    }

    public int getNota_3() {
        return nota_3;
    }

    public void setNota_3(int nota_3) {
        this.nota_3 = nota_3;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + super.getNombres() + "nota_1=" + nota_1 + ", nota_2=" + nota_2 + ", nota_3=" + nota_3 + '}';
    }
    
    
}
