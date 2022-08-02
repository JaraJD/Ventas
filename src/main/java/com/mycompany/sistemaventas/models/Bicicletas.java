/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaventas.models;

/**
 *
 * @author juans
 */
public class Bicicletas {
    private int id;
    private String fabricante;
    private int precioUnitario;
    private int añoConstruccion;

    public Bicicletas() {
    }

    public Bicicletas(int id, String fabricante, int precioUnitario, int añoConstruccion) {
        this.id = id;
        this.fabricante = fabricante;
        this.precioUnitario = precioUnitario;
        this.añoConstruccion = añoConstruccion;
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

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getAñoConstruccion() {
        return añoConstruccion;
    }

    public void setAñoConstruccion(int añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }
    
    
    
}
