public class DemoDivideByZero {

  public static void main(String[] args) {
    int amount = 0;
    System.out.println(divide(10, 3)); // 3

    // Approach 1
    if (amount == 0) {
      System.out.println(0);
    } else {
      System.out.println(divide(10, amount));
    } // exception
    // java.lang.ArithmeticException / by zero

    // Approach2 :Handle Exception
    // Unchecked Exception (Runtime Exception) - Implicitly
    //
    try {
      divide(10, 2);
      // ... line of code...
      String s = "hello";
      s = null;
      System.out.println(s.charAt(2)); // NullPointerException
    } catch (ArithmeticException e) {
      // send email to teammate..
      // insert to database...
      System.out.println("hello! Divided by Zero" + 10 + "/" + amount);
    } catch (NullPointerException e) {
      System.out.println("NPE: Please check.");
    }

    try {
      double averageExpense = calculateExpensePerEmployee2();
    } catch (ArithmeticException e) {
      System.out.println("somethign to fix...");
    }

    // main() -> calculateExpensePerEmployee() -> getDepartmentEmployee & getEmployeeCount

    try{
      calculateExpensePerEmployee3();
    } catch(EmployeeCountZeroException e){
      // specific handling for employee count =0 ....
    }



  }

  // return int
  // throw ArithmeticException (Implicitly)
  public static double divide(int x, int y) {
    return x / y;
  }

  public static int getEmployeeCount() {
    return 0;
  }


  public static int getDepartmentExpense() {
    return 140000;
  }


  // Approach 1
  public static int calculateExpensePerEmployee() {
    try {
      return getDepartmentExpense() / getEmployeeCount(); // bug
    } catch (ArithmeticException e) {
      return getDepartmentExpense(); // fix
    }
  }


  // Approach 2
  // When a method throw unchecked exception without handling, the exception will be thrown to caller
  public static int calculateExpensePerEmployee2() {
    return getDepartmentExpense() / getEmployeeCount(); // bug
  }

  // Approach 3
  // When a method throw unchecked exception without handling, the exception will be thrown to caller
  public static int calculateExpensePerEmployee3() {
    try {
      return getDepartmentExpense() / getEmployeeCount(); // bug
    } catch (ArithmeticException e) {
      throw new EmployeeCountZeroException();
    }

  }
}
