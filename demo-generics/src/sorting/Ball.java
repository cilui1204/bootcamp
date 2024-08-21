package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Objective: Learn existing interface
public class Ball implements Comparable<Ball> {
  private int number;
  private Color color;

  public Ball(int number, Color color){
    this.number = number;
    this.color = color;
  }

  public int getNumber(){
    return this.number;
  }

  public Color getColor(){
    return this.color;
  }

  @Override 
  public int compareTo(Ball ball){
    // Objectives: provide your own formula to sort the List<Ball>
    // Return Value: 1 or -1

    // Example 1: sort by number (descending)
    // You have 2 ball reference here: ball and this
    // -1 means "move to left" ( from left to right)

    //for (Color color : Color.)
    if (ball!= null && this.number>ball.getNumber())
      return -1;
    return 1;

    //return this.number > ball.getNumber() ? -1:1;

  }

  public String toString(){
    return "Ball("
    + "Color= " + this.color //
    + "Number= " + this.number//
    + " )";


  }

  public static void main(String[] args){
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(9, Color.BLACK));
    balls.add(new Ball(14, Color.WHITE));
    balls.add(new Ball(10, Color.RED));
    System.out.println(balls);

    //Sort
    //Collection.sort() -> call Loop List<Ball> -> ball.compareTo()
    // During compile time

    // Approach 1
    Collections.sort(balls); //nlogn , merge sort
    System.out.println(balls);

    //List<Bird> birds = new ArrayList<>();
    // Collections.sort(birds); // error, Bird.class did not implement comparable


    // Sort by color? RED -> WHITE -> BLACK
    // Sort by color, and then number? RED  -> WHITE -> BLACK, if same color, larger number go left

    // Approach 2
    balls.add(new Ball(1000,Color.RED));
    balls.add(new Ball(-8,Color.BLACK));
    Collections.sort(balls, new BallSortByColor());
    System.out.println(balls);

    int x =3;
    Comparator<Ball> formula = null;
    if (x>3){
      formula = new BallSortByColor();
    } else{

    }
    
    Collections.sort(balls,formula);
    System.out.println(balls);

  }
  
}
