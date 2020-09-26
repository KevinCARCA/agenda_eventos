/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;

/**
 *
 * @author Ismael Ruiz
 */
public class MenuPrincipalControlador implements Serializable {

    /**
     * Creates a new instance of MenuPrincipalControlador
     */
    public MenuPrincipalControlador() {
    }

    /**
     * Metodo que gestiona la navegacion del menu
     *
     * @param opcion
     * @return
     */
    public String navegacionMenu(int opcion) {
        String resultado = "";
        try {
            switch (opcion) {
                case 1:
                    resultado = "salir";
                    break;
                case 2:
                    resultado = "nuevoEvento";
                    break;
                case 3:
                    resultado = "consultaEvento";
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

}
