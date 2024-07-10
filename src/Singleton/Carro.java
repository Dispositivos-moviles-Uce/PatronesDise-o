//
package Singleton;

/**
 *
 * @author Frank
 */
public class Carro {

    private static Carro instancia;

    public Carro() {
    }

    public static Carro getInstancia() {
        if (instancia == null) {
            instancia = new Carro();
            System.out.println("El objeto ha sido creado");
        } else {
            System.out.println("Ya existe el objeto");
        }
        return instancia;
    }

}
