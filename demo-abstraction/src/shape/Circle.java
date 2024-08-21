package shape;

import java.math.BigDecimal;

public class Circle implements Shape {
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(Math.PI)//
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(this.radius)).doubleValue();
  }
  
}
