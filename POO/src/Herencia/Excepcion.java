package Herencia;

public class Excepcion {
    public static void main (String[] args){
        try {
            int resultado = 3/0;
        }
        catch (Exception e){
            System.out.println("no se puede dividir por 0");//mala practica
        }
    

        int edades [] = {15, 12, 23, 30};

        try{
            System.out.println("la psicion 4 tiene"+ edades[4]);
        }
        catch(Exception e){
            System.out.println("no exixtse esa posicion");
        }

    }

}
