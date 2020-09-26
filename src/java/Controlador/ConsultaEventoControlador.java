/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultaEventoModelo;
import Pojos.Eventos;
import Utilidades.Mensajes;
import java.io.Serializable;
import java.util.ArrayList;
import org.primefaces.PrimeFaces;

/**
 *
 * @author amedc
 */
public class ConsultaEventoControlador implements Serializable{
    private String codigo;
    private ArrayList<Eventos> listaEventos = new ArrayList<>();
    private Eventos eventoSeleccionado = new Eventos();
     /**
     * Atributos para actualizar el cliente
     */
    private String fechaActualizar;
    private String lugarActualizar;
    private String nombreorganizadorActualizar;
    private String telorganizadorActualizar;
    private String cantinvitadosActualizar;
    private String nombrepatrocinadorActualizar;
    private String telpatrocinadorActualizar;
    

    /**
     * Creates a new instance of ConsultaEventoControlador
     */
    public ConsultaEventoControlador() {
    }
    
     /**
     * Metodo que cosulta un cliente a traves del nit
     */
    public void consultarEventoCodigo(){
        try {
            ConsultaEventoModelo modelo = new ConsultaEventoModelo();
            listaEventos = modelo.consultaEventoCodigo(getCodigo());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Metodo que muestra cliente seleccionado de la tabla
     */
    public void mostrarEventoSeleccionado(){
        try {
            if(eventoSeleccionado != null){
                setFechaActualizar(eventoSeleccionado.getFecha());
                setLugarActualizar(eventoSeleccionado.getLugar());
                setNombreorganizadorActualizar(eventoSeleccionado.getNombreorganizador());
                setTelorganizadorActualizar(eventoSeleccionado.getTelorganizador());
                setCantinvitadosActualizar(eventoSeleccionado.getCantinvitados());
                setNombrepatrocinadorActualizar(eventoSeleccionado.getNombrepatrocinador());
                setTelpatrocinadorActualizar(eventoSeleccionado.getTelpatrocinador());
                PrimeFaces current = PrimeFaces.current();
                current.executeScript("PF('dlgActualizarEvento').show();");
            }else{
                 Mensajes.mensaje("Advertencia", "Debe seleccionar primero un evento", 3);
                 }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    /**
     * Metodo que actualiza cliente de la tabla
     */
    public void actualizarEvento(){
        try {
            Eventos evento = new Eventos();
            evento.setCodigoevento(getCodigo());
            evento.setFecha(getFechaActualizar());
            evento.setLugar(getLugarActualizar());
            evento. setNombreorganizador(getNombreorganizadorActualizar());
            evento.setTelorganizador(getTelorganizadorActualizar());
            evento.setCantinvitados(getCantinvitadosActualizar());
            evento.setNombrepatrocinador(getNombrepatrocinadorActualizar());
            evento.setTelpatrocinador(getTelpatrocinadorActualizar());
            ConsultaEventoModelo modelo = new ConsultaEventoModelo();
            String resultado = modelo.actualizarEvento(evento);
            if(resultado.equals("exito")){
                Mensajes.mensaje("Exito", "Evento modificado correctamente :)", 1);
            }else{
                Mensajes.mensaje("Error", "Error al modificar evento :(", 2);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    /**
     * Metodos Get & Set
     */
   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Eventos> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Eventos> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public Eventos getEventoSeleccionado() {
        return eventoSeleccionado;
    }

    public void setEventoSeleccionado(Eventos eventoSeleccionado) {
        this.eventoSeleccionado = eventoSeleccionado;
    }

    public String getFechaActualizar() {
        return fechaActualizar;
    }

    public void setFechaActualizar(String fechaActualizar) {
        this.fechaActualizar = fechaActualizar;
    }

    public String getLugarActualizar() {
        return lugarActualizar;
    }

    public void setLugarActualizar(String lugarActualizar) {
        this.lugarActualizar = lugarActualizar;
    }

    public String getNombreorganizadorActualizar() {
        return nombreorganizadorActualizar;
    }

    public void setNombreorganizadorActualizar(String nombreorganizadorActualizar) {
        this.nombreorganizadorActualizar = nombreorganizadorActualizar;
    }

    public String getTelorganizadorActualizar() {
        return telorganizadorActualizar;
    }

    public void setTelorganizadorActualizar(String telorganizadorActualizar) {
        this.telorganizadorActualizar = telorganizadorActualizar;
    }

    public String getCantinvitadosActualizar() {
        return cantinvitadosActualizar;
    }

    public void setCantinvitadosActualizar(String cantinvitadosActualizar) {
        this.cantinvitadosActualizar = cantinvitadosActualizar;
    }

    public String getNombrepatrocinadorActualizar() {
        return nombrepatrocinadorActualizar;
    }

    public void setNombrepatrocinadorActualizar(String nombrepatrocinadorActualizar) {
        this.nombrepatrocinadorActualizar = nombrepatrocinadorActualizar;
    }

    public String getTelpatrocinadorActualizar() {
        return telpatrocinadorActualizar;
    }

    public void setTelpatrocinadorActualizar(String telpatrocinadorActualizar) {
        this.telpatrocinadorActualizar = telpatrocinadorActualizar;
    }
    
}
