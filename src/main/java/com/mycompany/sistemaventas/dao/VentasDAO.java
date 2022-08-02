/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaventas.dao;

import com.mycompany.sistemaventas.models.Bicicletas;
import com.mycompany.sistemaventas.models.Motocicletas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juans
 */
public class VentasDAO {

    public Connection conectar() {

        String baseDeDatos = "reto_4";
        String usuario = "root";
        String password = "";
        String host = "localhost";
        String puerto = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";

        Connection conexion = null;

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexion;
    }

    public void crearBicicleta(Bicicletas bicicleta) {

        try {
            Connection conexion = conectar();

            String sql = "INSERT INTO `bicicletas` (`bicicleta_id`, `bicicleta_fabricante`, `precio_unitario`, `año_construccion`) VALUES ('"
                    + bicicleta.getId() + "', '"
                    + bicicleta.getFabricante() + "', '"
                    + bicicleta.getPrecioUnitario() + "', '"
                    + bicicleta.getAñoConstruccion() + "');";
            Statement statement = conexion.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void crearMotocicleta(Motocicletas motocicleta) {

        try {
            Connection conexion = conectar();

            String sql = "INSERT INTO `motocicletas` (`motocicleta_id`, `motocicleta_fabricante`, `proveedor_id`, `precio_unitario`, `autonomia`) VALUES ('"
                    + motocicleta.getId() + "', '"
                    + motocicleta.getFabricante() + "', '"
                    + motocicleta.getProveedorId()+ "', '"
                    + motocicleta.getPrecioUnitario() + "', '"
                    + motocicleta.getAutonomia()+ "');";
            Statement statement = conexion.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public List<NaveDTO> listar() {
//
//        List<NaveDTO> listado = new ArrayList<>();
//
//        try {
//            Connection conexion = conectar();
//            String sql = "SELECT * FROM `nave`;";
//
//            Statement statement = conexion.createStatement();
//            ResultSet resultado = statement.executeQuery(sql);
//
//            while (resultado.next()) {
//
//                NaveDTO nave = new NaveDTO();
//                nave.setId(resultado.getString("id"));
//                nave.setTipoNave(resultado.getString("tipo_nave"));
//                nave.setNombre(resultado.getString("nombre"));
//                nave.setPeso(resultado.getString("peso"));
//                nave.setCombustible(resultado.getString("combustible"));
//                nave.setEmpuje(resultado.getString("empuje"));
//                nave.setAltura(resultado.getString("altura"));
//                nave.setPotencia(resultado.getString("potencia"));
//                nave.setCarga(resultado.getString("carga"));
//                nave.setVelocidad(resultado.getString("velocidad"));
//                nave.setActivo(resultado.getString("activo"));
//                nave.setTarea(resultado.getString("tarea"));
//                nave.setCapacidad(resultado.getString("capacidad"));
//                listado.add(nave);
//            }
//
//        } catch (Exception ex) {
//            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listado;
//    }
//
//    public List<NaveDTO> buscarAvanzado(String propiedad, String valor) {
//
//        List<NaveDTO> listado = new ArrayList<>();
//
//        try {
//            Connection conexion = conectar();
//            String sql = "SELECT * FROM `nave` WHERE " + propiedad + " = '" + valor + "'";
//
//            Statement statement = conexion.createStatement();
//            ResultSet resultado = statement.executeQuery(sql);
//
//            while (resultado.next()) {
//
//                NaveDTO nave = new NaveDTO();
//                nave.setId(resultado.getString("id"));
//                nave.setTipoNave(resultado.getString("tipo_nave"));
//                nave.setNombre(resultado.getString("nombre"));
//                nave.setPeso(resultado.getString("peso"));
//                nave.setCombustible(resultado.getString("combustible"));
//                nave.setEmpuje(resultado.getString("empuje"));
//                nave.setAltura(resultado.getString("altura"));
//                nave.setPotencia(resultado.getString("potencia"));
//                nave.setCarga(resultado.getString("carga"));
//                nave.setVelocidad(resultado.getString("velocidad"));
//                nave.setActivo(resultado.getString("activo"));
//                nave.setTarea(resultado.getString("tarea"));
//                nave.setCapacidad(resultado.getString("capacidad"));
//                listado.add(nave);
//            }
//
//        } catch (Exception ex) {
//            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listado;
//    }
//
//    public void eliminar(String tipo) {
//
//        try {
//            Connection conexion = conectar();
//
//            String sql = "DELETE FROM `nave` WHERE `nave`.`tipo_nave` = '" + tipo + "'";
//
//            Statement statement = conexion.createStatement();
//            statement.execute(sql);
//
//        } catch (Exception ex) {
//            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
}
