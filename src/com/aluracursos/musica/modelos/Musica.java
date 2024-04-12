package com.aluracursos.musica.modelos;

public class Musica extends Titulo implements Listas{
    private String  autor;
    private String interprete;
    private String interpreteInvitado;


    public Musica(String titulo, double duracion, String autor, String interprete, String interpreteInvitado) {
        super(titulo, duracion);
        this.autor = autor;
        this.interprete = interprete;
        this.interpreteInvitado = interpreteInvitado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getInterpreteInvitado() {
        return interpreteInvitado;
    }

    public void setInterpreteInvitado(String interpreteInvitado) {
        this.interpreteInvitado = interpreteInvitado;
    }

    @Override
    public Titulo playList() {
        return null;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "autor='" + autor + '\'' +
                ", interprete='" + interprete + '\'' +
                ", interpreteInvitado='" + interpreteInvitado + '\'' +
                '}';
    }
}
