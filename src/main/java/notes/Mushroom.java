package notes;

public class Mushroom {
    // you can have multiple constructors
    //As long as the arguments are different
public int size;
    public boolean isMagic;
    public Mushroom(int size){
this.size = size;
        System.out.println("Mushroom size is " + this.size);
    }
    public Mushroom(){
        System.out.println("we dont know this one");
    }
    public Mushroom(boolean isMagic){
this.isMagic = isMagic;
        System.out.println("Mushroom is Magic " + this.isMagic);
    }
    public Mushroom(boolean isMagic, int size){//this works because they arent in
                       this.isMagic = isMagic;         // the same position
                this.size = size;

        System.out.println("Mushroom is magic " + this.isMagic + " and size is " + this.size);
    }
    public Mushroom(int size, boolean isMagic){
        this.size = size;
        this.isMagic = isMagic;
        System.out.println("Mushroom size is " + this.size + " is magic " + this.isMagic);
    }

    //Having Constructors like this is called overloaded/overloading



    //LEFT OFF ON PAGE 278!!!!!!!!!!!!!!!
}
