/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.sesion3;

/**
 *
 * @author Usuario Autorizado
 */
public class Libros {
    int id=0;
    String nombre_libro= "";
    String autor= "";

    public Libros(int id, String nombre_libro, String autor) {
        this.id=id;
        this.nombre_libro=nombre_libro;
        this.autor=autor;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "libros{" + "id=" + id + ", nombre_libro=" + nombre_libro + ", autor=" + autor + '}';
    }
    
    
    
}
