//Fabrica Concreta
package AbstractFactory;

/**
 *
 * @author Frank
 */
public class SonyFabrica implements Fabrica{
    
    @Override
    public Television crearTelevision(){
        return new SonyTelevision();
    }
    
    @Override
    public Celular crearCelular(){
        return new SonyCelular();
    }
    
}
