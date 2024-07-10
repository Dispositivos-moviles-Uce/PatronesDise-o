/*
 En la clase abstracta Manejador definimos el método procesar() en el que comprobamos 
si el valor recibido es válido: si lo es lo envía al método que lo procesa, y de lo contrario 
lo pasa al siguiente objeto en la cadena de responsabilidad (si lo hubiere).
 */
package ChainResponsability;

/**
 *
 * @author Frank
 */
public class Main {

   public static void main(String[] args)
    {
        Manejador m1 = new ManejadorPositivo();
        Manejador m2 = new ManejadorNegativo();
        Manejador m3 = new ManejadorRangoPositivo();
         m1.setSiguiente( m2 );
         m2.setSiguiente( m3 );
         m1.procesar(60);
        m1.procesar(-30);
        m1.procesar(40);
    }
}
