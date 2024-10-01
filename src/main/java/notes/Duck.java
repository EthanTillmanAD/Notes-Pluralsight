package notes;

public class Duck {
   int size;
    public Duck(int duckSize){// NO RETURN TYPE
        System.out.println("Quack");
        //Setting the constructor with a sout
       // using Duck d = new Duck(); will print out quack

//        size = duckSize;
//        System.out.println("Size is " + size);

        if(duckSize <= 0){
            size = 28;
        }else {
            size = duckSize;

        }
        System.out.println("Size is " + size);
    }
}
