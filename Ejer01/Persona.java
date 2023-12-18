package Ejer01;
/**
 *
 * @author Stilver Scavone Caceres
 */
public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad;
    }

    public void mostrarDatos() {
        System.out.println("Persona: " + nombre + " Edad: " + edad);
    }
}
