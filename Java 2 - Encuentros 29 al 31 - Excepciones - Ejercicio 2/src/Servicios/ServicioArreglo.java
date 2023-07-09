/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ClaseConArray;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioArreglo {

    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    public void accederIndice(ClaseConArray arreglo) {

        System.out.println("A que indice queres acceder??");
        int indice = lector.nextInt();

        //aca manejo las excepciones ESPECIFICAMENTE
        try {
            int valor = arreglo.getArreglo()[indice];
            System.out.println("El valor en el índice " + indice + " es " + valor);

        } catch (ArrayIndexOutOfBoundsException offSide) {
            System.out.println("Error 1: Usted ingreso un valor fuera del arreglo en el indice " + indice + " su error es: '" + offSide + "'");
            System.out.println("Error 2: " + offSide.getMessage() + " con metodo 'getMessage()'");
            System.out.println("Error 3: " + offSide.fillInStackTrace() + " con metodo 'fillInStackTrace()' ");
            System.out.println("Error 4: " + offSide.toString() + " con metodo 'toString()'");
        }

        System.out.println("==========================================================");
        //=======================================================================================================
        //aca manejo las excepciones GENERICAMENTE
        System.out.println("Manejo usando solo Exception");
        try {
            int valor = arreglo.getArreglo()[indice];
            System.out.println("El valor en el índice " + indice + " es " + valor);

        } catch (Exception offSide) {
            System.out.println("Error 1: Usted ingreso un valor fuera del arreglo en el indice " + indice + " su error es: '" + offSide + "'");
            System.out.println("Error 2: " + offSide.getMessage() + " con metodo 'getMessage()'");
            System.out.println("Error 3: " + offSide.fillInStackTrace() + " con metodo 'fillInStackTrace()' ");
            System.out.println("Error 4: " + offSide.toString() + " con metodo 'toString()'");
        }
    }
}
