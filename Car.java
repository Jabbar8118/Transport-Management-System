
package transport.management.system;



public class Car extends Vehicle{
     public Car(String name, int id,int model, String color, int capacity) {
        super(name, id, model, color, capacity);
    }

    
    public double calculateFare(double time) {
        return 1000 * time;
    }
}
