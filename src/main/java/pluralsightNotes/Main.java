package pluralsightNotes;

import static pluralsightNotes.Flight.resetAllPassengers; //this will import only resetAllPassengers from flight to main
import static pluralsightNotes.Flight.getAllPassengers;
import static pluralsightNotes.Flight.*; // this will import all over to main
//java is an Object-oriented Language

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight('a');
        Flight flight2 = new Flight(3);

        flight2 = flight1;// with this flight2 will only reference flight1
        flight1.add1Passenger(150);
        flight1.add1Passenger(150);

        //System.out.println(flight2.passangers);//prints 2 instead of 0
preformCalculations();
flight2.add1Passenger(150);

    Flight flight3 = null;

        System.out.println(flight1.hasRoom(flight2));
        System.out.println(flight1.getAllPassengers());
        System.out.println(flight2.getAllPassengers());
        System.out.println(Flight.getAllPassengers());

        Passenger cheapJoe = new Passenger(2);
        Passenger santiago = new Passenger(2,3);



    }
static void preformCalculations(){
        double[] leftVals = {100.0, 25.0, 225.0,11.0 };
        double[] rightVals ={50.0, 92.0, 17.0, 3.0};
        char[] opCodes = {'d', 'a', 's', 'm'};


        MathEquation[] equations = new MathEquation[4];// this creates new references
        equations[0] = new MathEquation(leftVals[0], rightVals[0], opCodes[0]) ; //object array insert
        equations[1] = new MathEquation(leftVals[1], rightVals[1], opCodes[1]);   //this line reads equation object 1 = 25, 92, 'a' for add
        equations[2] = new MathEquation(leftVals[2], rightVals[2], opCodes[2]);   // object takes in all information and returns each as a new object
        equations[3] = new MathEquation(leftVals[3], rightVals[3], opCodes[3]);
    // each new MathEquation is a new object reference
                    // new MathEquation sends all info above to the constructors instead of whats commented out below!


        for(MathEquation e : equations){// for each loop

            e.execute();
            System.out.println("Result = " + e.result);

        }
    System.out.println("Average result = " + MathEquation.getAverageResult());
    


}

//    private static MathEquation create(double leftVal, double rightVal, char opCode) {
//
//        MathEquation equation = new MathEquation();
//        equation.leftVal = leftVal;
//        equation.rightVal = rightVal;
//        equation.opCode = opCode;
//
//        return equation;
//
//    }

}
