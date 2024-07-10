/*
cuando se produce un cambio en el observado éste envía una notificación a los observadores, que simplemente mostrarán un mensaje al recibirla.
Al inicio del programa se crea el objeto que será observado así como tres observadores que se agregan a su lista.
Se modifica por dos veces un valor del objeto observado.
Cuando se produce un cambio en el observado (se asigna un nuevo valor al atributo nombre), en el mismo método setNombre() se llama al método notificarObservadores() 
(que a su vez llama al método observadoActualizado() que implementan los objetos observadores) para enviarles una notificación, junto con una referencia a sí mismo observado y el valor modificado.
 */
package Observer;

/**
 *
 * @author Frank
 */
public class MainObserver {

    public static void main(String[] args) {
        // Instanciar el objeto que será Observado
        UnObservado objObservado = new UnObservado();
        objObservado.agregarObservador(new UnObservador());
        objObservado.agregarObservador(new UnObservador());
        objObservado.agregarObservador(new UnObservador());
        objObservado.setNombre("PEPE");
        objObservado.setNombre("MARTA");
    }
}
