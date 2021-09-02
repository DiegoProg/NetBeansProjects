
package semana4.sesion3;

import java.util.Date;

public class Estudiante2 {
    String nombre="";
    String tipo_documento="";
    String genero="";
    Date fecha_nacimiento=null;

    public Estudiante2(String nombre, String tipo_documento, String genero, Date fecha_nacimiento) {
        this.nombre=nombre;
        this.tipo_documento=tipo_documento;
        this.genero=genero;
        this.fecha_nacimiento=fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", tipo_documento=" + tipo_documento + ", genero=" + genero + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
}
