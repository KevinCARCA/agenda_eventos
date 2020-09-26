/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.IndexModelo;
import Utilidades.Mensajes;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author amedc
 */
/*
Serializable Persistente
 */
public class IndexControlador implements Serializable {

    private String usuario;
    private String password;

    /**
     * Creates a new instance of IndexControlador
     */
    public IndexControlador() {
    }

    /**
     * Metodo que valida los datos de ingreso
     *
     * @return
     */
 public String validarDatos() {
        String resultado = "";
        if (getUsuario().equals("") || getPassword().equals("")) {
            Mensajes.mensaje("Error", "Debe llenar los dos campos", 3);
        } else {
            IndexModelo modelo = new IndexModelo();
            resultado = modelo.validarUsuario(getUsuario(), getPassword());
            if (resultado.equals("usuarioInactivo")) {
                Mensajes.mensaje("Error", "Usuario Inactivo", 2);
            } else if (resultado.equals("usuarioIncorrecto")) {
                Mensajes.mensaje("Error", "Credenciales invalidas", 2);
            }
        }
        return resultado;
    }

    //Metodos gets y set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}