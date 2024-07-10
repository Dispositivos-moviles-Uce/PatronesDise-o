//SUJETO REAl
package Proxy;

/**
 *
 * @author Frank
 */
public class ImagenReal implements Imagen {

    private String nombre;

    // ---------------------------
    public ImagenReal(String nombre) {
        this.nombre = nombre;
    }
    // ---------------------------

    @Override
    public void mostrarImagen() {
        System.out.println("Mostrando imagen: [" + nombre + "]");
    }

}
