package MarcosUTN;

import MarcosUTN.entities.Car;
import MarcosUTN.entities.Mechanic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car("Chevrolet", "Corsa", 80,28, 90);
        Mechanic mechanic = new Mechanic();
        car.addObserver(mechanic);
        car.viewed();
//        System.out.println( "Hello World!" );
    }
}
