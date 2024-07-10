package AbstractFactory;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Cliente {
    
      public static void usarServicio(Fabrica tipoFabrica){
            Television television = tipoFabrica.crearTelevision();
            Celular celular = tipoFabrica.crearCelular();
            
            
            television.marca();
            celular.marca();
            
        }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println ("ingrese 1 si desea crear productos de la marca LG");
        System.out.println ("ingrese 2 si desea crear productos de la marca SOny");
        
        int opcion = s.nextInt();
        
        if(opcion == 1){
            usarServicio(new LgFabrica());
            
        }else{
            usarServicio(new SonyFabrica());
        }
    }
}
