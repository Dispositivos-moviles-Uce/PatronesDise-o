package Singleton;

/**
 *
 * @author Frank
 */
public class Main {

    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            Carro.getInstancia();
        }
    }
}
