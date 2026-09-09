package generics;

public class Main {

    public static void main(String[] args) {
        Caja <String> cajaString = new Caja<>();

        cajaString.ponerAlgo("dfsfdsfs");

        String contenido = cajaString.obtenerAlgo();


        Caja <Integer> cajaInteger= new Caja<>();

        cajaInteger.ponerAlgo(5);

        Integer numero = cajaInteger.obtenerAlgo();
        

        System.out.println(contenido);

        System.out.println(numero);
    }
}
