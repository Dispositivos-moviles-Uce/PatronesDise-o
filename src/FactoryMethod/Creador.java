//creador COncreto
package FactoryMethod;

/**
 *
 * @author Frank
 */
public class Creador extends CreadorAbstracto{

     public void Creador() {
    }
    
    @Override
    public IArchivo crear(int tipo) {

        IArchivo objeto;
        switch( tipo )
        {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
    
}
