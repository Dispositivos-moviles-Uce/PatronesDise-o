/*
Al inicio del programa creamos el objeto de tipo Mediador encargado de dirigir la comunicación, y los de tipo Colega que participarán en la misma.
A continuación se provoca un cambio en uno de los objetos de tipo Colega a través del método comunicar() (implementado en la clase abstracta de la que heredan).
En dicho método se envían los datos (junto con una referencia al objeto modificado) al objeto de tipo Mediador para que a su vez los reenvíe a los demás objetos 
que participan en la comunicación (observa que no los envía también al objeto que sufrió el cambio).
 */
package Mediator;

/**
 *
 * @author Frank
 */
public class MainMediator {

    public static void main(String[] args) {
        // Crear el objeto centralizador de la comunicación
        Mediador m = new Mediador();
        // Crear los objetos que participarán en la comunicación
        Colega cc1 = new ColegaConcreto1(m);
        Colega cc2 = new ColegaConcreto2(m);
        Colega cc3 = new ColegaConcreto3(m);
        // Agregarlos al objeto centralizador
        m.agregarColega(cc1);
        m.agregarColega(cc2);
        m.agregarColega(cc3);
        // Provocar un cambio en un uno de los elementos
        cc2.comunicar("ColegaConcreto2 ha cambiado!");
    }
}
