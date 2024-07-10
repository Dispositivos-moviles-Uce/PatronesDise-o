/*
el siguiente programa tenemos una clase GrupoFacturas (de tipo ObjetoEstructura) 
en el que se guardan referencias a objetos Factura (que a su vez contienen otros 
de tipo Articulo). Al ejecutarlo se mostrarán las facturas que se hayan agregado 
junto con los artículos que contienen.
 */
package Visitor;

/**
 *
 * @author Frank
 */
public interface Main {

    public static void main(String[] args) {
        // Creamos el objeto estructura
        GrupoFacturas grupo = new GrupoFacturas();
        // Creamos una factura y le pasamos los elementos
        Factura fact1 = new Factura(1);
        fact1.agregarArticulo(new Articulo("Tornillos", 40));
        fact1.agregarArticulo(new Articulo("Tuercas", 80));
        fact1.agregarArticulo(new Articulo("Taladros", 65));
        // Creamos otra factura y le pasamos los elementos
        Factura fact2 = new Factura(2);
        fact2.agregarArticulo(new Articulo("Martillos", 30));
        fact2.agregarArticulo(new Articulo("Linternas", 90));
        // Agregamos las facturas al objeto estructura
        grupo.agregarFactura(fact1);
        grupo.agregarFactura(fact2);
        // Pasamos el visitor al objeto de estructura para que recorra
        // todas las facturas y los artículos que contiene
        grupo.accept(new Mostrar());
    }
}
