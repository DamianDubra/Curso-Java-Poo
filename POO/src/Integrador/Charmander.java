package  Integrador;

public class Charmander extends Pokemon implements iFuego{

    public Charmander() {
    }



    @Override
    protected void atacarPlacaje(){
        System.out.println("placaje");
    }

    @Override
    protected void atacarAranazo(){
        System.out.println("arañazo");
    }

    @Override
    protected void atacarMordisco(){
        System.out.println("mordistco");
        
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("ataca");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("ataca");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("ataca");
    }

    
}