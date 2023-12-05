/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Punto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class Controlador {

    public Punto crearPunto() {
        Scanner leer = new Scanner(System.in);
        Punto p = new Punto();
        System.out.println("Ingresa X:");
        p.setX(leer.nextInt());
        System.out.println("Ingresa Y:");
        p.setY(leer.nextInt());
        return p;
    }

    public double distanciaPuntos(Punto p1, Punto p2) {
        double d;
        //Raiz (p2x-p1x)^2 + (p2y-p1y)^2)
        d = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2)
                + Math.pow(p2.getY() - p1.getY(), 2));
        return d;
    }

    public double pendiente(Punto pIn, Punto pFi) {
        double m;
        //m= (y2-y1)/(x2-x1)

        m = (pFi.getY() - pIn.getY()) / (pFi.getX() - pIn.getX());
        return m;
    }
    

    public void menu() {
        ArrayList<Punto> puntos= new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Ingresa una opcion: \n"
                    + "1.- Crear un Punto\n"
                    + "2.- Imprimir Punto\n"
                    + "3.- Calcular la distancia\n"
                    + "4.- Calcular la pendiente\n"
                    + "5.- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    puntos.add(crearPunto());
                    break;
                case 2:
                    System.out.println(puntos.toString());
                    break;
                case 3:
                    int i1,i2;
                    System.out.println("Entre que puntos deseas calcular:");
                    i1= leer.nextInt();
                    i2= leer.nextInt();
                    
                    System.out.println("La distancia es: "+(distanciaPuntos(puntos.get(i1),puntos.get(i2))));
                    break;
            }
        } while (op != 5);

    }
    

}
