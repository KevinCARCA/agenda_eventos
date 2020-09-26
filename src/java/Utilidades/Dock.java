/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ismael Ruiz
 */
public class Dock implements Serializable {

    /**
     * Creates a new instance of Dock
     */
    public Dock() {
    }

    /**
     * Metodo que gestiona la navegacion con el menu dock
     *
     * @return
     */
    public String navegacionDock() {
        String resultado = "";
        try {
            int rol = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("SESSION_ROL").toString());
            switch (rol) {
                case 1:
                    resultado = "menuPrincipal";
                    break;
                case 2:
                    resultado = "menuOperador";
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

}
