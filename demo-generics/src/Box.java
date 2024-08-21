
public class Box<T> { // <T> just like unknown & any type
  private T value;

  public Box(T value){
    this.value = value;
  }

  public Box(){

  }

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value= value;
  }

  // The T declared in static method has no relationship to the T declared in attribute 
  public static<U> Box<U> createBox(U value){
    return new Box<>(value);
  }

  public static void main(String[] args){
    // Run time
    // You have to define the type <T> during the run-time
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(100);
    Box<Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer());

    // You cannot use T during run-time
    // Box<T> box = new Box<>();
    Box<String> stringBox = Box.createBox("hello");
    Box<Bird> birdBox = Box.createBox();
  }


}
