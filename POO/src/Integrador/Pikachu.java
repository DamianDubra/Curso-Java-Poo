package  Integrador;

public class Pikachu extends Pokemon implements iElectrico{

    public Pikachu() {
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
    public void atacarImpactrueno() {
        System.out.println("ataca");
    }

    @Override
    public void atacarPunoelectrico() {
        System.out.println("ataca");
    }



}