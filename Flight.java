import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Flight extends Passenger {
    private String flightNumber;
    private Date date;
    private String source;
    private String destination;
    private ArrayList<Passenger> passengers;
    private int maxPassengers; // (max numbers the plane can hold)
    private int currentCount; // (current number of passengers)

    public Flight(String firstName, String lastName, int passportId, String age, String flightFare, boolean hasBooked,
                  String flightNumber, Date date, String source, String destination,
                  int maxPassengers, int currentCount) {
        super(firstName, lastName, age, passportId, flightFare, false);
        this.flightNumber = flightNumber;
        this.date = date;
        this.source = source;
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.maxPassengers = 800;
    }

    public void addPassenger(Passenger passenger) {
        if (currentCount < maxPassengers) {
            passengers.add(passenger);
            currentCount++;
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName() + " added successfully");
        } else {
            System.out.println("Sorry, the flight is full. Cannot add more passengers.");
        }
    }

    // To book a flight
    public void bookFlight(String firstName, String lastName, int passportId) {

            System.out.println("Please provide your passport ID: ");
            Scanner keyboard = new Scanner(System.in);
            passportId = keyboard.nextInt(getPassportId());

            System.out.println("Please provide your first name: ");
            firstName = keyboard.nextLine();

            System.out.println("Please provide your last Name: ");
            lastName = keyboard.nextLine();

            System.out.println("The details of your flight for passport ID " +
                    "" + passportId +
                    "" + firstName +
                    "," + lastName + " has been booked");

        }


    public void cancelFlight(int passportId) {
        System.out.println("Please provide your passport ID:");
        Scanner keyboard = new Scanner(System.in);
        passportId = keyboard.nextInt();

        if (passportId == getPassportId()) {
            System.out.println("Your booking for :" + getFirstName() + " and " + getLastName() + " has been cancelled" );
        }
    }

    public void displayAllPassengers(ArrayList<Passenger> passengers){
        System.out.println("Flight Passenger Information: ");
        for (Passenger passenger: passengers) {
            System.out.println("Passenger:" + passenger.getFirstName() + passenger.getLastName());
        }

    }
}
