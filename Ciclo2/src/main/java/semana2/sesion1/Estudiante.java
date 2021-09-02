/**
*   Clase	:   Estudiante.java
*   @proposito  Crear un programa para estudiantes que me ingrese 4 notas y me muestre el promedio. los atributos del estudiante
*    son nombre string, grado int , nota1 float, nota2 float, nota3 float, nota4 float.
*
*                       crear constructor con nombre y grado
*
*               ATRIBUTOS SON ->   nombre_cliente String, 
*                                                        grado int 
*                                                        notas float
*               ACCIONES- calcular promedio
*   @author	:   Nombre autor de la clase o programa
*   @version    :   1.0
*   @fecha_de_creación : 14/07/2021
*   Consideraciones : 
*   -------------- ACTUALIZACIONES --------------------------------------------
*   Descripcion:
*   Autor      :
*   Fecha      :
*/
package semana2.sesion1;


public class Estudiante {
    public String nombre="";
    public int grado=0;
    float notas1 = 0;
    float notas2 = 0;
    float notas3 = 0;
    float notas4 = 0;
    float promedio= 0;
    
    public Estudiante(String nombre, int grado)
    {
        this.nombre=nombre;
        this.grado=grado;
    }

    public Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void calcularPromedio()
    {
        promedio = (notas1+notas2+notas3+notas4)/4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public float getNotas1() {
        return notas1;
    }

    public void setNotas1(float notas1) {
        this.notas1 = notas1;
    }

    public float getNotas2() {
        return notas2;
    }

    public void setNotas2(float notas2) {
        this.notas2 = notas2;
    }

    public float getNotas3() {
        return notas3;
    }

    public void setNotas3(float notas3) {
        this.notas3 = notas3;
    }

    public float getNotas4() {
        return notas4;
    }

    public void setNotas4(float notas4) {
        this.notas4 = notas4;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
}
