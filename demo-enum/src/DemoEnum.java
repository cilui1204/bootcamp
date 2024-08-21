public class DemoEnum {

  //Constant (finite)
  //Weekday
  public static final String monday = "MONDAY";
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thursday = "THURSDAY";
  public static final String friday = "FRIDAY";

  public static void main(String[] args){
    System.out.println(DemoEnum.monday); //MONDAY


    // what happen in heap memory?
    // Answer: static variable would not point to object

    //Before the main method being executed, it loads enum class
    System.out.println(Weekday.MONDAY); // sysout -> calling Weekday MONDAY toString()
    // by default Weekday.class already @Override toString()
    System.out.println(Weekday.TUESDAY);
    System.out.println(Weekday.WEDNESDAY);
    System.out.println(Weekday.THURSDAY);
    System.out.println(Weekday.FRIDAY);

    // Other example ?
    // NORTH, WEST, EAST, SOUTH

    Direction d = Direction.EAST;
    if (d==Direction.SOUTH){ // complare object address directly

    }

  }
  
}
