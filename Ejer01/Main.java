package Ejer01;

public class Main {
    public static void main(String[] args) {
        Estudiante e=new Estudiante("Luis Garcia", 21);
        Persona p=new Persona("Marta Gomez", 20);
        System.out.println(p.getNombre());
        System.out.println(e.getNombre()+" : "+e.getCreditos()+" creditos");
        
        e.mostrarDatos();
        p.mostrarDatos();
    }
}
