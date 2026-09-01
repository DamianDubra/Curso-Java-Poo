package Logica;

public class Alumno{
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(String apellido, int id, String nombre) {
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
    }



    public void mostrarNombre(){

        System.out.println("Hola soy un alumno y se decir mi nombre"+ nombre);
    }
    public void saberAprobado(double calificacion){

        if (calificacion>=6){
            System.out.println("Aprobe la materia");

        }
        else{
            System.out.println("Reprobe");
        }

    }
}