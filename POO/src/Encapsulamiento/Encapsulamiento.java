package Encapsulamiento;

public class Encapsulamiento{

    public static void  main (String[] args){
        Alumno alum =new Alumno ();
        Alumno alum2 = new Alumno("pepe", 15, "rodriguex");

        System.err.println("id"+ alum2.getId());
        System.err.println("nombre"+ alum2.getNombre());
        System.err.println("apellido"+ alum2.getApellido());
    }

}