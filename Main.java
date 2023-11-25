import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Flight Management System");

        LocalDate currentDate = LocalDate.now();
        Flight flight = new Flight(currentDate, "CityA", "CityB", 50); // Adjust maxPassengers accordingly

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {

            System.out.println("1. Add a passenger to the flight");
            System.out.println("2. Book the flight using passport ID");
            System.out.println("3. Cancel the flight using passport ID");
            System.out.println("4. Display details of all passengers");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addPassengerToFlight(flight);
                    break;
                case 2:
                    bookFlight(flight);
                    break;
                case 3:
                    cancelFlight(flight);
                    break;
                case 4:
                    displayAllPassengers(flight);
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void cancelFlight(Flight flight) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Passport ID to cancel the flight: ");
        int passportId = scanner.nextInt();
        flight.cancelFlight(passportId);
    }

    private static void bookFlight(Flight flight) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide the passport ID for the passenger: ");
        int passportId = scanner.nextInt();
        flight.bookFlight(passportId);
    }

    private static void addPassengerToFlight(Flight flight) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter passenger's last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter passenger age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter the flight fare: ");
        String flightFare = scanner.nextLine();

        // Create a Passenger instance with the provided details
        Passenger newPassenger = new Passenger(0, firstName, lastName, age, flightFare, true);

        // Add the new passenger to the flight
        flight.addPassenger(newPassenger);

        System.out.println("Passenger " + firstName + " " + lastName + " added to the flight.");
    }

    private static void displayAllPassengers(Flight flight) {
        flight.displayAllPassengers();
    }
}
