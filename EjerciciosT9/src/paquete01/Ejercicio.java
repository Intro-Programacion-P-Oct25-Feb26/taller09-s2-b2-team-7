/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreMarca;
        int total;
        String[] listado;

        System.out.println("¿Cuántas marcas desea ingresar?");
        total = entrada.nextInt();
        entrada.nextLine();

        listado = new String[total];

        for (int i = 0; i < listado.length; i++) {

            System.out.println("Ingrese una marca:");
            nombreMarca = entrada.nextLine();

            String letra = nombreMarca.substring(0, 1);
            
            letra = letra.toLowerCase();

            switch (letra) {
                case "a":
                case "c":
                case "t":
                    System.out.println("Marca no válida (empieza con A, C o T)."
                            + " Intente otra.");
                    i--;
                    break;
                default:
                    listado[i] = nombreMarca;
            }
        }

        for (int i = 0; i < listado.length; i++) {
            System.out.printf("\nLa marca ingresada es:\nMarca: %S -> %d\n",
                    listado[i], i);
        }
    }
}
