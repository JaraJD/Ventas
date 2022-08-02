/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sistemaventas;

import java.util.Scanner;

/**
 *
 * @author juans
 */
public class SistemaVentas {

    private static void menu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------------------------------\n");
            System.out.println("***Sistema de Ventas***");
            System.out.println("Porfavor digite una opcion: ");
            System.out.println("\t1. Para crear. ");
            System.out.println("\t2. Para mostrar informacion. ");
            System.out.println("\t3. Para Actualizar. ");
            System.out.println("\t4. Eliminar.");
            System.out.println("--------------------------------------\n");
            System.out.println("Pulse otro numero para salir. ");
            System.out.println("--------------------------------------\n");
            System.out.print(">> ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                System.out.println("----------------------------------------------\n");
                System.out.println("***Ingreso de Datos***");
                System.out.println("Porfavor digite una opcion: ");
                System.out.println("\t1. Para agregar una nueva bicicleta. ");
                System.out.println("\t2. Para agregar una nueva motocicleta. ");
                System.out.println("\t3. Para agregar un nuevo cliente. ");
                System.out.println("\t4. Para agregar un nuevo proveedor. ");
                System.out.println("\t5. Para agregar un nuevo fabricante. ");
                System.out.println("\t6. Para agregar una nueva compra. ");

                System.out.println("----------------------------------------------\n");
                System.out.println("Pulse otro numero para salir. ");
                System.out.println("----------------------------------------------\n");
                System.out.print(">> ");
                opcion = Integer.parseInt(sc.nextLine());
                
                if(opcion == 1){
                    System.out.println("crea bici");
                    //crearBicicleta();
                }

            }
        } while (opcion > 0 && opcion < 5);

    }

    public static void main(String[] args) {
        menu();
    }
}
