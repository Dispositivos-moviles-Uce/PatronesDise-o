//Fabrica Concreta
package AbstractFactory;

/**
 *
 * @author Frank
 */
public class LgFabrica implements Fabrica{
    
    @Override
    public Television crearTelevision(){
        return new LgTelevision();
    }
    
    @Override
    public Celular crearCelular(){
        return new LgCelular();
    }
}
