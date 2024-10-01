package pluralsightNotes;

public class Flight {
  private int passangers; //field
   private int seats;
private int flightNumber;
private char flightClass;
private boolean[] isSeatAvailable = new boolean[seats];
private static int allPassengers, maxPassengersPerFlight;

    // initialization blocks
// doesnt require public with the class name, but will always be ran inside the class
//initialization blocks do not replace default constructor

    {// start of initialization block
    for(int i = 0; i < seats; i++){
        isSeatAvailable[i] = true;
    }
}// end of initialization block

    //Static initialization block
   static  {
//        AdminService adminService = new AdminService;
//        adminService.connect();
//        maxPassengersPerFlight = adminService.isRestricted() ?
    }


public Flight(int flightNumber){
//        this(/* inside here goes the parameter of the constructor you wanna use,
//         this is blank to use the constructor above */);
        this.flightNumber = flightNumber;
}
public Flight(char flightClass){
//        this();
        this.flightClass = flightClass;
}

   void add1Passenger(int seat){
        this.seats = seat;


        if(passangers < seats && passangers < maxPassengersPerFlight){
            passangers += 1;
            allPassengers += 1;// this will count up the amount of passengers / objects being created
        }else {
            handleTooMany();
        }

    }

    public int getSeats(){
       return this.seats;// getter gets the instance variable
    }

    public void setSeats(int seats){
       this.seats = seats; //setter sets the instance variable
    }

    public boolean hasRoom(Flight f2){

       int x = this.passangers + f2.passangers;

       return x <= seats;
    }

    private void handleTooMany(){
        System.out.println("Too many");
    }

    public static int getAllPassengers(){
        return allPassengers;// this will send out total of passengers
    }
public static void resetAllPassengers(){
        allPassengers = 0;
}

}
