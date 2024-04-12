package com.aluracursos.musica.modelos;

public class Titulo {
    private String titulo;
    private int duracion;
    private int meGusta;
    private int totalDeReproducciones;
    private  int clasificacion;

    public Titulo(String titulo, int duracion, int meGusta, int totalDeReproducciones, int clasificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.meGusta = meGusta;
        this.totalDeReproducciones = totalDeReproducciones;
        this.clasificacion = clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    private void meGusta(){

    }

    private void reproducir(){

    }
}
