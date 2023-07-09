/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.ClaseConArray;
import Servicios.ServicioArreglo;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros29Al31ExcepcionesEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo el servicio para usar los metodos
        ServicioArreglo servicio = new ServicioArreglo();
        
        //creo el arreglo
        int[] nuevoArreglo = new int[]{10,20,30,40,50};
        ClaseConArray arreglo = new ClaseConArray(nuevoArreglo);
        
        servicio.accederIndice(arreglo);
    }
    
}
