/*
 este patrón de diseño nos resultará útil para acceder a los elementos de 
un array o colección de objetos contenida en otro objeto

Al inicio del programa creamos un objeto de tipo AgregadoConcreto (que contiene el vector que deseamos recorrer) para luego obtener una instancia de 
IteradorConcreto (en la que se encuentran definidos los métodos que utilizaremos para ello).
A continuación nos situamos en el primer elemento del vector, nos desplazamos dos posiciones más adelante y volvemos al primero para 
finalmente recorrerlo por completo mientras mostramos los elementos en cada una de sus posiciones.
Observa que cada vez que se llama al método siguiente() de IteradorConcreto devuelve realmente el valor en la posición actual y luego incrementa 
el índice de la posición actual (las posiciones comienzan desde cero).
 */
package Iterator;

/**
 *
 * @author Frank
 */
public class MainIterator {
    public static void main(String[] args)
    {
        try
        {
            // Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
            AgregadoConcreto agregado = new AgregadoConcreto();
            // Crear el objeto iterador para recorrer la lista
            Iterador iterador = agregado.getIterador();
            // Mover una posición adelante y mostrar el elemento
            String obj = (String) iterador.primero();
            System.out.println( obj );
            // Mover dos posiciones adelante
            iterador.siguiente();
            iterador.siguiente();
            // Mostrar el elemento actual
            System.out.println( (String) iterador.actual() + "\n" );
            // Volver al principio
            iterador.primero();
            // Recorrer todo
            while( iterador.hayMas() == true ) {
                System.out.println( iterador.siguiente() );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
