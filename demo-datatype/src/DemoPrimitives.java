public class DemoPrimitives{
  public static void main (String[] args) {
    //numbers / string (test)
    //number (integers/decimal)
    // int is a data type that declaring the data type of values of x can be stored
    // int >intger
    int x =3;
    //int y = 3.5; // y cannot be non integer
    int z = -9;  // Look from right to left
    int total = x + z; //-6
    System.out.println(total);
    //+-*/
    System.out.println(z/x+(2*x-z));

    int remainder = 10%4;
    System.out.println(remainder);

    //2024.05.10
    double d1 = 10.3;
    double d2 = 10.34567;
    double d3 = -110.999;

    double result2 = d1 + d2 - d3;
    System.out.println(result2); // double -> +,-,*,% will have issue in some scenario

    double result3 = 0.1 + 0.2;
    System.out.println(result3); // 0.30000000000000004

    double result4 = 2+ 4*0.25; //Follow first multiple than +/-
    System.out.println(result4);

    int f1 = 7;
    double f2 = 8.8;
    //int f3 = f1 + f2; //error, because int + double -> double + double, 
    //so double value cannot be stored in an int variable int會比double低級

    int g = 10/3; // int/int -> int -> 3, so 3 can be assigned to variable g

    char c1 =  '1'; //儲存一個字嘅variable 只可以用single quote;  double係string
    char c2 = ' '; //space value
    //char c3 = ''; //char must contain a single character.
    //char c4 = 'aa'

    //Primitive: boolean -> true, false
    //boolean b1 = "true"; // you cannot assign a string value to boolean
    boolean b2 = true;
    boolean b3 = false;
    //boolean b4 = 1;

    //Primitives for Integer
    //int, long, byte, short
    byte by1 = 1; // byte can only store the integer with range of value between -128 to 127
    byte by2 = -127;
    //byte by3 = 128;
    //byte by4 = 129; // compile error (java can identify the syntax error)
  
    short s1 = -32768; //-32768 to 32768

    int i1 = -2147483648;
    //int i2 = -2147483649;   //-2147483648 to 2147483647

    long l1 = -9223372036854775808L ; //-> int 本質上係int 所以要加L
    // L means a way to specify this value is a long value

    // Primitives for number with decimal;
    //1. 10.2->double value
    //2. you cannot assign a double value to float variable, because float is with lower level of data type
    //3. In conclude, you cannot assign a higer level data type to a lower level data type
    double d10 = 10.2;
    float f10 = 10.2f; 

    //float f11 = 10.5f + 10.5; //float + double -> double + double, cannot assign to float 

    double d11 = 99.99d; // same as double d12 = 99.99

    //Local variable (within the main program, you can only decalre the same variable once)
    double d12; //variable declaration
    d12 = 10.9; //value assignment
    double d13 = 14.2; //variable declaration and assignment
    //double d13 = 19.0; // you cannot redeclare the same variable 
    d13 = 19.0; //reassignment



  }
}