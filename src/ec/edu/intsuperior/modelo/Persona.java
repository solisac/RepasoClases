/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santy
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Datos: \n"
                + "Nombre:"+getNombre()+" "+getApellido()+"\n"
                + "Cedula: "+getCedula()+"\n"
                + "Fecha Nacimiento: "+getFechaNacimiento();
                }
    
    
    
}
