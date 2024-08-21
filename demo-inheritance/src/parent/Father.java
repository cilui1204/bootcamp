package parent;

public class Father {
  private String name;


  // When there is a non-empty constructor, the class will remove the default constructor
  // implicitly empty constructor
  public Father(String name) {
    this.name = name;
  }

  public Father() {
  }


}
