
package Builder;

/**
 *
 * @author Frank
 */
public class Director {
    public Director() {
    }
    // --------------------------
     public void construir( BuilderCarro builder )
    {
        builder.crearNuevoCoche();
        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevalunas();
        builder.construirAireAcond();
    }
}
