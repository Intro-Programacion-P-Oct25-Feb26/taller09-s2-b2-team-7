/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] cafe = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precio = {1.5, 2.1, 2.3};
        int i;
        int taza;
        boolean flag = true;
        String salida;
        double total = 0;
        double sumaf = 0;
        String reporte = "";
        while (flag) {

            System.out.println("ingrese el cafe a comprar\n0 = Café tradicional"
                    + "\n1 = Café francés\n2 = Café aleman");
            i = entrada.nextInt();
            System.out.println("ingrese la cantidad de tazas que desea comprar");
            taza = entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingrese (no) en caso haya terminado de ordenar");
            salida = entrada.nextLine();
            if (salida.equals("no")) {
                flag = false;
            }
            switch (i) {
                case 0:
                case 1:
                case 2:
                    total = precio[i] * taza;
                    reporte = String.format("%s%s (%s t), valor a cancelar "
                            + "%.2f\n\t",reporte,
                            cafe[i], taza, total);
                    sumaf += total;
                    break;
                default:
                    System.out.println("ingrese un producto valido");
                    break;

            }

        }
        System.out.printf("El usuario ha comprado:\n\n%s \n\nTotal a pagar: "
                + "$%.1f\n", reporte, sumaf);
    }

}
