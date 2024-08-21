public class DemoOverriding { //dynamic polymorphism (run-time)

  public static void main(String[] args){
    Animal animal = new Cat();
    animal.walk(); //Compile time checks the scope of the object, but not the implementation
    //animal.run(); // compile error, because Animal.class has walk() ONLY.

    // During runtime, the cat object is created in heap memory,
    // then the object ref "animal" will point to cat object and execute walk() method
    // That is Cat.walk()

    //Example 2
    Animal animal2 = new Animal();
    //No relationship with Cat.class or Dog.class
    animal2.walk(); //Animal is walking

    // During runtime, the new animal object is created in heap memory,
    // then the object ref "animal2" will point to animal object and execute walk() method
    // That is Animal.walk()

    //Example 3
    animal = new Dog();
    //animal.sleep(); //complie error, because the object reference type determined the scope of the object.
    animal.walk(); //because Dog.class does not override the walk() method.

  }
  
}
