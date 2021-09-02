package semana3.sesion1;

public class Estudiante extends Persona{
    float nota1 = 0;
    float nota2 = 0;
    float nota3 = 0;
    float nota4 = 0;

    public Estudiante(int identificacion, String nombre, int edad, float nota1, float nota2, float nota3, float nota4) {
        super(identificacion, nombre, edad);
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
    }

    public String IngresarHorario(String tipo_horario){
        String mensaje = "";
        String Tipo_pregrado= "";
        if(Tipo_pregrado.equals("UNIVERSITARIO"))
        {
            mensaje = "La persona entra en la mañana";
        }
        else
        {
            mensaje = "La persona entra en la mañana";
        }
        return mensaje;
    }
    
   public String   ValidarIdiomaIngles(String idioma){
        String mensaje = "";
        if(idioma.equals("Ingles"))
        {
            mensaje = "Se puede adminir";
        }
        return mensaje;
    }

    
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + super.getNombre() + "edad=" + super.getEdad() + " nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + '}';
    }
}
