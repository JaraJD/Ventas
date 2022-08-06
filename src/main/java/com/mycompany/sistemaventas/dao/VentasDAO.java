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

    public void crearBicicleta(Bicicletas bicicleta){

        try {
            Connection conexion = conectar();

            String sql = "INSERT INTO `bicicletas` ( `bicicleta_id`,`bicicleta_fabricante`, `precio_unitario`, `año_construccion`) VALUES ('"
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

    public List<Bicicletas> listarBici() {

        List<Bicicletas> listado = new ArrayList<>();

        try {
            Connection conexion = conectar();
            String sql = "SELECT * FROM `bicicletas`;";

            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                Bicicletas bicicleta = new Bicicletas();
                bicicleta.setId(resultado.getInt("bicicleta_id"));
                bicicleta.setFabricante(resultado.getString("bicicleta_fabricante"));
                bicicleta.setPrecioUnitario(resultado.getInt("precio_unitario"));
                bicicleta.setAñoConstruccion(resultado.getInt("año_construccion"));
                listado.add(bicicleta);
            }

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    public List<Motocicletas> listarMoto() {

        List<Motocicletas> listado = new ArrayList<>();

        try {
            Connection conexion = conectar();
            String sql = "SELECT * FROM `motocicletas`;";

            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                Motocicletas motocicleta = new Motocicletas();
                motocicleta.setId(resultado.getInt("motocicleta_id"));
                motocicleta.setFabricante(resultado.getString("motocicleta_fabricante"));
                motocicleta.setProveedorId(resultado.getInt("proveedor_id"));
                motocicleta.setPrecioUnitario(resultado.getInt("precio_unitario"));
                motocicleta.setAutonomia(resultado.getInt("autonomia"));
                listado.add(motocicleta);
            }

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    public List<Motocicletas> listarFabricantes() {

        List<Motocicletas> listado = new ArrayList<>();

        try {
            Connection conexion = conectar();
            String sql = "SELECT `motocicleta_fabricante` from `motocicletas` where `proveedor_id` = 101;";

            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                Motocicletas motocicleta = new Motocicletas();
                motocicleta.setFabricante(resultado.getString("motocicleta_fabricante"));
                listado.add(motocicleta);
            }

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    
    public void actualizarBici(Bicicletas bicicleta) {
    
        try {
            Connection conexion = conectar();
            
            String sql = "UPDATE `bicicletas` SET `precio_unitario` = '"+ bicicleta.getPrecioUnitario() +"' WHERE `bicicletas`.`bicicleta_id` = "+ bicicleta.getId() +";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void actualizarMoto(Motocicletas motocicleta) {
    
        try {
            Connection conexion = conectar();
            
            String sql = "UPDATE `motocicletas` SET `precio_unitario` = '"+ motocicleta.getPrecioUnitario() +"' WHERE `motocicletas`.`motocicleta_id` = "+ motocicleta.getId() +";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarBici(Bicicletas bicicleta) {

        try {
            Connection conexion = conectar();

            String sql = "DELETE FROM `bicicletas` WHERE `bicicletas`.`bicicleta_id` = " + bicicleta.getId() + ";";

            Statement statement = conexion.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void eliminarMoto(Motocicletas motocicleta) {

        try {
            Connection conexion = conectar();

            String sql = "DELETE FROM `motocicletas` WHERE `motocicletas`.`motocicleta_id` = " + motocicleta.getId() + ";";

            Statement statement = conexion.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
