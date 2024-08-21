public class Human extends SuperHuman implements Walkable, Readable {
  
  //Class can only inherit instande methods, instance variable.
  //Constructor CANNOt be inherited.

  public Human(){
  }

  public Human(double height){
    super(height); //SuperHuman's constructor
  }
  
  @Override
  public void walk(){
    System.out.println("Human is walking...");
  }

  public void read(){
    System.out.println("Human is reading");
  }

  @Override
  public double getHeight(){
    return super.getHeight()+1;
  }


  public static void main(String[] args){
    System.out.println(Walkable.AGE); //3. public static final
    Human h1 = new Human();
    h1.walk();

    h1.run();

    Superman superman = new Superman();
    superman.run();

    Walkable.swim();
  }

}
