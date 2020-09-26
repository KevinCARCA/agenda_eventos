/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author amedc
 */
public class MenuOperadorControlador {

    /**
     * Creates a new instance of MenuOperadorControlador
     */
    public MenuOperadorControlador() {
    }
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
