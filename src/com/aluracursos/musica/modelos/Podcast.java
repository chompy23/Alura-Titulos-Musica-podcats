package com.aluracursos.musica.modelos;

public class Podcast extends Titulo implements Listas{
private String tema;


    public Podcast(String titulo, double duracion, String tema) {
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
    public Titulo playList() {
        return null;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "tema='" + tema + '\'' +
                '}';
    }
}
