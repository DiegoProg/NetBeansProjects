
package semana3.sesion2;

public abstract class Persona {
    String nombres="";
    int id=0;
    int edad=0;

    
    public Persona(String nombres, int id, int edad) {
        this.nombres=nombres;
        this.id=id;
        this.edad=edad;
    }
    
    public abstract String IngresarDatos(String nombres, int edad);
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
