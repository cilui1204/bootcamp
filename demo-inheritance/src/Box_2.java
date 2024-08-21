import java.math.BigDecimal;

public class Box_2 {
  private String x;

  public Box_2 append(String y){
    this.x+=y;
    return this;
  }

  public String toString(){
    return this.x;
  }

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    sb.append("hello"); //hello
    System.out.println(sb); 


    Box_2 b = new Box_2();
    b.append("hello"); //nullhello
    System.out.println(b); 

    BigDecimal bd = new BigDecimal(0.0d);
    BigDecimal bd2 = new BigDecimal(0.0d);
    
    bd.add(BigDecimal.valueOf(1.0d));
    // add() -> create new BigDecimal
    bd2 = bd.add(BigDecimal.valueOf(1.0d));
    System.out.println(bd.doubleValue()); // 0.0
    System.out.println(bd2.doubleValue()); // 1.0
  }
}
