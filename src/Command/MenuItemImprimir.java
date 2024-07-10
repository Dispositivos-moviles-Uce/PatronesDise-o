package Command;

/**
 *
 * @author Frank
 */
public class MenuItemImprimir implements IMenuItem {

    Receptor r;

    // --------------------------
    public MenuItemImprimir(Receptor r) {
        this.r = r;
    }
    // --------------------------

    @Override
    public void ejecutar() {
        r.accion("IMPRIMIR");
    }

}
