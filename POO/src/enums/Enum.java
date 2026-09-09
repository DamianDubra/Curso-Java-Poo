package enums;

public class Enum {
    /* aca se declararia si nofera una clase */
    public static void main(String[]args){

        Color color = Color.ROJO;

        System.out.println("El color seleccionado es: " + color);

        for (Color c : Color.values()){
            System.out.println(c);
        }
        
        System.out.println(color.name());

        System.out.println(color.ordinal());
        
        color = Color.valueOf("AZUL");

        System.out.println("el color es" + color);

        try {
            color = Color.valueOf("ROSA");
            System.out.println("el color"+ "Rosa"+"se encotntro");
        }
        catch (IllegalArgumentException e){
            System.out.println("El color no existe");
        }
    }
}
