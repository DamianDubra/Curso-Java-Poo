package Herencia;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists{

    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        
        lista.add(new Persona("apellido", "domicilio", 5, "nombre", "telefono"));

        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }

        for (Persona perso:lista){
            System.out.println(perso.getNombre());
        }
    }
}