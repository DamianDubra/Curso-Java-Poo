package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main (String[]args){
        Auto aut= new Auto();

        aut.setId(1L);
        aut.setModelo("Rx 5");
        aut.setMarca("mazda");
        List <Propietario> listaPropietarios = new ArrayList<Propietario> ();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(22L);
        prop1.setNombre("Raul");
        prop1.setApellido("alfonsin");
        
        prop2.setId(23L);
        prop2.setNombre("Raula");
        prop2.setApellido("alfonsinaaaa");

        listaPropietarios.add(prop2);
        listaPropietarios.add(prop1);

        aut.setListaDePropietarios(listaPropietarios);

        System.out.println("El auto "+ aut.getModelo() + aut.getMarca() + "Tiene los propietarios "+ aut.getListaDePropietarios().toString());
    }
}
