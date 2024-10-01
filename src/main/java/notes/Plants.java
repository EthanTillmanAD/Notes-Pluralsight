package notes;

public abstract class Plants {
    public String name;
    public int lightLevel;

   public Plants(String name){
       this.name = name;
       System.out.println("New Plant " + this.name);
   }
}
