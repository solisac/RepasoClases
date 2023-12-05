/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class ControladorPersona {
    Scanner leer = new Scanner(System.in);
    ArrayList<Persona> nomina= new ArrayList<>();
    public void crearUnaPersona(){
        
        Persona persona= new Persona();
        System.out.println("Ingresa el Apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingresa el nombre:");
        persona.setNombre(leer.next());
        System.out.println("ingresa la cedula");
        persona.setCedula(leer.next());
        System.out.println("ingresa la fecha de Nacimiento");
        persona.setFechaNacimiento(leer.next());
        nomina.add(persona);
        
    }
    
    public void imprimirNomina(){
        System.out.println(nomina.toString());
    }
    
    public void menu(){
        int op=0;
        do {          
            System.out.println("Ingresa tu opcion:\n"
                    + "1.- Crear Persona\n"
                    + "2.- Imprimir la nomina\n"
                    + "3.- Salir");
            op= leer.nextInt();
            switch(op){
                case 1:
                    crearUnaPersona();
                    break;
                case 2:
                    imprimirNomina();
                    break;
            }
        } while (op!=3);
    }
    
}
