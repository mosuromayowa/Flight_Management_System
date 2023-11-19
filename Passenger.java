public class Passenger {
    // Passenger class
    // fields
    private int passportId;

    private String firstName;

    private String lastName;

    private String age;

    private String flightFare;

    private boolean hasBooked;

    public Passenger (String passportId, String firstName, String lastName, int age,
                      String flightFare, boolean hasBooked) {
        this.passportId = passportId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.flightFare = flightFare;
        this.hasBooked = false;
    }

    /**
     * • Methods:
     * • Constructor to initialize all the attributes.
     * • bookFlight(): set hasBooked to true.
     * • cancelFlight(): set the hasBooked to false.
     * • displayInfo(): Prints the details of the passenger.
     * • toString() : return a string representation of the object.
     */
    public void setHasBooked(boolean hasBooked) {
        this.hasBooked = hasBooked;
    }
    // getter for the names, age, flight fare and others
    public String getFirstName() {
        return firstName;
    }

    public int getPassportId() {
        return passportId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getFlightFare() {
        return flightFare;
    }

    public boolean isHasBooked() {
        return hasBooked;
    }

    // book flight method
    public void bookFlight() {
        setHasBooked(true);
    }
    // cancel flight method
    public void cancelFlight() {
        setHasBooked(false);
    }


    public void displayInfo(){
        System.out.println("------------------");
        System.out.println("Passenger Information");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Passport ID: " + passportId);

    }

    @Override
    public String toString() {
        return "Passenger " +
                "{First Name =" + getFirstName()
                + ", LastName=" + getLastName()
                + ", Age =" + getAge()
                + ", Passport ID= " + getPassportId()
                + ", Flight fare=" + getFlightFare();
    }
}
