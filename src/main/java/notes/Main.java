package notes;

public class Main {
    public static void main(String[] args) {
        Duck d = new Duck(-1);

        d.size = 9;

        Mushroom[] m = new Mushroom[5];
        m[0] = new Mushroom(6); //Mushroom size is 6
        m[1] = new Mushroom();//we dont know this one
        m[2] = new Mushroom(true);//Mushroom is Magic true
        m[3] = new Mushroom(true,5);//Mushroom is magic true and size is 5
        m[4] = new Mushroom(3, false);//Mushroom size is 3 is magic false

        // how we can use each constructor in different array elements/ and prints out each row
    }

}
