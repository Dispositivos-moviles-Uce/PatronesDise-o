//Manejador concreto
package ChainResponsability;

/**
 *
 * @author Frank
 */
public class ManejadorRangoPositivo extends Manejador {

    public ManejadorRangoPositivo() {
    }

    @Override
    public void comprobar(int numero) {
        if (numero > 0 && numero <= 50) {
            System.out.println("El número está entre 1 y 50");
        }
    }

}
