package Command;

/**
 *
 * @author Frank
 */
public class MenuItemSalir implements IMenuItem {

    Receptor r;

    // --------------------------
    public MenuItemSalir(Receptor r) {
        this.r = r;
    }
    // --------------------------

    @Override
    public void ejecutar() {
        r.accion("SALIR");
    }

}
