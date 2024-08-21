import java.math.BigDecimal;

public class StringDemo {
  public static void main(String[] args){
    String s = "hello";
    String s2 = s.concat("world"); // concat() method return new String object (address), no impact on s
    System.out.println(s); //hello
    System.out.println(s2); //helloworld   
    // s2 is an object reference, helping you to remain the way to find the object

    StringBuilder sb = new StringBuilder("hello");
    sb.append("world"); // You dont have to "save" the address of sb, because you already changed the value stored 
    System.out.println(sb); //helloworld
    sb.append("!!!");
    System.out.println(sb); //helloworld!!!

    // As a developer, you have to figure out the impact of each instance method of each Class.

    //BigDecima

    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 = BigDecimal.valueOf(3.4);
    bd.add(bd2); // you have to worry about the impact on bd. Is bd 6.7?
    System.out.println(bd);
    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0));
    System.out.println(bd3); //6.6


  }
  
}
