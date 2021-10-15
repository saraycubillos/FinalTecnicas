/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class SalaDAO {
    public void crearSala(int sillas,int numeroSala,String tipoPublico,int precio,String nombrePeli,int horario){
        SalaDTO sala1 = new SalaDTO(sillas,numeroSala,tipoPublico,precio,nombrePeli,horario);
        SalaDTO sala2 = new SalaDTO(sillas, numeroSala, tipoPublico, precio, nombrePeli, horario);
        SalaDTO sala3 = new SalaDTO(sillas, numeroSala, tipoPublico, precio, nombrePeli, horario);
        
        ManejoDato.crearSala.add(sala1);
        ManejoDato.crearSala.add(sala2);
        ManejoDato.crearSala.add(sala3);
        
        int recaudoRecobroTramite = 0;
        for(int i = 0; i < ManejoDato.crearSala.size(); i++)
        {
        recaudoRecobroTramite += ManejoDato.crearSala.get(i).getPrecio(); 
        }
    }
    
    public void consultarSala(){
        
    }
    
    public void actualizarSala(){
    
    }
    
    public void borrarSala(){
    
    }
}
