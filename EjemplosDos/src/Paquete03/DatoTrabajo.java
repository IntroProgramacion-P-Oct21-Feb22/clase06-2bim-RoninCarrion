/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    public static String nombreEmpresa (){
        Scanner entrada = new Scanner(System.in);
        String empresa;
        System.out.println("Ingresar el nombre de la empresa: ");
        empresa = entrada.nextLine();
        return empresa;
    }
    public static String direccionEmpresa(){
    Scanner entrada = new Scanner(System.in);
    String dir_Empresa;
        System.out.println("Ingresar la dirección de la empresa: ");
        dir_Empresa = entrada.nextLine();
        return dir_Empresa;
    }
}
