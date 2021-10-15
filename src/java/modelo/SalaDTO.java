/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USER
 */
public class SalaDTO extends Pelicula{
    private int sillas;

    public SalaDTO(int sillas, int numeroSala, String tipodepublico, int precio, String nombrePeli, int horario) {
        super(numeroSala, tipodepublico, precio, nombrePeli, horario);
        this.sillas = sillas;
    }
    
    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }    
}
