package Herencia;

import java.util.HashMap;
import java.util.Map;

public class PHashMap {
    public static void main (String[] args){
        Map<Integer,String> mapaempleados = new HashMap<>();

        mapaempleados.put(123,"hola");

        mapaempleados.put(121,"ha");
        mapaempleados.put(129,"holdsa");

        boolean esta = mapaempleados.containsValue("hola");

        boolean estakey = mapaempleados.containsKey(1);

        if (esta==true){

            System.out.println("El valor se encotro");

        }
        else {
            System.out.println("El valor no esta");
        }

        if (estakey==true){

            System.out.println("El valor se encotro");

        }
        else {
            System.out.println("El valor no esta");
        }


        System.out.println( mapaempleados.values());

        mapaempleados.remove(129);

        System.out.println( mapaempleados.keySet());

        String nombre = mapaempleados.get(123);

        System.out.println("El nombre es "+ nombre);
    }
}
