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
public class ConstructorCarroBase extends BuilderCarro{
    
     public ConstructorCarroBase() {
    }

    @Override
    public void construirMotor() {
        this.coche.setMotor( "Motor de potencia mínima" );
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocería de baja protección" );
    }

    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond( false );
    }

    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec( false );
    }
    
}
