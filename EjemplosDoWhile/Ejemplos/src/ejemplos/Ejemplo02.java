/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        int suma = 0;
        int prom = 0;
        boolean bandera = true;
       
        String salida;
        do{
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            prom= prom + suma/notas;
            System.out.println("promedio:"+prom);
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal);
            entrada.nextLine(); // limpieza de buffer
            
            System.out.println("Ingrese (s) si desea salir del ciclo ");
            salida = entrada.nextLine();
            
            if (salida.equals("s")) {
                bandera = false;
            }
            
        }while(bandera); // (bandera==true)
        System.out.printf("Listado de Notas\n%s\n", cadenaFinal);
    }
}
