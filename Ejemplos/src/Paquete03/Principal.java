/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete03;
import Paquete04.OperadorDos;
import Paquete04.OperadorUno;

/**
 *
 * @author ronni
 */
public class Principal {
        public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero();
        int valorB = OperadorUno.obtenerNumero();
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                suma);
    }
}
