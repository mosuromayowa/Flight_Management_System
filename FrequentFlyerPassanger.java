public class FrequentFlyerPassanger extends Passenger {

    String flyerNumber;

     int miles;



    public FrequentFlyerPassanger(int passportId, String firstName, String lastName, int age, String flightFare, boolean hasBooked, String flyerNumber, int miles) {
        super(passportId, firstName, lastName, age, flightFare, hasBooked);
        this.flyerNumber = flyerNumber;
        this.miles = 0;
    }


    }

