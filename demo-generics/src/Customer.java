public class Customer {
  private int age;

  public Customer(int age){
    this.age= age;
  }

  public Customer(){

  }

  public void setAge(int age){
    this.age=age;
  }

  public int getAge(){
    return this.age;
  }

  public String toString(){
    return "Customer( "//
    + "age=" + this.age //
    + ")";
  }

}
