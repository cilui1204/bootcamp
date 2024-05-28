public class DemoMethod {
  public static void main(String[] args){

      //Method you put something into the box, and then it return s something to you
      // Calling Method
      System.out.println("hello");

      // Call method (sum)
      int result = sum(10,3);
      System.out.println("result=" + result); // 13

      System.out.println(lastChar("hello"));

      System.out.println(toString(new char[]{'a','b','c'}) ); // abc
      //System.out.println(String.valueOf(new char[]{'a','b','c'}) ); // abc

      System.out.println(max(new int[]{1,2,3,100,3}) ); // 3

      System.out.println(isElderly(40));

      System.out.println(isSubstring("Hello World", "Wo"));

      System.out.println(circleArea(3));

      //double * double (problem)
      // BigDecimal (Solution)
      System.out.println(0.2*0.1); //0.020000000000000004


      

  }


  public static int sum(int x, int y){  //int = return type
    //if your method is with return type
    //the method content should contain a key word "return"
    return x+y;  // int + int -> int 
  }

  public static char lastChar(String s){
    return s.charAt(s.length()-1);
  }

  public static String toString(char[] arr){
    // Approach 1
    //String str="";
    //for (int i=0; i<arr.length; i++){
    //  str += arr[i];
    //}
    //return str;

    // Approach 2
    return String.valueOf(arr);
  }

  public static int max(int[] arr){
    int max = Integer.MIN_VALUE;
    for (int i=0;i<arr.length; i++){
      if (max<arr[i]){
        max=arr[i];
      }
    }
    return max;
  }

  public static boolean isElderly(int age){
    // >65
    //Approach 1
    //if (age>65){
    //  return true;
    //} else{
    //  return false;
    //}


    //Approach 2
    return age>65;
  }


  public static boolean isSubstring(String str, String substr){

    //check of substr is a substring of str

    //Apprach 1:
    return str.contains(substr);
  }
    //Approach 2:
    // indexOf() method return an int index, which is index position substring
    // if it returns -1, means not exist.
    //return str.indexOf(substr) != -1;

    //"hello"   "lll"

    //Approch 3:
    // boolean isSubstring = false;
    //for (int i=0;i<str.length() -substr.length() +1 ;i++){
    //  for (int j =0; j<substr.length();j++){
    //    if ((str.charAt(i+j)) != substr.charAt(j)) {
    //      break;
    //    }

    //    if (j==substr.length()-1){
    //      return true;
    //    }

    //    }
    //  }
    //}

    //Java -> PI
  public static double circleArea(int radius){

      return (Math.PI*Math.pow(radius,2)); // int * int * double -> double (2*2*2.0 -> 8.0)

  }
}
  

