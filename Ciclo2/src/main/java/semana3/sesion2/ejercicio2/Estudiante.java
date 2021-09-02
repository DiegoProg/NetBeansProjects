package semana3.sesion2.ejercicio2;

public class Estudiante implements Persona{
 int id=0;
 String nombre="";
 int edad=0;
 int nota1=0;

    public Estudiante(int id, String nombre, int edad, int nota1) {
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
        this.nota1=nota1;
    }
    
    public String CrearHorario(int hora_inicial, int hora_final)
    {
        String horario_total= "el horario es de "+hora_inicial+ "hasta las  "+hora_final;
        return horario_total;
    }
    
    public void IngresarDatos(String nombre, int edad)
    {
        String cadena= "el usuario "+nombre+ "tiene edad  "+edad;
        System.out.println("la cadena es "+cadena);
    }
    
    public void getIdioma()
    {
        System.out.println("no retorna nada");
        //return "test";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", nota1=" + nota1 + '}';
    }
    
 
 
 
}
