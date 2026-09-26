
package transport.management.system;
import java.util.Scanner;

public class Ride {
        private double time;
    private double fare;

    

    public void selectVehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener 1 for BIKE");
        System.out.println("Ener 2 for CAR");
        System.out.println("Ener 3 for BUS");
        int choice = sc.nextInt();

        if (choice == 1) {
            fare = 500 * time;
        } else if (choice == 2) {
            fare = 1000 * time;
        } else if (choice == 3) {
            fare = 5000 * time;
        } else {
            System.out.println("You entered wrong choice");
        }
        System.out.println("Total Fare: " + fare);

    }

    public void calculateFare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in hours");
        time = sc.nextDouble();
        selectVehicle();

    }
}


