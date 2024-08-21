public class DemoStaticFinal {

  //Constant //snakecase
  //logoString //camelcase
  private static final String LOGO_STRING ; 
  private static String name; //Static Variable

  private static final double PI = Math.PI;
  
  private final double salary = 0.0d; //finalized instane variable 
  //camelcase
  private int age; //Instance variable







  //triggered before main() method;
  static{
    LOGO_STRING = "default";
  }

  public int getAge(){
    return this.age;
  }

  public double getSalary(){
    return this.salary;
  }

  //instance method can access both insatance and static variable
  public String test(){
    return this.age + " " + name + " " + this.salary + " " + LOGO_STRING;
  }

  public static String getName(){
    return name;
  }

  public static String getLogo(){
    return LOGO_STRING;
  }

  //final is the java keyword. Compiler will check all final variable has been initialized
  //private final double salary ;
  //private static final String logo;
  public static void main(String[] args){
    //Instance variable
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age =10;
    //dsf.salary=1000; //Compile error, salary is a final variable
    System.out.println(dsf.salary); //0.0
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf.age=20;
    System.out.println(dsf2.salary); //0.0

    System.out.println(DemoStaticFinal.LOGO_STRING); //default

    DemoStaticFinal.name = "Vincent";

    //You cannot assign "static final variable in main() method, it is too late"
    //LOGO_STRING = "default"

  }


}
