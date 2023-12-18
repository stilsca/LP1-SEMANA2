/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer01;

/**
 *
 * @author stica
 */
public class Estudiante extends Persona{
    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        this.creditos=0;
    }
    
    public int getCreditos(){return this.creditos;}
    
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Creditos: "+creditos);
    }
    
    
}
