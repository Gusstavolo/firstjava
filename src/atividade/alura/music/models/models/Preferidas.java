package atividade.alura.music.models.models;

public class Preferidas {


    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " Otima opcao");
        }
        else {
            System.out.println(audio.getTitulo() + " Boa opcao");
        }
    }
}
