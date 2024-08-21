package shape;

import java.math.BigDecimal;

public class Square {
  private double length;

  public Square(double length){
    this.length = length;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }
  
}
