package Videojuego;

import Logicav.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideoJuego {

    public static void main(String[]args){
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        VideoJuego video1 = new VideoJuego(5, "Rpg", 123, "nintendo", "banjo");

        VideoJuego video2 = new VideoJuego(100, "shooter", 129, "pc", "cs");
        
        VideoJuego video3 = new VideoJuego(2, "Rpg", 1, "play", "bpokemon");

        VideoJuego video4 = new VideoJuego(900, "farmer", 2, "nintendo", "bcrash");

        VideoJuego video5 = new VideoJuego(3, "Rpg", 123, "nintendo", "banjo");

        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);

        for (VideoJuego video : listaVideojuegos){
            System.out.println(video.getTitulo() + " "+ video.getConsola()+ " "+  video.getCantJugadores());
        }

        video2.setTitulo("lol");
        video2.setCantJugadores(5);

        video5.setTitulo("popopop");
        video5.setCantJugadores(1);

        for (VideoJuego video: listaVideojuegos){
            if (video.getConsola().equals("nintendo")){
                System.out.println(video.getTitulo()+"debajo se muestra completo");
                System.out.println(video.toString());
            }
        }
    }

}
