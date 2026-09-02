package  Integrador;

public class Bulbasur extends Pokemon implements iPlanta{

    public Bulbasur() {
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
    public void atacarDrenaje() {
        System.out.println("ataca");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("ataca");
    }

}