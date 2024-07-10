/*
Se crea la interface IAritmetica, en la que definimos el método que deberán contener las clases que la implementen.
La clase OperacionAritmetica contiene una referencia a un objeto de tipo IAritmetica, para así poder utilizarlo cuando sea necesario.
Al inicio del programa creamos tres instancias de OperacionAritmetica, indicando el comportamiento que deberá tener cada una de ellas.
A continuación se realizan las operaciones y se muestra el resultado.
 */
package Strategy;

/**
 *
 * @author Frank
 */
public class Main {

    public static void main(String[] args) {
        OperacionAritmetica context;
        context = new OperacionAritmetica(new Sumar());
        int suma = context.procesar(3, 4);
        context = new OperacionAritmetica(new Restar());
        int resta = context.procesar(3, 4);
        context = new OperacionAritmetica(new Multiplicar());
        int multip = context.procesar(3, 4);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multip);
    }
}
