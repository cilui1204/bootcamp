import java.math.BigDecimal;
import java.util.Calendar;

public class calculator {
  //static method -> instance method
  private int digit1;
  private int digit2;

  public void setDigit1(int digit1){
    this.digit1=digit1;
  }

  public void setDigit2(int digit2){
    this.digit2=digit2;
  }

  public static int sum(int digit1, int digit2){
    return digit1+digit2;
  }

  public static double sum(double digit1, double digit2){
    return ((BigDecimal.valueOf(digit1)).add(BigDecimal.valueOf(digit2)).doubleValue());
  }

  public static float sum(float digit1, float digit2){
    return digit1+digit2;
  }


  public int sum(){
    return this.digit1+this.digit2;
  }

  public int multipe(){
    return this.digit1*this.digit2;
  }

  public static void test(String[] args){
    for (int i=0;i<args.length;i++){
      System.out.println(args[i]);
    }
  }

  public static void test2(String... args){ //String... ->String[] (they are same type)
    // for each
    for (String s:args) {
      System.out.println(s);
    }

  }

  public static void main(String args[]){
    calculator c1 = new calculator();
    c1.setDigit1(2);
    c1.setDigit2(3);
    System.out.println(c1.sum());
    System.out.println(c1.multipe());


    //Method Overloading
    //sum(1,2)
    //because you are passing int value, so overloading determine
    //sum(int x,int y) is called

    //sum(1.0,2.0)
    //sum(double x, double y) is called

    //sum(1.0f,2.0f); //1.0f -> f;oat value, 2.0f -> float value
    //upcast, promotion
    //sum(double x, double y) is called

    //String.valueOf() -> overloading
    String.valueOf(10L); // "10"
    String.valueOf(new char[]{'a','b','c'}); // "abc"

    calculator.test(new String[]{"abc","ijk"});
    calculator.test2(new String[]{"abc","ijk"});
    calculator.test2("abc","ijk");




    //static
    calculator.sum(3,2); //5 static method
    // new calculator().setDigit1(6); //void , no object reference
    calculator x = new calculator() ;
    x.setDigit1(3); //instance method
    x.setDigit2(2); // instance method
    System.out.println(x.sum()); //5

    System.out.println(x.sum(2,3)); //static method
    //object reference is able to call static method  用object搵到公家地方 ;;;;; 公家地方搵唔返object


    //calculator.sum(); //instance method cannot be called by Class Name
    //static method can be called by instance (object) or Class name
    // Instance method can be only called by instance (object) ONLY



  }
}
