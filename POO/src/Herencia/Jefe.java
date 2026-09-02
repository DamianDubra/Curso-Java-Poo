package Herencia;

public class Jefe extends Persona{
    int id_jefe;
    String departamento_jefe;
    public Jefe(){

    }

    public Jefe(String departamento_jefe, int id_jefe, String apellido, String domicilio, int id, String nombre, String telefono) {
        super(apellido, domicilio, id, nombre, telefono);
        this.departamento_jefe = departamento_jefe;
        this.id_jefe = id_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }


    
}
