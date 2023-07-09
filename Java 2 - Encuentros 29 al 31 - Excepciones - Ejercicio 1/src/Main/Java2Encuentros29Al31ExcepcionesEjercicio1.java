/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import entidades.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros29Al31ExcepcionesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio servicio = new PersonaServicio();
        Persona persona = null;

        try {
            System.out.println("Intento sacar la edad de null");
            servicio.esMayorDeEdad(persona);
        } catch (NullPointerException nulo) {
            System.out.println("El catch devuelve el mensaje " + "'" + nulo.getMessage() + "'" + " con el metodo 'getMessage()' ");
            System.out.println("Error: " + "'" + nulo + "'" + " llamando solo por la variable.");
            System.out.println("Error: " + "'" + nulo.fillInStackTrace() + "'" + " con el metodo 'fillInStackTrace()' ");
            System.out.println("Error: " + "'" + nulo.toString() + "'" + " con el metodo 'toString()' ");
        }
        
        
        

    }

}
