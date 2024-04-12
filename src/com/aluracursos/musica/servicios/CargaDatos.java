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
    public String playList() {
        return " Se crearán los datos para las listas";
    }

    public Titulo cargarDatos(String tipo){
        if(tipo.toLowerCase().equals("musica")){
            System.out.println("Cargar Titulo");
            String titulo = datos.nextLine();
            System.out.println("Cargar Duración");
            int duracion = datos.nextInt();
            System.out.println("Cargar Autor");
            String autor = datos.nextLine();
            System.out.println("Cargar Interprete");
            String interprete = datos.nextLine();
            System.out.println("Cargar Interprete Invitado");
            String interpreteInvitado = datos.nextLine();

            return new Musica(titulo,duracion,autor,interprete,interpreteInvitado);
        } else if (tipo.toLowerCase().equals("podcast")) {
            System.out.println("Cargar Titulo");
            String titulo = datos.nextLine();
            System.out.println("Cargar Duración");
            int duracion = datos.nextInt();
            System.out.println("Cargar Tema");
            String tema = datos.nextLine();
               return new Podcast(titulo,duracion,tema);

        }

        return null;
    }
}
