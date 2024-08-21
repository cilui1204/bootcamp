package marksix;

import java.util.Objects;

public class SmallBall extends Ball{

  private String color;

  //constructor
  public SmallBall(int number, String color){
    super(number);
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  //toString()? equals()? hashCode?
  @Override
  public String toString(){
    return "SmallBall (" //
      + "color= " + this.color//
      + ", " + super.toString() //
      + ")";
  }



  @Override
  public boolean equals(Object obj){
    if (obj==this){
      return true;
    }
    if (!(obj instanceof SmallBall)){
      return false;
    }
    SmallBall sb = (SmallBall) obj;
    return Objects.equals(this.color, sb.getColor()) 
    //&& Objects.equals(super.getNumber(), sb.getNumber()) ;
        && Objects.equals(this.getNumber(), sb.getNumber()) ; //also work because this inherit
  }

  public int hashCode(){
    return Objects.hash(this.color,super.getNumber());
  }

  public static void main(String[] args){
    SmallBall b1 = new SmallBall(1, "Red");
    SmallBall b2 = new SmallBall(1, "Red");
    SmallBall b3 = new SmallBall(1, "Orange");
    System.out.println(b2.equals(b1)); //true

    System.out.println(b1.hashCode()); //2543985
    System.out.println(b2.hashCode()); //2543985
    System.out.println(b3.hashCode()); //455031604

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);


  }
}
