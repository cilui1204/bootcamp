import java.util.Scanner;

public class DemoObject {

  public static void main(String[] args){
    //getClass
    StringBuilder sb = new StringBuilder(); //java.lang.StringBuilder

    Scanner scanner = new Scanner(System.in); //java.util.Scanner

    Object object = new Object(); // Object is a ultimate parent 萬能指針
    object = "abc";
    object = Double.valueOf(13);
    object = new Cat();

    // All Classes extends Object.class.  Inherit all methods from Object.class
    System.out.println(new Cat().toString()); //I am a cat
    System.out.println(new Dog().toString()); //Dog@4554617c


    //Object.hashCode() 比機會描係咪同一個Class
    Cat c1 = new Cat();
    //generate an int value by object reference
    System.out.println(c1.hashCode()); //1956725890
    
    Cat c2 = new Cat(); 
    System.out.println(c2.hashCode()); //356573597

    String x1 = new String("abc");
    System.out.println(x1.hashCode()); //96354
    String x2 = new String("abc");
    System.out.println(x2.hashCode()); //96354 同一個String就完成任務

    MiniCat mc = new MiniCat("John", "Red");
    MiniCat mc2 = new MiniCat("John", "Red");
    System.out.println(mc.hashCode()); //71833703
    System.out.println(mc2.hashCode()); //71833703
    MiniCat mc3 = new MiniCat("Peter", "Red");
    System.out.println(mc3.hashCode()); //-1907720250

    Object cat = new Cat();
    // cat (object reference) indeed pointing to cat object
    // run() instance method can only be called by object declare by Cat.calss
    //if the object reference is declared by Object.class, it cannot call run() method
    //cat.run(); //compile errir
    
    // downcast
    Cat cat2 = (Cat) cat; // Reason why compile error: Java compiler cannot guarantee 
    cat2.run();

    //Cat.class inherit Object.class
    cat2.equals(cat);
    cat2.hashCode();

    //the differece between cat & cat2 object reference

    

  }

  // Java: Ensure type safety during compile time 唔會同你搏 有機會係貓 
  // public static int Object sum(Object x, Object y){
  //   return x+y; //"+" opeation -> String, Integer, int, Double, double, etc...
  // }

  public static int length(String x){
    return x.length();
  }

  //During compile time, Compiler cannot ensure the object in heap is a String object
  // public static int length2(Object x){
  //   return x.length();
  // }
  
  
}
