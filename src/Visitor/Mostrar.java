/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Frank
 */
public class Mostrar implements IVisitor {

    public Mostrar() {
    }

    @Override
    public void visit(Factura factura) {
        System.out.println("=========================");
        System.out.println("Factura número [" + factura.getCodigo() + "]");
    }

    @Override
    public void visit(Articulo art) {
        System.out.println("Artículo [" + art.getNombre() + "] --> [" + art.getUnidades() + "] unidades)");
    }

}
