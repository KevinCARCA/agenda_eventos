/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RegistroEventoModelo;
import Pojos.Eventos;
import Utilidades.Mensajes;
import java.io.Serializable;

/**
 *
 * @author amedc
 */
public class RegistrarEventoControlador implements Serializable{
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
     * Creates a new instance of RegistrarEventoControlador
     */
    public RegistrarEventoControlador() {
    }
    /**
     * Metodo que registra un nuevo cliente
     */
    public void registrarEvento() {
        try {
            String validar = validacion();
            if (validar.equals("")) {
                Eventos event = new Eventos();
                event.setCodigoevento(getCodigoevento());
                event.setFecha(getFecha());
                event.setLugar(getLugar());
                event.setNombreorganizador(getNombreorganizador());
                event.setTelorganizador(getTelorganizador());
                event.setCantinvitados(getCantinvitados());
                event.setNombrepatrocinador(getNombrepatrocinador());
                event.setTelpatrocinador(getTelpatrocinador());
                event.setEstado(0);
                RegistroEventoModelo modelo = new RegistroEventoModelo();
                String resultadoGuardar = modelo.guardarEvento(event);
                if (resultadoGuardar.equals("exito")) {
                    limpiarFormulario();
                    Mensajes.mensaje("Exito", "Evento guardado correctamente", 1);
                } else {
                    Mensajes.mensaje("Error", "Error al guardar el evento", 2);
                }
            } else {
                Mensajes.mensaje("Advertencia", validar, 3);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    /**
     Método que limpia el formulario
     */
    public void limpiarFormulario(){
        try {
                setCodigoevento("");
                setFecha("");
                setLugar("");
                setNombreorganizador("");
                setTelorganizador("");
                setCantinvitados("");
                setNombrepatrocinador("");
                setTelpatrocinador("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo que valida los datos del formulario
     *
     * @return
     */
    public String validacion() {
        String resultado = "";
        try {
            if (getCodigoevento().equals("")) {
                resultado = "Debe ingresar el código del evento";
            } else if (getFecha().equals("")) {
                resultado = "Debe ingresar la fecha del evento";
            }
        } catch (Exception ex) {
            resultado = "Error en las validaciones";
            ex.printStackTrace();
        }
        return resultado;
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
