package pluralsightNotes;

public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public Passenger(){}  // Constructors can be chained together

    public Passenger(int freeBags){
        this(freeBags > 1 ? 25.0 : 50.0);//this set the bag fee in the bottom constructor
        this.freeBags = freeBags;// this sets the amount of free bags

    }
    public Passenger(int freeBags, int checkedBags){ //use this constructor
        this(freeBags);// this calls the first constructor above
        this.checkedBags = checkedBags;//this sets the amount of checked bags
    }
    private Passenger(double perBagFee){
        this.perBagFee = perBagFee;//this takes the first line in the first constructor and sets the fee
    }

    public void getBags(){

    }
}
