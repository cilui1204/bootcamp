public class DemoBlock {
  
  private static int number;
  private static int number2;
  private String name;

  //static block
  // 1.trigger once only, no matter the number of static varaibles(s), even no.
  static{
    System.out.println("start static block");
    number =3;
    System.out.println("end static block");
  }

  public DemoBlock(){
    System.out.println("Calling empty Constructor");
  }

  public DemoBlock(String name){
    System.out.println("Calling all args Constructor");
    this.name=name;
  }

  // instance block
  // 1. it is triggered when there is new object created
  // 2. it is triggered before constructor
  // 3. Usage: common logic before constructor
  {
    System.out.println("start instance block");
    this.name = "john";
    System.out.println("end instance block");
    number = 10;
  }


  public static void main(String[] args){
    System.out.println("start.");
    System.out.println(DemoBlock.number);//3
    System.out.println("End");

    DemoBlock db= new DemoBlock();
    DemoBlock db2= new DemoBlock("Vincent");
    System.out.println(DemoBlock.number);//10
    System.out.println("end");

  }

}
