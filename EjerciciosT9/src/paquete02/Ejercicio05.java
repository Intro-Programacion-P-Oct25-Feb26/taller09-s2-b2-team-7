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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] dias = new String[5];
        int[] venta = new int[5];

        for (int i = 0; i < dias.length; i++) {
            switch (i) {
                case 0:
                    dias[i] = "Lunes";
                    break;
                case 1:
                    dias[i] = "Martes";
                    break;
                case 2:
                    dias[i] = "Miercoles";
                    break;
                case 3:
                    dias[i] = "Jueves";
                    break;
                case 4:
                    dias[i] = "Viernes";
                    break;
            }

        }
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("ingrese las ventas del dia %s\n", dias[i]);
            int dato = entrada.nextInt();
            venta[i] = dato;
        }
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s $%d\n", dias[i], venta[i]);
        }

    }

}
