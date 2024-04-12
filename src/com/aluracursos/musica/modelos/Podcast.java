package com.aluracursos.musica.modelos;

public class Podcast extends Titulo implements Listas{
private String tema;

    public Podcast(String titulo, int duracion, String tema) {
        super(titulo, duracion);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String playList() {
        return "";
    }


}
