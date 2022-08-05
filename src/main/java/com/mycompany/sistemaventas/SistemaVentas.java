/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sistemaventas;

import com.mycompany.sistemaventas.dao.VentasDAO;
import com.mycompany.sistemaventas.models.Bicicletas;
import com.mycompany.sistemaventas.models.Motocicletas;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class SistemaVentas {

    public SistemaVentas() {
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

                    agregar(opcion);

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

                    mostrar(opcion);

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

                    actualizar(opcion);

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

                    eliminar(opcion);

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
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Motocicletas motocicleta = new Motocicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la motocicleta: ");
            System.out.print(">> ");
            motocicleta.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese fabricante de la motocicleta: ");
            System.out.print(">> ");
            motocicleta.setFabricante(sc.nextLine());
            System.out.println("Ingrese proveedor de la motocicleta: ");
            System.out.print(">> ");
            motocicleta.setProveedorId(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese precio de la motocicleta: ");
            System.out.print(">> ");
            motocicleta.setPrecioUnitario(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese anio de construccion de la bicicleta: ");
            System.out.print(">> ");
            motocicleta.setAutonomia(Integer.parseInt(sc.nextLine()));
            dao.crearMotocicleta(motocicleta);
        }
    }

    private void mostrar(int op) {
        VentasDAO dao = new VentasDAO();

        switch (op) {
            case 1 -> {
                List<Bicicletas> listaBicicleta;
                listaBicicleta = dao.listarBici();
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
            case 2 -> {
                List<Motocicletas> listaMotocicleta;
                listaMotocicleta = dao.listarMoto();
                System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                for (Motocicletas moto : listaMotocicleta) {
                    System.out.println("\n");
                    System.out.print("ID: " + moto.getId() + " - ");
                    System.out.print("\t" + "Fabricante: " + moto.getFabricante() + " - ");
                    System.out.print("\t" + "Precio: " + moto.getProveedorId() + " - ");
                    System.out.print("\t" + "Precio: " + moto.getPrecioUnitario() + " - ");
                    System.out.print("\t" + "Anio Construccion: " + moto.getAutonomia() + " - ");
                }
                System.out.println("\n");
                System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            }
            case 3 -> {
                List<Motocicletas> listaMotocicleta;
                listaMotocicleta = dao.listarFabricantes();
                System.out.println("-------------------------------------------------------------------------------------------------------------\n");
                for (Motocicletas moto : listaMotocicleta) {
                    System.out.println("\n");
                    System.out.print("\t" + "Fabricante: " + moto.getFabricante() + " - ");
                }
                System.out.println("\n");
                System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            }
            default -> {
            }
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
            dao.actualizarBici(bicicleta);
            System.out.println("**** Tabla bicicletas actualizada ****");
            mostrar(op);
        } else if (op == 2) {
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Motocicletas motocicleta = new Motocicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la motocicleta a actualizar: ");
            System.out.print(">> ");
            motocicleta.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese el precio actualizado de la motocicleta: ");
            System.out.print(">> ");
            motocicleta.setPrecioUnitario(Integer.parseInt(sc.nextLine()));
            dao.actualizarMoto(motocicleta);
            System.out.println("**** Tabla motocicletas actualizada ****");
            mostrar(op);
        }
    }

    private void eliminar(int op) {
        if (op == 1) {
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Bicicletas bicicleta = new Bicicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la bicicleta a eliminar: ");
            System.out.print(">> ");
            bicicleta.setId(Integer.parseInt(sc.nextLine()));
            dao.eliminarBici(bicicleta);
            System.out.println("**** Tabla bicicletas actualizada ****");
            mostrar(op);
        } else if (op == 2) {
            Scanner sc = new Scanner(System.in);
            VentasDAO dao = new VentasDAO();
            Motocicletas motocicleta = new Motocicletas();
            System.out.println("-------------------------------------------------------------------------------------------------------------\n");
            System.out.println("***Ingreso de Datos***");
            System.out.println("Ingrese id de la motocicleta a eliminar: ");
            System.out.print(">> ");
            motocicleta.setId(Integer.parseInt(sc.nextLine()));
            dao.eliminarMoto(motocicleta);
            System.out.println("**** Tabla motocicletas actualizada ****");
            mostrar(op);
        }
    }

    public static void main(String[] args) {
        SistemaVentas sistema = new SistemaVentas();
    }
}
