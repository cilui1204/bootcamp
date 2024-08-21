public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

      // The T declared in static method has no relationship to the T declared in attribute 
     public static<U> Box<U> createBox(U value){
        return new Box<>(value);
  }
}
