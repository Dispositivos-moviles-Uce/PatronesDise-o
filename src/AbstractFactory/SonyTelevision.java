//Producto concreto
package AbstractFactory;

/**
 *
 * @author Frank
 */
public class SonyTelevision implements Television{
    
    @Override
    public void marca(){
        System.out.println("Television marca SONY");
    }
}
