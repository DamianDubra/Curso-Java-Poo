package Herencia;

public class Empleado extends Persona {
    int num_legajo;
    String cargo;
    double sueldo;

    public Empleado(){

    }

    public Empleado(String cargo, int num_legajo, float sueldo, String apellido, String domicilio, int id, String nombre, String telefono) {
        super(apellido, domicilio, id, nombre, telefono);
        this.cargo = cargo;
        this.num_legajo = num_legajo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
