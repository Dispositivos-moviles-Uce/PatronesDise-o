//Prototipo abstracto
package Prototype;

/**
 *
 * @author Frank
 */
public abstract class Enemigo {

    private String nombre = "";
    private String arma = "DAGA";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    // Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract Enemigo clonar();

    public abstract void atacar();

    public abstract void detener();
}
