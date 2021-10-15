/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class SalaDAO {
    public void crearSala(int sillas,int numeroSala,String tipoPublico,int precio,String nombrePeli,int horario){
        SalaDTO sala = new SalaDTO(sillas,numeroSala,tipoPublico,precio,nombrePeli,horario);
        
        ManejoDato.crearSala.add(sala);
    }
    
    public void consultarSala(){
        
    }
    
    public void actualizarSala(){
    
    }
    
    public void borrarSala(){
    
    }
}
