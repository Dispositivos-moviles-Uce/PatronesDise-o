//Producto concreto
package FactoryMethod;

/**
 *
 * @author Frank
 */
public class ArchivoVideo implements IArchivo {

    public ArchivoVideo() {
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de vídeo...");

    }

}
