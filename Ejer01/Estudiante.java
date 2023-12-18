package Ejer01;

/**
 *
 * @author Stilver Scavone Caceres
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
