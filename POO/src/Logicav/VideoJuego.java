package Logicav;

public class VideoJuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int cantJugadores;
    private String categoria;

    public VideoJuego() {
    }

    public VideoJuego(int cantJugadores, String categoria, int codigo, String consola, String titulo) {
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
        this.codigo = codigo;
        this.consola = consola;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    
}
