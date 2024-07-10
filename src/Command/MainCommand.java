/*
 *A continuación mostramos un ejemplo muy básico de uso este patrón, en el que creamos un menú de opciones.
 */
package Command;

/**
 *
 * @author Frank
 */
public class MainCommand {

    public static void main(String[] args) {
        // Crear el objeto Menú (el Invocador)
        Menu objMenu = new Menu();
        // Crear el Receptor
        Receptor objReceptor = new Receptor();
        // Crear las opciones de menú, indicándoles el Receptor
        IMenuItem objOpcionAbrir = new MenuItemAbrir(objReceptor);
        IMenuItem objOpcionImprimir = new MenuItemImprimir(objReceptor);
        IMenuItem objOpcionSalir = new MenuItemSalir(objReceptor);
        // Agregar las opciones al Menú
        objMenu.add(objOpcionAbrir);
        objMenu.add(objOpcionImprimir);
        objMenu.add(objOpcionSalir);
        // Ejecutar cada opción del menú
        objMenu.get(0).ejecutar();
        objMenu.get(1).ejecutar();
        objMenu.get(2).ejecutar();
    }
}
