//Abstraccion
package Bridge;

/**
 *
 * @author Frank
 */
public abstract class ElaborarPasta {

    IElaborar implementador;
    String nombre;

    // --------------------------
    public IElaborar getImplementador() {
        return this.implementador;
    }

    // --------------------------
    public void setImplementador(IElaborar implementador) {
        this.implementador = implementador;
    }

    // --------------------------
    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
