public class Passenger {
    // Passenger class
    // fields
    private int passportId;

    private String firstName;

    private String lastName;

    private String age;

    private String flightFare;

    private boolean hasBooked;

    public Passenger (int passportId, String firstName, String lastName, String age, String flightFare,boolean hasBooked) {
        this.passportId = passportId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.flightFare = flightFare;
        this.hasBooked = false;
    }

}
