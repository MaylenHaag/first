/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6_12.entidades;

import java.util.Date;

/**
 *
 * @author maylenhaagrosbaco
 */
public class Persona {
    
    //Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
    
    private String nombre;
    
    private Date nacimiento;
    
    // constructor vacío,

    public Persona() {
    }
    
    //constructor parametrizado,

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    
    //  get y set.

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
    
}
