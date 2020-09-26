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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author amedc
 */
public class ConsultaEventoModelo implements Serializable{

    /**
     * Creates a new instance of ConsultaClienteModelo
     */
    public ConsultaEventoModelo() {
    }
     /**
     * Metodo que consulta el cliente por nit en la bd
     * @param codigo
     */
    public ArrayList<Eventos> consultaEventoCodigo(String codigo){
        ArrayList<Eventos> lista = new ArrayList<>();
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.connect();
            String sql = "select codigo_evento, fechaevento, lugarevento, nombreorganizador, telefonorganizador,cantidadinvitados, nombrepatrocinador,telefonopatrocinador from agendaeventos.eventos where codigo_evento = '"+ codigo +"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                rs.beforeFirst();
                while(rs.next()){
                Eventos cl = new Eventos();
                    cl.setCodigoevento(rs.getString("codigo_evento"));
                    cl.setFecha(rs.getString("fechaevento"));
                    cl.setLugar(rs.getString("lugarevento"));
                    cl.setNombreorganizador(rs.getString("nombreorganizador"));
                    cl.setTelorganizador(rs.getString("telefonorganizador"));
                    cl.setCantinvitados(rs.getString("cantidadinvitados"));
                    cl.setNombrepatrocinador(rs.getString("nombrepatrocinador"));
                    cl.setTelpatrocinador(rs.getString("telefonopatrocinador"));
                    lista.add(cl);
                }
                }
            
        } catch (Exception ex) {
            lista = null;
            ex.printStackTrace();
        }
        
        return lista;
    }
     /**
     * Metodo que actualiza cliente
     * @param cl
     */
    public String actualizarEvento(Eventos cl){
        String resultado = "";
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.connect();
            String sql = "update agendaeventos.eventos set codigo_evento = '"+cl.getCodigoevento()+"', fechaevento = '"+cl.getFecha()+"', lugarevento = '"+cl.getLugar()+"', nombreorganizador = '"+cl.getNombreorganizador()+"', telefonorganizador = '"+cl.getTelorganizador()+"', cantidadinvitados = '"+cl.getCantinvitados()+"', nombrepatrocinador = '"+cl.getNombrepatrocinador()+"', telefonopatrocinador = '"+cl.getTelpatrocinador()+"' where codigo_evento = '"+cl.getCodigoevento()+"'";
            Statement st = conn.createStatement();
            int rs = st.executeUpdate(sql);
            if(rs ==   1){
                resultado = "exito";
            }else{
                resultado = "error";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
    
}
