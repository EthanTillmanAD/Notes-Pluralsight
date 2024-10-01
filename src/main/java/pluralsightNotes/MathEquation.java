package pluralsightNotes;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;//without access modifier the instance variables are able to be used within the package
    public int test1; // public makes instance variables accessible everywhere
    private int test2; //private is only accessible within the class (NEEDS A GETTER AND SETTER TO CHANGE OUTSIDE CLASS)


    // initialization blocks

private static int numberOfCalcs;
private static double sumOfResults;



public MathEquation(){}

  public   MathEquation(char opCode){
        this.opCode = opCode;
    }
   public MathEquation(double leftVal, double rightVal, char opCode) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute(){
    switch (opCode){
        case 'a':
            result = leftVal + rightVal;
            break;
        case 's':
            result = leftVal - rightVal;
            break;
        case 'm':
            result = leftVal * rightVal;
            break;
        case 'd':
            result = rightVal != 0 ?leftVal / rightVal: 0.0d;
            break;
        default:
            System.out.println("invalid " + opCode);
            result = 0.0d;
    }

    numberOfCalcs++;
    sumOfResults += result;

    }
public static double getAverageResult(){
    return sumOfResults/numberOfCalcs;
}

}
