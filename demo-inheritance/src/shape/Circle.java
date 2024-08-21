package shape;

import java.math.BigDecimal;

// Shape is a class containing area abstract method
// Circle is a class inherit Shape class

public class Circle extends Shape{

//"final class" cannot be extended
//public final class Circle extends Shape{
  private double radius;

  public Circle(double radius){
    this.radius=radius;
  }

  public double getRadius(){
    return this.radius;
  }

  //abstract method is not allowed in normal class
  //public abstract String test();

  // 1. the parent class has the same method.
  // 2. compile would check if the parent class really has the same method.

  @Override
  public final double area(){ // "final method" cannot be override in child class
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }

  // Circle.class may have its own method.
  public void sleep(){
    System.out.println("cicle is sleeping...")
  }


  public static double circleArea(double radius){
    return BigDecimal.valueOf(radius)//
    .multiply(BigDecimal.valueOf(radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }

  public static void main(String[] args){
    Circle c1 = new Circle(3.0d);
    System.out.println(c1.area()); //28.27.......
    System.out.println(Circle.circleArea(3.0d)); //28.27.......
  }

  
}
