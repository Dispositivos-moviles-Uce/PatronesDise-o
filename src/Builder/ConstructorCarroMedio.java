/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Frank
 */
public class ConstructorCarroMedio extends BuilderCarro{
    public ConstructorCarroMedio() {
    }

    @Override
    public void construirMotor() {
        this.coche.setMotor( "Motor de potencia media" );
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocería de protección media" );
    }

    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond( false );
    }

    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec( true );
    }
    
    
}
