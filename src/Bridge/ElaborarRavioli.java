//Abstracion refinada
package Bridge;

/**
 *
 * @author Frank
 */
public class ElaborarRavioli extends ElaborarPasta {

    public ElaborarRavioli(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    @Override
    public void obtener() {
        System.out.println("Preparando raviolis...");
        this.getImplementador().procesar();
    }

}
