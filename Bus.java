
package transport.management.system;

public class Bus extends Vehicle{
    public Bus(String name, int id,int model, String color, int capacity) {
        super(name,id, model, color, capacity);
    }

    
    double calculateFare(double time) {
        return 5000 * time;
    }
    
}
