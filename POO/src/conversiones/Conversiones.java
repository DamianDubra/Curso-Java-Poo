package conversiones;

public class Conversiones {
    public static void main(String[]args){
        double num = 1.67;

        int numInt = (int) num;

        long numLong = (long) num;

        System.out.println("double" + " "+ num +" "+ "int"+ numInt + "lng"+ numLong);

        String cantidad ="15";

        String precio = "12.5";

        int cantidadInt = Integer.parseInt(cantidad);

        double precioDouble = Double.parseDouble(precio);

        System.out.println((cantidadInt * precioDouble));

        int edad=20;
        
        String edadString = String.valueOf(edad);
        String numStr = String .valueOf(num);

        System.out.println("edad"+ edadString + " estatira"+ numStr);

    }
}
