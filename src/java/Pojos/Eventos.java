/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

import java.io.Serializable;

/**
 *
 * @author Amedc
 */
public class Eventos implements Serializable {

    private String codigoevento;
    private String fecha;
    private String lugar;
    private String nombreorganizador;
    private String telorganizador;
    private String cantinvitados;
    private String nombrepatrocinador;
    private String telpatrocinador;
    private int estado;
   
    

    /**
     * Creates a new instance of Cliente
     */
    public Eventos() {
    }

    //Metodos gets y sets

    public String getCodigoevento() {
        return codigoevento;
    }

    public void setCodigoevento(String codigoevento) {
        this.codigoevento = codigoevento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombreorganizador() {
        return nombreorganizador;
    }

    public void setNombreorganizador(String nombreorganizador) {
        this.nombreorganizador = nombreorganizador;
    }

    public String getTelorganizador() {
        return telorganizador;
    }

    public void setTelorganizador(String telorganizador) {
        this.telorganizador = telorganizador;
    }

    public String getCantinvitados() {
        return cantinvitados;
    }

    public void setCantinvitados(String cantinvitados) {
        this.cantinvitados = cantinvitados;
    }

    public String getNombrepatrocinador() {
        return nombrepatrocinador;
    }

    public void setNombrepatrocinador(String nombrepatrocinador) {
        this.nombrepatrocinador = nombrepatrocinador;
    }

    public String getTelpatrocinador() {
        return telpatrocinador;
    }

    public void setTelpatrocinador(String telpatrocinador) {
        this.telpatrocinador = telpatrocinador;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

   
}
