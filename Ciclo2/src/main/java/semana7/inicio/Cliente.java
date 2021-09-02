package semana7.inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Cliente {
    int id;
    String nombre;
    String telefono;
    String direccion;
    String email;
    conexion objeto_conexion    = null;
    
    public Cliente(int id, String nombre, String telefono, String direccion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cliente() {
    }

    
    public ArrayList<Cliente> getCliente(){
        Connection conexion_bd      = null;
        //su funcion es realizar todo el proceso sobre la base de datos
        PreparedStatement prdStmt = null;
        ArrayList<Cliente> arrayListCliente = new ArrayList<Cliente>();
        try{
            conexion_bd = objeto_conexion.obtener();
            String strSentenciaSql = "SELECT id, nombre FROM tienda_online.cliente ";
             prdStmt = conexion_bd.prepareStatement(strSentenciaSql);
             ResultSet resultado = prdStmt.executeQuery();
             while(resultado.next()){
                 int idTemp = resultado.getInt(1);
                 String nombreTemp = resultado.getString(2);
                 arrayListCliente.add(new Cliente(idTemp, nombreTemp));
             }
        }catch(Exception errorConsulta){
            System.out.println("la consulta no se pudo realizar "+errorConsulta);
        }finally
        {
            try
            {
                conexion_bd.close();
            }catch(Exception errorCerrarConexion)
            {
                System.out.println("la conexion no se pudo cerrar "+errorCerrarConexion);   
            }
        }
        return arrayListCliente;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + '}';
    }
    
    
    
}
