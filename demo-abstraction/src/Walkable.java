public interface Walkable {
  // Interface;
  // 1. No instance variable
  // 2. all methods are abstract implicity
  // 3. you can still declare "public static final"  implicity 
  // 4. A class can implement more than 1 interface, it can only extends one Parent class only

  // public static final int number = 3
  // Constant
  int AGE =3 ;

  // abstract void walk();
  void walk();

  //After Java 8, we have default method and static method in interface
  // can be override
  default void run(){
    System.out.println("I am running");
  }

  static void swim(){
    System.out.println("static I am swimming");
  }

  // default static 
  

}
