// Este es el paquete de servicios
package servicios;

import entidades.Persona;

public class PersonaServicio {

    // Método para comprobar si una persona es mayor de edad
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
}
