
import com.aluracursos.musica.modelos.Titulo;
import com.aluracursos.musica.servicios.CargaDatos;

public class Principal {
    public static void main(String[] args) {
        CargaDatos datos = new CargaDatos();
        System.out.println("Cargar musica....");
        Titulo musica1 = datos.cargarDatos("musica");
        System.out.println("Cargar podcast...");
        Titulo podcast1 = datos.cargarDatos("podcast");
        System.out.println("Datos musica....");
        datos.mostrar(musica1);
        System.out.println("Datos Podcast....");
        datos.mostrar(podcast1);




    }
}
