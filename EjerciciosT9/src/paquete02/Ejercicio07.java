/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        double promedio;
        int[] numeros = new int[10];
        double[] finalpr = new double[10];
        String reporte = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un valor para el arreglo:");
            numeros[i] = entrada.nextInt();

            suma = suma + numeros[i];
        }

        promedio = suma / numeros.length;

        for (int i = 0; i < numeros.length; i++) {

            // Calculamos la diferencia aquí
            finalpr[i] = numeros[i] - promedio;

            reporte += String.format("Dato: %d - Diferencia del promedio: "
                    + "%.2f\n", numeros[i], finalpr[i]);
        }

        System.out.println("Promedio Total: " + promedio);
        System.out.println("---------------------------");
        System.out.printf("%s\n", reporte);
    }
}
