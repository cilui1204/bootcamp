import java.math.BigDecimal;
import java.math.RoundingMode;


public class Person {

  //Attritube
  private String firstName;
  private String lastName;
  private double weight;
  private double height;

  //Empty Constructor
  public Person(){

  }

  // All Arguments Constructor
  public Person(String firstName, String lastName, double weight, double height){
    this.firstName=firstName;
    this.lastName=lastName;
    this.weight=weight;
    this.height=height;

  }

  //Attributes Presentation 
  public String fullName(){
    return this.firstName +" " +this.lastName;
  }

  // weight/height^2
  public double BMI(){
    return BigDecimal.valueOf(this.weight)//
    .divide(BigDecimal.valueOf(Math.pow(this.height,2)),RoundingMode.HALF_UP)//
    .doubleValue();
  }

  public String toString(){
    return "Person (" //
    + "First Name=" + this.firstName + " " //
    + "Last Name=" + this.lastName + " " //
    + "Weight=" + this.weight + " " //
    + "Height=" + this.height + " " //
    +")" ;
  }




  // getter setter
  public void setFirstName(String firstName){
    this.firstName=firstName;
  }

  public void setLastName(String lastName){
    this.lastName=lastName;
  }

  public void setWeight(double weight){
    this.weight=weight;
  }

  public void setHeight(double height){
    this.height=height;
  }


  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }

    //Convert BMI() to static method
  public static double BMI(double weight, double height){
     return BigDecimal.valueOf(weight)//
    .divide(BigDecimal.valueOf(Math.pow(height,2)),RoundingMode.HALF_UP)//
    .doubleValue();
  }

  public static void main(String[] args){
    //Creator
    //Constructor
    Person p1 = new Person(); //"new Person() -> create a Person Object in Memory"
    p1.setFirstName("Joseph");
    p1.setLastName("Lui");
    System.out.println(p1.fullName());
    p1.setHeight(1.7);
    p1.setWeight(66.5);
    System.out.println(p1.BMI());
    System.out.println(Person.BMI(p1.getWeight(),p1.getHeight()));
    System.out.println(p1.toString()); //Person (First Name=Joseph Last Name=Lui Weight=66.5 Height=1.7 )

    // Create a person object with given attribute values
    Person p2 = new Person("Jenny", "Chan", 55, 1.7);
    System.out.println(p2.toString());
    p2.setWeight(54);
    System.out.println(p2.toString());  


    Person p3 = p1;
    System.out.println(p1.getFirstName());//Joseph
    System.out.println(p3.getFirstName());//Joseph


  }
    


}
