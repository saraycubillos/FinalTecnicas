/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonaDAO{   
    Connection conexion;
    
    public PersonaDAO() {
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    //metodo que me muestra el listado de todos los productos y que vamos a tener en la tabla
    public List<PersonaDTO> listarPersonas(){
        
        PreparedStatement ps;  // Establecer la conexion entre java y MySQL
        ResultSet rs; //contiene los resultados de una consulta SQL
        
        List<PersonaDTO> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT id, nombre, apellido, edad FROM persona");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                
                PersonaDTO persona = new PersonaDTO(id, nombre, apellido, edad);
                
                lista.add(persona);
            }
            return lista;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
    public PersonaDTO mostrarPersonas(int _id){ //_id para utilizar como variable
        
        PreparedStatement ps;  // Establecer la conexion entre java y MySQL
        ResultSet rs;
        PersonaDTO persona = null;
        
        try{
            ps = conexion.prepareStatement("SELECT id, nombre, apellido, edad FROM persona WHERE id=?"); //Where especifica criterios que tienen que cumplir los valores de campo y debemos agregar (id)
            ps.setInt(1, _id); //Es la posicion 1 porque es lo primero que ingresa la persona antes de nombre ....
            rs = ps.executeQuery(); //Si la sentencia SQL es una Consulta, entoces se utiliza el método executeQuery
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                
                persona = new PersonaDTO(id, nombre, apellido, edad);
            }
            return persona;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
     
    public boolean insertar(PersonaDTO persona){ //_id para utilizar como variable
        
        PreparedStatement ps;  // Establecer la conexion entre java y MySQL
        
        try{
            ps = conexion.prepareStatement("INSERT INFO persona (nombre,apellido,edad) VALUES(?,?,?)"); //Where especifica criterios que tienen que cumplir los valores de campo y debemos agregar (id)
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setInt(3, persona.getEdad());
            ps.execute(); //Ejecuta la instrucción SQL especificada, que puede devolver varios resultados, e indica al Controlador Microsoft JDBC para SQL Server que las claves 
            //que se han generado automáticamente y están presentes en la matriz dada deben estar disponibles para su recuperación.
            return true;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    } 
    
    public boolean actualizar(PersonaDTO persona){
        
        PreparedStatement ps;  // Establecer la conexion entre java y MySQL
        
        try{
            ps = conexion.prepareStatement("UPDATE persona SET nombre=?,apellido=?,edad=? WHERE id=?"); //Where especifica criterios que tienen que cumplir los valores de campo y debemos agregar (id)
             //Es la posicion 1 porque es lo primero que ingresa la persona antes de nombre ....
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setInt(3, persona.getEdad());
            ps.setInt(4, persona.getId());
            ps.execute();
            return true;
            
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    } 
    
    public boolean eliminar(int _id){
        
        PreparedStatement ps;  // Establecer la conexion entre java y MySQL
        
        try{
            ps = conexion.prepareStatement("DELETE FROM persona WHERE id=?"); //Where especifica criterios que tienen que cumplir los valores de campo y debemos agregar (id)
             //Es la posicion 1 porque es lo primero que ingresa la persona antes de nombre ...
            ps.setInt(1, _id);
            ps.execute();
            return true;
            
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    } 
}
