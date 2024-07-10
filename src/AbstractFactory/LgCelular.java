//fabrica concreta
package AbstractFactory;

/**
 *
 * @author Frank
 */
public class LgCelular implements Celular{

    @Override
    public void marca() {
        System.out.println("Celular marca LG");
    }
    
   
}
