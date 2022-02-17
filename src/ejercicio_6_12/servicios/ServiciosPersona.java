/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6_12.servicios;

import ejercicio_6_12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author maylenhaagrosbaco
 */
public class ServiciosPersona {
    
    Scanner leer = new Scanner (System.in);
    
    //• Agregar un método de creación del objeto que respete la siguiente firma: crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
    // al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    
    public Persona crearPersona(){
        
        Persona p = new Persona();
        
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        
        System.out.println("Ingrese el año en el que nacio");
        int anio = leer.nextInt();
        
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        
        Date nacimiento = new Date(anio - 1900, mes - 1, dia);
        
        p.setNacimiento(nacimiento);
        
        return p;
        
    }
    
    //• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta que para conocer la edad de la persona también se debe
    // conocer la fecha actual.
    
    public int calcularEdad(Persona p){
        
        Date fechaActual = new Date();
        
        double diferencia = fechaActual.getTime() - p.getNacimiento().getTime();
        
        double segundo = diferencia / 1000;
        
        double minuto = segundo / 60;
        
        double hora = minuto / 60;
        
        double dia = hora / 24;
        
        double semana = dia / 7;
        
        double mes = semana / 4.345;
        
        double anio = Math.floor(mes / 12);
        
        int edad = (int)anio;
        
        return edad;
        
    }
    
    //• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga menor edad que la
    // persona que se recibe como parámetro, o false en caso contrario.
    
    public boolean menorQue(int edad){
        
        System.out.println("Ingrese una edad");
        int edadN = leer.nextInt();
        
        boolean menor = edadN < edad;
       
       return menor; 
        
    }
    
    //• Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
    
    public void mostrarPersona(Persona p, int edad){
        
        System.out.println("Nombre de la persona: " + p.getNombre());
        
        System.out.println("Edad de la persona: " + edad + " años");
        
    }
    
}
