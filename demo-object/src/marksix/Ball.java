package marksix;

import java.util.Arrays;
import java.util.Objects;

public class Ball {
  private int number;

  public Ball(int number){
    this.number=number;

  }

  public int getNumber(){
    return this.number;
  }

  @Override
  public String toString(){
    return "Ball(" //
      + "Number= " + this.number//
      + ")";
  }

  @Override
  public boolean equals(Object obj){
    if (obj==this){
      return true;
    }
    if (!(obj instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) obj;
    return Objects.equals(this.number,  ball.getNumber());
  }

  public static void main(String[] args){
    byte b1 = 48; //java (special conversion: int -> byte, but wihtout casting in downcast)

    int i1 = 48;
    //byte b2 =  i1;  //compile error
    byte b2 = (byte) i1; // the type of i1 is int, so we have to explicitly convert the number


    int[] arr = new int[3];
    System.out.println(Arrays.toString(arr));
    int[] arr2 = new int[3];
    System.out.println(Arrays.toString(arr2));
    System.out.println(arr.equals(arr2)); //false
    System.out.println(Arrays.equals(arr,arr2)); //true

    Object ball = new Ball(40);
    // ball.getNumber(); //Polymorphism
    System.out.println(ball.getClass()); //class marksix.Ball

    Class<?> clazz = ball.getClass();
    System.out.println(clazz); //class marksix.Ball
    
    System.out.println(ball instanceof Ball); //true
  }


  
}
