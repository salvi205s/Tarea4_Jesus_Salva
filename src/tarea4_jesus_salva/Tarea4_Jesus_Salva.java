/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4_jesus_salva;

/**
 *
 * @author Salva
 */
public class Tarea4_Jesus_Salva {

    String nombre;
    int edad;

    public Tarea4_Jesus_Salva(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
       public Tarea4_Jesus_Salva() {
        this.nombre = "Salvisus";
        this.edad = 58; //Entre los dos
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
       
    
}
