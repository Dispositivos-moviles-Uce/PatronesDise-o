//Implementador COncreto
package Bridge;

/**
 *
 * @author Frank
 */
public class Cocinar implements IElaborar {

    public Cocinar() {
    }

    @Override
    public void procesar() {
        
        System.out.println("\tAlimento cocinado");

    }

}
