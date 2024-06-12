import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args){
    double x = 0.2d;
    double y = 0.1d;
    System.out.println(x*y); //0.020000000000000004

    BigDecimal b1  = new BigDecimal("0.2");
    BigDecimal b2  = new BigDecimal("0.1");
    BigDecimal b3  = b1.multiply(b2);
    System.out.println(b3);

    System.out.println(sum(0.2,0.1)); //0.3
    System.out.println(0.2+0.1); //0.30000000000000004

    System.out.println(divide(9.9,3.0)); //3.3
    System.out.println(divide(9.9,3.2)); //3.09375

    System.out.println(BigDecimal.valueOf(3.3) 
    .subtract(BigDecimal.valueOf(1.1)).add(BigDecimal.valueOf(4.4)));


  }


  public static double sum(double d1, double d2){
    BigDecimal b1  = BigDecimal.valueOf(d1);
    BigDecimal b2  = BigDecimal.valueOf(d2);
    return b1.add(b2).doubleValue();
  }

    //Divide
    //method

    //d1.subtract().multiple()

    public static double divide(double d1, double d2){
      BigDecimal b1 = BigDecimal.valueOf(d1); 
      BigDecimal b2 = BigDecimal.valueOf(d2); 
      return b1.divide(b2,RoundingMode.UP)
      .setScale(3, RoundingMode.UP) // decimal okace, the way to rounding
      .doubleValue();
    }

  
}
