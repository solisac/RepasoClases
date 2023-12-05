/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.controlador.ControladorPersona;
import ec.edu.intsuperior.modelo.Estudiante;
import ec.edu.intsuperior.modelo.Punto;
import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class Aplication {
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        ControladorPersona con= new ControladorPersona();
       
        Estudiante e= new Estudiante();
        e.setApellido("solis");
        
//        Controlador control= new Controlador();
//        control.menu();
        
        
//        
//        
//        Punto p1= new Punto();
//        Punto p2= new Punto();
//        System.out.println("Ingresa las coordenadas del punto 1");
//        p1.setX(leer.nextInt());
//        p1.setY(leer.nextInt());
//        System.out.println("Ingresa las coordenadas del punto 2");
//        p2.setX(leer.nextInt());
//        p2.setY(leer.nextInt());
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        
//        System.out.println("Y su distancia es:"+control.distanciaPuntos(p1, p2));
//        System.out.println("La pendiente es: "+control.pendiente(p1, p2));
//    
    }
}
