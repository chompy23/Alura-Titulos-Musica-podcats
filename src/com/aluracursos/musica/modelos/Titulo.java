package com.aluracursos.musica.modelos;

public class Titulo {
    private String titulo;
    private double duracion;
    private int meGusta;
    private int totalDeReproducciones;
    private  int clasificacion;


    public Titulo(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    private void meGusta(){

    }

    private void reproducir(){

    }

    @Override
    public String toString() {
        return "Titulo{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", meGusta=" + meGusta +
                ", totalDeReproducciones=" + totalDeReproducciones +
                ", clasificacion=" + clasificacion +
                '}';
    }
}
