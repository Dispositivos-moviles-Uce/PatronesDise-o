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
public interface IVisitor {

    public void visit(Factura factura);

    public void visit(Articulo art);
}
