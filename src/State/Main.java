/*
ejemplo en el que controlamos el estado de un semáforo:
 */
package State;

/**
 *
 * @author Frank
 */
public class Main {

    public static void main(String[] args) {
        Semaforo objSemaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrar();
        objSemaforo.setEstado(new EstadoNaranja());
        objSemaforo.mostrar();
        objSemaforo.setEstado(new EstadoRojo());
        objSemaforo.mostrar();
    }
}
