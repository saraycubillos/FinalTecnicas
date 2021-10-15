/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import java.sql.Time;

/**
 *
 * @author USER
 */
public class Pelicula {
    private int numeroSala;
    private String tipodepublico;
    private int precio;
    private String nombrePeli;
    private int horario;

    public Pelicula() {
    }
    
    

    public Pelicula(int numeroSala, String tipodepublico, int precio, String nombrePeli, int horario) {
        this.numeroSala = numeroSala;
        this.tipodepublico = tipodepublico;
        this.precio = precio;
        this.nombrePeli = nombrePeli;
        this.horario = horario;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getTipodepublico() {
        return tipodepublico;
    }

    public void setTipodepublico(String tipodepublico) {
        this.tipodepublico = tipodepublico;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    
    
}
