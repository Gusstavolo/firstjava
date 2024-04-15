package atividade.alura.music.models.main;

import atividade.alura.music.models.models.Podcast;
import atividade.alura.music.models.models.Preferidas;

public class Main {
    public static void main(String[] args) {


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Sistema");
        meuPodcast.setApresentador("Danilo");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.Reproducao();

        }
        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();

        }
        Preferidas Mpreferidas = new Preferidas();
        Mpreferidas.inclui(meuPodcast);


    }
}
