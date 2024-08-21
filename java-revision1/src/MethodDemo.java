public class MethodDemo {

  private String firstName;
  public static void main(String[] args){
    int x = sum(1,2);

    Integer x2 = sum(1,2); //sum() method returns int value -> autobox -> Integer Object
    long l2 = sum(1,2); //upcast, int value to long value
    //Long l2 = sum(1,2); // int value -> long value -> Long Object (autobox)
    // Compiler would not do upcast and autobox at the same statement,

    // Call static method
    MethodDemo.sum(2,5);

    // No point to make sum2() become an instance method
    MethodDemo md = new MethodDemo("John");
    String John= md.fullName("Wong");
    System.out.println(John);
    md.sum2(2,3); //5

  }

  public MethodDemo(String firstName){
    this.firstName=firstName;
  }

  public static int sum(int x, int y){
    return x+y;
  }

  // sum2() didnt use instance method to produce the return value, So, it doesnt need to be instance method.
  public int sum2(int x, int y){
    return x+y;
  }

  // can we rewrite this method to static method?  NO, we CANNOT.
  public String fullName(String LastName){
    return this.firstName + " " + LastName;
  }


  
}
