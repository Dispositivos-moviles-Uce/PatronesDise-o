/*
ejemplo en que utilizamos este patrón para guardar y recuperar marcadores a las páginas de un libro:
Al iniciarse el programa se crea tanto una instancia de la clase Libro como otra de GestorMarcadores, que guardará una lista en la que se almacenarán las referencias a los marcadores.
Cada marcador es creado utilizando el método guardarMarcador() de un objeto Libro, quedando almacenado el número de página en un objeto de tipo Memento, el cual será posteriormente guardado en una lista mediante el método addPosicionMarcador() de GestorMarcador().
El uso del método irPagina() es méramente ilustrativo, no siendo necesario para el correcto funcionamiento del ejemplo.
 */
package Memento;

/**
 *
 * @author Frank
 */
public class MainMemento {

    public static void main(String[] args) {
        GestorMarcadores objGestorMarcadores = new GestorMarcadores();
        // Abrimos el libro y vamos a la página 10
        Libro libro = new Libro();
        libro.irPagina(10);
        // Guardamos la página en marcadores
        objGestorMarcadores.addPosicionMarcador(libro.guardarMarcador());
        // Saltamos a la página 83
        libro.irPagina(83);
        // Guardamos la página en marcadores
        objGestorMarcadores.addPosicionMarcador(libro.guardarMarcador());
        // Volvemos a la primera página guardada en marcadores
        libro.recuperarPagina(objGestorMarcadores.getPosicionMarcador(0));
        // Saltamos a la segunda página guardada en marcadores
        libro.recuperarPagina(objGestorMarcadores.getPosicionMarcador(1));
    }
}
