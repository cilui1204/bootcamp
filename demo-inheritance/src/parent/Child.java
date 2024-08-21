package parent;

public class Child extends Father {

  // implicitly empty constructor
  public Child(String name) {
    super(name);
    // super();
    // super("John");
  }



  public static void main(String[] args) {
    Child c = new Child("Vincent");
    Father f1 = new Father();
    Father f2 = new Child("John");

    // Child c2 = new Father(); 
    //Type mismatch: cannot convert from Father to Child

    int x = 1; // x-> int object reference type, 1 -> int value

  }
}
