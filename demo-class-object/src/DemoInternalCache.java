public class DemoInternalCache {
  public static void main(String[] args){
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value -> autobox -> Integer Object (heap memory)
  
  // Internal Cache (For number)
  i1 = 127; // i1 (object ref) ,127-> (1st) cereate Integer Object
  i2 = 127; //i2 (object ref) , 127 -> (2rd) reuse the original Interger Object
  // from -128 to 127
  System.out.println(i1==i2); //true (are they same object)

  Integer i3 = 128; //128-> (1st) cereate Integer Object
  Integer i4 = 128; //128-> (2nd) cereate Integer Object
  System.out.println(i3==i4); //false

  //Important!!!
  //For Class, you should always compare their objects value by METHOD!!!!
  System.out.println(i3.compareTo(i4));  //0

  //float,double (No internal Cache in JVM) -> too many numbers in decimal 
  Float f1 = 10.1234f; //autobox: float value -> Float Object
  Float f2 = 10.1234f; //autobox: float value -> Float Object


  Double d1 = 10.1234d; //autobox: float value -> Float Object
  Double d2 = 10.1234d; //autobox: float value -> Float Object

  System.out.println(f1==f2); //false
  System.out.println(d1==d2); //false

  // Boolean support Internal cache
  Boolean b1 = true;
  Boolean b2 = true;
  System.out.println(b1==b2);

  //character: support Internal Cache (-128 to +127)
  Character c1 = 'c'; // autobox: char -> Character object
  Character c2 = 'c';
  System.out.println(c1==c2); //true 

  Character c3 = '我';
  Character c4 = '我';
  System.out.println(c3==c4); //false

  

  }
}