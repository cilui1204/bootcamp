public class Cat { // Class Name -> Name Convention -> able to describe physical object
                  //object

  //what is "this"
  //why setAge() and setName() are void methods?
  //why getAge() and getName() are methods with return type?

  //state
  //attributes
  private String name;
  private int age; 


  // if NO constructor is defined.
  //by default the class implicitly has a empty constructor

  //behaviour
  //instance method
  //setAge is a method that can be called by object only
  //For example, Cat c1 = new Cat();
  // c1.setAge(13);
  // "this" -> the object pointed by c1 (object reference)

  // void is a return type, requires return nothing.
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  //instance method
  public String describe(){
    return "The age of this cat is " + this.age + ", and the name of this cat is " + this.name;
  }

    // purpose of static method -> produce something by the inout parameters
    //static method should not access any object attributes/behaviours
  public static String hello(){
    return "hello";
  }

  
}
