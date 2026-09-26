
package transport.management.system;


public abstract class Vehicle {
    String name;
    int id;
    int model;
    String color;
    int capacity;
    public Vehicle(String name , int id , int model, String color, int capacity){
       
        setName(name);
        setId(id);
        setModel(model);
        setColor( color);
        setCapacity(capacity);
       
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }
    public void startTrip() {
        System.out.println("The ride is started");
    }

    public void endTrip() {
        System.out.println("The ride is ended");
    }
    abstract double calculateFare(double time);
}


