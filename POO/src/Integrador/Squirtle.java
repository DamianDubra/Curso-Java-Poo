package  Integrador;

public class Squirtle extends Pokemon implements iAgua{

    public Squirtle() {
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
    public void atacarHidrobomba() {
        System.out.println("ataca");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("ataca");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("ataca");
    }

    
}