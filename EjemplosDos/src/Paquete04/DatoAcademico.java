/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class DatoAcademico {
    public static double [] obtenerNotas(int n){
        Scanner entrada = new Scanner(System.in);
    double [] notas = new double[n];
    for(int i = 0; i<notas.length;i++){
        System.out.println("Ingresar una nota por favor: ");
        notas[0]=entrada.nextDouble();
    }
    return notas;
    }
}
