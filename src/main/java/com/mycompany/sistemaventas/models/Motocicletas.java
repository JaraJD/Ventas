/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaventas.models;

/**
 *
 * @author juans
 */
public class Motocicletas {
    private int id;
    private String fabricante;
    private int proveedorId;
    private int precioUnitario;
    private int autonomia;

    public Motocicletas() {
    }

    public Motocicletas(int id, String fabricante, int proveedorId, int precioUnitario, int autonomia) {
        this.id = id;
        this.fabricante = fabricante;
        this.proveedorId = proveedorId;
        this.precioUnitario = precioUnitario;
        this.autonomia = autonomia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
    
    
}
