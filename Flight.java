import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Flight {
    private int flightNumber;
    private LocalDate date;
    private String source;
    private String destination;
    private ArrayList<Passenger> passengers;
    private int maxPassengers; // (max numbers the plane can hold)
    private int currentCount; // (current number of passengers)

    // Constructor to initialise all attributes
    public Flight(LocalDate date, String source, String destination, int maxPassengers) {
        this.flightNumber = generateFlightNumber();
        this.date = date;
        this.source = source;
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.maxPassengers = maxPassengers;
        this.currentCount = 0;
    }

    // Getter methods
    public int getFlightNumber() {
        return flightNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    // Add a passenger to the flight
    public void addPassenger(Passenger passenger) {
        if (currentCount < maxPassengers) {
            passengers.add(passenger);
            currentCount++;
            System.out.println("Passenger added successfully");
            System.out.println("Current number of passengers on the flight: " + currentCount);
        } else {
            System.out.println("Sorry, the flight is full. Cannot add more passengers.");
        }
    }

    // Book a flight for a passenger using passport ID
    public void bookFlight(int passportId) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassportId() == passportId) {
                System.out.println("The details of your flight for passport ID " +
                        passportId +
                        ": " + passenger.getFirstName() +
                        ", " + passenger.getLastName() + " have been booked.");
                return;
            }
        }
        System.out.println("No passenger found with passport ID " + passportId + ". Cannot book the flight.");
    }

    // Cancel a flight for a passenger using passport ID
    public void cancelFlight(int passportId) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassportId() == passportId) {
                passengers.remove(passenger);
                currentCount--;
                System.out.println("The user with the following details: " +
                        passportId +
                        ": " + passenger.getFirstName() +
                        ", " + passenger.getLastName() + " has been removed");
                return;
            }
        }
        System.out.println("No passenger found with passport ID " + passportId + ". Cannot cancel the flight.");
    }

    // Display information about all passengers on the flight
    public void displayAllPassengers() {
        System.out.println("Flight Passenger Information: ");
        for (Passenger passenger : passengers) {
            passenger.displayInfo();
        }
    }

    // Generate a random flight number
    private int generateFlightNumber() {
        Random random = new Random();
        return random.nextInt(900);
    }

    @Override
    public String toString() {
        return "Flight " +
                "Number: " + getFlightNumber() +
                ", Date: " + getDate() +
                ", Source: " + getSource() +
                ", Destination: " + getDestination() +
                ", Max Passengers: " + getMaxPassengers() +
                ", Current Count: " + getCurrentCount();
    }
}
