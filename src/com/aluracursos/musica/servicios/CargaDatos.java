package com.aluracursos.musica.servicios;

import com.aluracursos.musica.modelos.Listas;


import com.aluracursos.musica.modelos.Musica;
import com.aluracursos.musica.modelos.Podcast;
import com.aluracursos.musica.modelos.Titulo;

import java.util.Scanner;

public class CargaDatos implements Listas {
    private Titulo musica;
    private Titulo podcast;
    Scanner datos = new Scanner(System.in).useDelimiter("\n");


    @Override
    public Titulo playList() {
        return null;
    }

    public Titulo cargarDatos(String tipo) {
        if (tipo.equalsIgnoreCase("musica")) {
            System.out.println("Cargar Titulo");
            String titulo = datos.nextLine();
            System.out.println("Cargar Autor");
            String autor = datos.nextLine();
            System.out.println("Cargar Interprete");
            String interprete = datos.nextLine();
            System.out.println("Cargar Interprete Invitado");
            String interpreteInvitado = datos.nextLine();
            System.out.println("Cargar Duración");
            String dura = datos.nextLine();
            double duracion = Double.valueOf(dura);

            return new Musica(titulo, duracion, autor, interprete, interpreteInvitado);

        } else if (tipo.equalsIgnoreCase("podcast")) {
            System.out.println("Cargar Titulo");
            String titulo = datos.nextLine();
            System.out.println("Cargar Tema");
            String tema = datos.nextLine();
            System.out.println("Cargar Duración");
            String dura = datos.nextLine();
            double duracion = Double.valueOf(dura);
            return new Podcast(titulo, duracion, tema);

        }

        return null;
    }

    public void mostrar(Titulo titulo) {
        if (titulo instanceof Musica) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("El titulo es : " + titulo.getTitulo());
            System.out.println("Su duracion es : " + titulo.getDuracion());
            System.out.println("El Autor es : "+((Musica) titulo).getAutor());
            System.out.println("La interpreta : " + ((Musica) titulo).getInterprete());
            System.out.println("El interprete invitado es : " + ((Musica) titulo).getInterpreteInvitado());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } else if (titulo instanceof Podcast) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("El titulo es : " + titulo.getTitulo());
            System.out.println("Su duracion es : " + titulo.getDuracion());
            System.out.println("El Tema es : " + ((Podcast) titulo).getTema());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        } else {
            System.out.println("No hay Selección para Mostrar");
        }
    }
}
