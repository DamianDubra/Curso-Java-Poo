package Herencia;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists{

    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();
        
        lista.add(new Persona("apellido", "domicilio", 5, "nombre", "telefono"));

//agrega al principio
        lista.add(0,new Persona("apellido", "domicilio", 5, "nombre", "telefono"));

        for (Persona perso:lista){
            if (perso.getNombre().equals("nombre")){
                lista.remove(perso);
                break;
            }
        }

        for (Persona perso:lista){
            System.out.println(perso.getNombre());
        }
    }
}