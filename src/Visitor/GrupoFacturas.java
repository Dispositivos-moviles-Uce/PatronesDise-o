/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import java.util.ArrayList;

/**
 *
 * @author Frank
 */
public class GrupoFacturas implements IElemento {

    ArrayList<Factura> facturas = new ArrayList<Factura>();

    // ------------------------------
    public GrupoFacturas() {
    }

    // ------------------------------
    public void agregarFactura(Factura factura) {
        this.facturas.add(factura);
    }

    // ------------------------------
    public Factura getFactura(int posicion) {
        return this.facturas.get(posicion);
    }
    // ------------------------------

    @Override
    public void accept(IVisitor visitor) {
        for (Factura f : this.facturas) {
            f.accept(visitor);
        }
    }

}
