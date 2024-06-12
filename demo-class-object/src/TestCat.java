public class TestCat {
  public static void main(String args[]){
    //Local variable
    String name = "John";

    //Local variable
    Cat c1 = new Cat(); // //"new Cat()" -> produce a Cat object in memory
    // memory address -> 0x123asfhw123iowhfiw
    // c1 -> object reference or varialbe (), able to find the cat object in memory.
    c1.setAge(10);
    System.out.println(c1.getAge()); //10

    //Local variable
    Cat c2 = new Cat();
    c2.setAge(7);

    //instance method is able to access (read & write) the object attributes
    System.out.println(c2.getAge());//7

    System.out.println(c2.describe());
    c2.setName("Ball");
    System.out.println(c2.describe());

    Cat c3 = new Cat();
    System.out.println(c3.getAge()); // 0, because primpitive type has default value

    Ball b = new Ball(); 
    //"Ball b" -> because Ball.class is "public class"
    // "new Ball()" -> because the constructor is "public"
    b.setColor("Yellow"); //because setColor() method is "public" method

  }
}
