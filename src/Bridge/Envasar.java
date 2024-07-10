//Implementador COncreto
package Bridge;

/**
 *
 * @author Frank
 */
public class Envasar implements IElaborar {

    public Envasar() {
    }

    @Override
    public void procesar() {
        System.out.println("\tAlimento envasado");
    }

}
