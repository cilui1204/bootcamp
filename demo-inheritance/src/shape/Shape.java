package shape;

import java.math.BigDecimal;

public abstract class Shape {

  // abstract class can create instance method without implementation
  // Method without implementation -> abstract method
  public abstract double area();



  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) { // s is the object reference pointing to actual object (Circle/Square)
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    Shape[] shapes =
        new Shape[] {new Circle(3.0d), new Square(4.0d), new Circle(10.0d)};
    System.out.println(Shape.totalArea(shapes)); // 358.4335992412874



    // extra exmaple
    StringBuilder sb = new StringBuilder("hello");
    sb.append("World");
    // sb = sb.append("World");
    System.out.println(sb);
  }



}
