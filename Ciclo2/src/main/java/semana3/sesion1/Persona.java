package semana3.sesion1;

public class Persona {
    int identificacion = 0;
    String nombre="";
    int edad = 0;

    public Persona(int identificacion, String nombre, int edad) {
        this.identificacion = identificacion;
        this.nombre=nombre;
        this.edad = edad;
    }

    public String  IngresarHorario(String tipo_horario){
        String mensaje = "La persona entra en la mañana";
        return mensaje;
    }
            
    public String  ValidarIdioma(String idioma){
        String mensaje = "";
        if(idioma.equals("Español"))
        {
            mensaje = "Se puede adminir";
        }
        return mensaje;
    }

    
    public int getIdentificacion() {
        return identificacion;
    }
    
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
}
