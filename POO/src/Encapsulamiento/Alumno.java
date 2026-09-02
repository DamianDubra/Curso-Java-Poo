package Encapsulamiento;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;//deben ir  en private, al ser private solo es accesible por si mismo, su es protected solo por los hijos

    public Alumno() {
    }

    public Alumno(String apellido, int id, String nombre) {
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}