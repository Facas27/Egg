/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo12.Persona;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Persona {

 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Date nacimiento;

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    public Persona(){
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }
    
    
   
    
    
    
    
    
    
    
    
    public Persona CrearPersona(){
        
        
        System.out.println("Ingrese su nombre");
        String nombre1 = leer.next();
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int year = leer.nextInt();   
        Date nacimiento1 = new Date(year-1900, mes-1, dia);
        return new Persona(nombre1,nacimiento1);
        
    }
    public void MostrarDatos(Persona p1){
            System.out.println(p1);
}
    public void CalcularEdad(){
        Date fechaAc = new Date();
        int edad = fechaAc.getYear()-nacimiento.getYear();
        System.out.println("La edad es "+edad);
        
    }

   
    
    
    
}
