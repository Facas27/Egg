/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo12;

import ejerpoo12.Persona.Persona;

/**
 *
 * @author User
 */
public class EjerPoo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = p1.CrearPersona();
        p2.MostrarDatos(p2);
        p2.CalcularEdad();
        
    }
    
}
