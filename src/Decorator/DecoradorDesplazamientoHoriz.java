//Decorador concreto
package Decorator;

/**
 *
 * @author Frank
 */
public class DecoradorDesplazamientoHoriz extends DecoradorDesplazamiento {

    public DecoradorDesplazamientoHoriz(IVentana v) {
        super(v);
    }

    @Override
    public void dibujar(int columna, int fila) {
        // Dibujar la ventana
        this.getVentana().dibujar(columna, fila);
        // Agregar barra de desplazamiento
        this.dibujarBarraDespHorizontal();
    }

    private void dibujarBarraDespHorizontal() {
        System.out.println("Agregada barra de desplazamiento horizontal");
    }

}
