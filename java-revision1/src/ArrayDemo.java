public class ArrayDemo {

  public static void main(String[] args){
    //Array
    int[] arr = new int[]{1,2,3}; //right hand side; array object


    //Integer[] integers = new int[]{1.2.3}; // it is not upcast;

    //how many object are created in this statment?
    Integer [] intergers = new Integer[]{1,2,3}; //upcast, 1 (int value) -> Integer Object with value 1 
    // Answer 4 object in total.
    // 1. Array Object
    // 2. Integer Object with value 1
    // 3. Integer Object with value 2 
    // 4. Integer Object with value 3

    System.out.println(intergers[2]); //3, integers[2] -> storing the address of "Integer Object with value 3"


  }
  
}
