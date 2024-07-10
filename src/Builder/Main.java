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
public class Main {
    public static void main(String[] args)
    {
        // Crear el objeto Director
         Director objFabrica = new Director();
        // Crear los objetos ConcreteBuilder
         BuilderCarro base  = new ConstructorCarroBase();
         BuilderCarro medio = new ConstructorCarroMedio();
        // Construir un coche con equipamiento base
         objFabrica.construir( base );
         Coche cocheBase = base.getCoche();
        // Construir un coche con equipamiento medio
        objFabrica.construir( medio );
        Coche cocheMedio = medio.getCoche();
        

        // Mostrar la información de cada coche creado
        mostrarCaracteristicas( cocheBase );
        mostrarCaracteristicas( cocheMedio );

    }
    // --------------------------------
    public static void mostrarCaracteristicas( Coche carro )
    {
        System.out.println( "Motor: " + carro.getMotor() );
        System.out.println( "Carrocería: " + carro.getCarroceria() );
        System.out.println( "Elevalunas eléctrico: " + carro.getElevalunasElec() );
        System.out.println( "Airea acondicionado: " + carro.getAireAcond() );
        System.out.println("===================================");
    }
}
