/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Pojos.Eventos;
import Utilidades.Conexion;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Ismael Ruiz
 */
public class RegistroEventoModelo implements Serializable {

    /**
     * Creates a new instance of RegistroClienteModelo
     */
    public RegistroEventoModelo() {
    }

    /**
     * Metodo que guarda un nuevo cliente en la BD
     *
     * @param evento
     * @return
     */
    public String guardarEvento(Eventos evento) {
        String resultado = "";
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.connect();
            Statement st = conn.createStatement();
            String sql = "insert into agendaeventos.eventos (codigo_evento, fechaevento, lugarevento, nombreorganizador, telefonorganizador, cantidadinvitados, nombrepatrocinador, telefonopatrocinador, estado) values ('" + evento.getCodigoevento() + "', '" + evento.getFecha() + "', '" + evento.getLugar() + "', '" + evento.getNombreorganizador() + "', '" + evento.getTelorganizador() + "', '" + evento.getCantinvitados() + "', '" + evento.getNombrepatrocinador() + "', '" + evento.getTelpatrocinador() + "', '"+ evento.getEstado() +"')";
            int resultadoGuardar = st.executeUpdate(sql);
            if (resultadoGuardar == 1) {
                resultado = "exito";
            } else {
                resultado = "error";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

}
