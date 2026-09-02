package Herencia;

public class Consultor extends Persona{
    String nmbre_consultora;
    int nro_consultos;

    public  Consultor(){

    }

    public Consultor(String nmbre_consultora, int nro_consultos, String apellido, String domicilio, int id, String nombre, String telefono) {
        super(apellido, domicilio, id, nombre, telefono);
        this.nmbre_consultora = nmbre_consultora;
        this.nro_consultos = nro_consultos;
    }

    public String getNmbre_consultora() {
        return nmbre_consultora;
    }

    public void setNmbre_consultora(String nmbre_consultora) {
        this.nmbre_consultora = nmbre_consultora;
    }

    public int getNro_consultos() {
        return nro_consultos;
    }

    public void setNro_consultos(int nro_consultos) {
        this.nro_consultos = nro_consultos;
    }




}
