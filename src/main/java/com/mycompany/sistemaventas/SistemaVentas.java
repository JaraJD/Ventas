/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sistemaventas;

import com.mycompany.sistemaventas.dao.VentasDAO;
import com.mycompany.sistemaventas.models.Bicicletas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class SistemaVentas {

    List<Bicicletas> listaBicicleta;

    public SistemaVentas() {
        listaBicicleta = new ArrayList<>();
        menu();
    }

    private void menu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-----------------------------------------------------------------------------------------------------\n");
            System.out.println("***Sistema de Ventas***");
            System.out.println("Porfavor digite una opcion: ");
            System.out.println("\t1. Para crear. ");
            System.out.println("\t2. Para mostrar informacion. ");
            System.out.println("\t3. Para Actualizar. ");
            System.out.println("\t4. Eliminar.");
            System.out.println("-----------------------------------------------------------------------------------------------------\n");
            System.out.println("Pulse otro numero para salir. ");
            System.out.println("-----------------------------------------------------------------------------------------------------\n");
            System.out.print(">> ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("***Ingreso de Datos***");
                    System.out.println("Porfavor digite una opcion: ");
                    System.out.println("\t1. Para agregar una nueva bicicleta. ");
                    System.out.println("\t2. Para agregar una nueva motocicleta. ");
                    System.out.println("\t3. Para agregar un nuevo cliente. ");
                    System.out.println("\t4. Para agregar un nuevo proveedor. ");
                    System.out.println("\t5. Para agregar un nuevo fabricante. ");
                    System.out.println("\t6. Para agregar una nueva compra. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("Pulse otro numero para salir. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.print(">> ");
                    opcion = Integer.parseInt(sc.nextLine());
                    if (opcion == 1) {
                        agregar(opcion);
                    }
                }
                case 2 -> {
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("***Visualizacion de Datos***");
                    System.out.println("Porfavor digite una opcion: ");
                    System.out.println("\t1. Para mostrar todas las bicicletas. ");
                    System.out.println("\t2. Para mostrar todas las motocicletas. ");
                    System.out.println("\t3. Para mostrar los fabricantes de las motocicletas eléctricas donde Auteco les provee el motor. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("Pulse otro numero para salir. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.print(">> ");
                    opcion = Integer.parseInt(sc.nextLine());
                    if (opcion == 1) {
                        mostrar(opcion);
                    }
                }
                case 3 -> {
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("***Actualizacion de Datos***");
                    System.out.println("Porfavor digite una opcion: ");
                    System.out.println("\t1. Para actualizar precio de bicicleta. ");
                    System.out.println("\t2. Para actualizar precio de motocicleta. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("Pulse otro numero para salir. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.print(">> ");
                    opcion = Integer.parseInt(sc.nextLine());
                    if (opcion == 1) {
                        actualizar(opcion);
                    }
                }
                case 4 -> {
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("***Eliminar Datos***");
                    System.out.println("Porfavor digite una opcion: ");
                    System.out.println("\t1. Para eliminar bicicleta por ID. ");
                    System.out.println("\t2. Para eliminar motocicleta por ID. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("Pulse otro numero para salir. ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                    System.out.print(">> ");
                    opcion = Integer.parseInt(sc.nextLine());
                    if (opcion == 1) {
                        eliminar(opcion);
                    }
                }
                default -> {
                }
            }
        } while (opcion > 0 && opcion < 5);

    }

    private void agregar(int op) {
        if (op == 1) {
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Bicicletas bicicleta = new Bicicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la bicicleta: ");
            System.out.print(">> ");
            bicicleta.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese fabricante de la bicicleta: ");
            System.out.print(">> ");
            bicicleta.setFabricante(sc.nextLine());
            System.out.println("Ingrese precio de la bicicleta: ");
            System.out.print(">> ");
            bicicleta.setPrecioUnitario(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese anio de construccion de la bicicleta: ");
            System.out.print(">> ");
            bicicleta.setAñoConstruccion(Integer.parseInt(sc.nextLine()));
            dao.crearBicicleta(bicicleta);
        } else if (op == 2) {

        }
    }

    private void mostrar(int op) {
        if (op == 1) {
            VentasDAO dao = new VentasDAO();
            listaBicicleta = dao.listar();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");

            for (Bicicletas bici : listaBicicleta) {
                System.out.println("\n");
                System.out.print("ID: " + bici.getId() + " - ");
                System.out.print("\t" + "Fabricante: " + bici.getFabricante() + " - ");
                System.out.print("\t" + "Precio: " + bici.getPrecioUnitario() + " - ");
                System.out.print("\t" + "Anio Construccion: " + bici.getAñoConstruccion() + " - ");
            }
            System.out.println("\n");
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");

        }
    }

    private void actualizar(int op) {
        if (op == 1) {
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Bicicletas bicicleta = new Bicicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la bicicleta a actualizar: ");
            System.out.print(">> ");
            bicicleta.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese el precio actualizado de la bicicleta: ");
            System.out.print(">> ");
            bicicleta.setPrecioUnitario(Integer.parseInt(sc.nextLine()));
            dao.actualizar(bicicleta);
            System.out.println("**** Tabla bicicletas actualizada ****");
            mostrar(op);
        }
    }

    private void eliminar(int op){
        if (op == 1) {
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Bicicletas bicicleta = new Bicicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la bicicleta a eliminar: ");
            System.out.print(">> ");
            bicicleta.setId(Integer.parseInt(sc.nextLine()));
            dao.eliminar(bicicleta);
            System.out.println("**** Tabla bicicletas actualizada ****");
            mostrar(op);
        }
    }
    
    public static void main(String[] args) {
        SistemaVentas sistema = new SistemaVentas();
    }
}
