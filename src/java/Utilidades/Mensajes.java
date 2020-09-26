/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ismael Ruiz
 */
public class Mensajes implements Serializable {

    /**
     * Creates a new instance of Mensajes
     */
    public Mensajes() {
    }

    /**
     * Mensaje al usuario
     *
     * @param titulo
     * @param descripcion
     * @param tipoMensaje
     */
    public static void mensaje(String titulo, String descripcion, int tipoMensaje) {
        FacesContext context = FacesContext.getCurrentInstance();
        switch (tipoMensaje) {
            case 1:
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, descripcion));
                break;
            case 2:
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, titulo, descripcion));
                break;
            case 3:
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, titulo, descripcion));
                break;
            case 4:
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, titulo, descripcion));
                break;
        }
    }

}
