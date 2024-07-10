/*

 */
package Observer;

/**
 *
 * @author Frank
 */
public class UnObservador implements IObservador {

    public UnObservador() {
    }
    // ---------------------------------

    @Override
    public void observadoActualizado(Observado objObservado, Object valor) {
        System.out.println("El valor del objeto ha cambiado a [" + ((String) valor) + "]");
    }

}
