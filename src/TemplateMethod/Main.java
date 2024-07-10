/*
En ClaseAbstracta se define el método plantilla obtener(), desde el que se llama a dos métodos definidos como abstractos (que serán implementados por las subclases).
En ClaseConcreta1 se implementan dichos métodos de forma que uno de ellos devuelve el número entero recibido como parámetro multiplicado por 100, y otro agregándole 10.
En ClaseConcreta2 se implementan de modo que lo devuelven multiplicado por 1000 y agregándole 100, respectivamente.
 */
package TemplateMethod;

/**
 *
 * @author Frank
 */
public class Main {

    public static void main(String[] args) {
        ClaseConcreta1 cc1 = new ClaseConcreta1();
        ClaseConcreta2 cc2 = new ClaseConcreta2();
        // Obtener el resultado de multiplicar 3 por 100 y restarle 10
        int num1 = cc1.obtener(3);
        System.out.println("num1: " + num1);
        // Obtener el resultado de multiplicar 3 por 1000 y restarle 100
        int num2 = cc2.obtener(50);
        System.out.println("num2: " + num2);
    }
}
