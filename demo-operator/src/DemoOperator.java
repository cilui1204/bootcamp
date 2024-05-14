public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x = x + 1;
    System.out.println("x=" + x); //String + int -> String

    x++; //same as x = x + 1
    System.out.println("x=" + x); //String + int -> String

    x += 1; //same as x = x + 1
    System.out.println("x=" + x); //String + int -> String

    ++x;// same as x=x+1
    System.out.println("x=" + x); //String + int -> String

    int y =4; 
    System.out.println("y=" + y); 
    y=y-1 ;
    System.out.println("y=" + y); 
    y--;
    System.out.println("y=" + y); 
    --y;
    System.out.println("y=" + y); 
    y-=1;
    System.out.println("y=" + y); 

    y-=10;
    System.out.println("y=" + y); 

    // +=

    int p = 4;
    p = p * 2; //8
    p *= 2; //16
    p /= 4;
    System.out.println("p=" + p); 

    int z =10;
    z= z%3; //1
    int j = 10;
    j %= 3; //1
    System.out.println("j=" + j);


    String s = "hello";
    s = s + " world";
    s += "ssss";
    System.out.println("s=" + s); // s = hello worldssss

    // no ** //

    // >,<, >=, <=
    boolean r1 = 10>3; // true, asking if 10>3
    boolean r2 = 4>10; //false
    boolean r3 = 10 >=10; //true
    boolean r4 = -9<9; //true

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);

    // and (&&) , or (||)

    boolean r5 = 10>3 && 20>=20;
    //System.out.println("r5 "+r5);
    boolean r6 = 10>3 && 20<10;
    //System.out.println("r6 "+r6);

    boolean r7 = 10>3 || 20>=20; //true or true
    //System.out.println("r7 "+r7);
    boolean r8 = 10>3 || 20<18; // true or false
    //System.out.println("r8 "+r8);
    boolean r9 = 3<1 || 4<1; // false or false
    //System.out.println("r9 "+r9);

    char c10 = 'A';
    char c11 = 'B';
    boolean r10 = c10 == c11; //false; asking if value equal to another value, we use "=="
    boolean r11 = 'C' != '0'; //true, asking if value is not euqal to another value, we use "!="

    boolean r12 = 10/2 == 5*3; //false 
    //System.out.println("r12 "+r12);

    int n = 3;
    int result = n++ *3; // original n multiple first, assign 9 to the result, then n = n + 1;
    System.out.println(result); //
    System.out.println(n); //

    int m = 4;
    int result2 = ++m * 5; // m = m+1 first, then assign 25 to result 2
    System.out.println(result2); //
    System.out.println(m); //    

    int k=4;
    int result3= k++ * 7* ++k;
    System.out.println(result3); //168; (4*7) *6

  }
  
}
