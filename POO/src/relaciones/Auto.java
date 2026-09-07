package relaciones;

import java.util.List;

public class Auto {

    

    private Long id;
    private String marca;
    private String modelo;

    /*private Propietario prop;//relacion de 1 a 1  agregar constructores*/
    private List <Propietario> listaDePropietarios;// relacion 1 a n agregar constructores

    

    public Auto() {
    }

    public Auto(Long id, List<Propietario> listaDePropietarios, String marca, String modelo) {
        this.id = id;
        this.listaDePropietarios = listaDePropietarios;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaDePropietarios() {
        return listaDePropietarios;
    }

    public void setListaDePropietarios(List<Propietario> listaDePropietarios) {
        this.listaDePropietarios = listaDePropietarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto{");
        sb.append("id=").append(id);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", listaDePropietarios=").append(listaDePropietarios);
        sb.append('}');
        return sb.toString();
    }

    

}
