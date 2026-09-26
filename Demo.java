
package transport.management.system;


public class Demo {
        public static void main(String[] args) {

        System.out.println("TRANSPORT MANAGEMENT SYSTEM");

        System.out.println("***DRIVER MODULE***");
        Driver d1 = new Driver("ali", 23, 3456, "male", 34000.0);
        
        System.out.println("NAME : "+d1.getName());
        System.out.println("AGE : "+d1.getAge());
        System.out.println("ID : "+d1.getId());
        System.out.println("GENDER : "+d1.getGender());
        System.out.println("SALARY : "+d1.getSalary());
        d1.travel();

        System.out.println("***PASSENGER MODULE***");
        Passenger p1 = new Passenger("salman", 40, 1028, "male", "swabi", 500);
        
        System.out.println("NAME : "+p1.getName());
        System.out.println("AGE : "+p1.getAge());
        System.out.println("ID : "+p1.getId());
        System.out.println("GENDER : "+p1.getGender());
        System.out.println("ADDRESS : "+p1.getAddress());
        System.out.println("TICKET : "+p1.getTicket());
        p1.travel();
        
        

        System.out.println("***BUS MODULE***");
        Bus b1 = new Bus("Car", 4545, 2025, "Black", 04);
        System.out.println("NAME : "+b1.getName());
        System.out.println("ID : "+b1.getId());
        System.out.println("MODEL : "+b1.getModel());
        System.out.println("COLOR : "+b1.getColor());
        System.out.println("CAPACITY : "+b1.getCapacity());
        System.out.println("FARE : "+b1.calculateFare(2));
        b1.startTrip();
        b1.endTrip();
        System.out.println("***CAR MODULE***");
        Car c1 = new Car("Car", 4545, 2025, "Black", 04);
        System.out.println("NAME : "+c1.getName());
        System.out.println("ID : "+c1.getId());
        System.out.println("MODEL : "+c1.getModel());
        System.out.println("COLOR : "+c1.getColor());
        System.out.println("CAPACITY : "+c1.getCapacity());
        System.out.println("FARE : "+c1.calculateFare(2));
        c1.startTrip();
        c1.endTrip();

    }
}


