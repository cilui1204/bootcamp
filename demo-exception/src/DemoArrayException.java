import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayException {
  public static void main(String[] args){
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 1;
    // arr[5] = 1; //java.lang.ArrayIndexOutOfBoundsException

    int idx = 0;
    if (idx>=0 && idx<arr.length){
      arr[idx] =10;
    }

    try{
      arr[5] = 1;
    }catch(ArrayIndexOutOfBoundsException e){
      // send email to someone
    }
    System.out.println("end of program");

    String str = "hello";
    str.charAt(1);// e
    //str.charAt(str.length()); //java.lang.StringIndexOutOfBoundsException
    //str.substring(0, 5); //ava.lang.StringIndexOutOfBoundsExceptio

    int result = Integer.parseInt("1");
    System.out.println(result);

    int result2;
    try{
      result2 = Integer.parseInt("hello");
    } catch(NumberFormatException e){
      result2 = -1;
      System.out.println("NumberFormatException! Message: " + e.getMessage()); //For inut string: "hello"
    }
    System.out.println(result2);

    System.out.println(getDescription(18)); //Adult
    int age= -1;
    try{
      getDescription(age);
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }

    List<String> strings = new ArrayList<>(); // arr[0]
    // string.get(0); // java.lang.IndexOutOfBoundsExcpetion

    List<String> strings2 = new LinkedList<>(); // arr[0]
    // string.get(0); // java.lang.IndexOutOfBoundsExcpetion
  }

  public static String getDescription(int age) {
    if (age < 0)
      throw new IllegalArgumentException("age cannot be negative"); // invalid parameter
    if (age >= 66)
      return "Elderly";
    if (age > 18)
      return "Adult";
    return "Children";
  }
}
