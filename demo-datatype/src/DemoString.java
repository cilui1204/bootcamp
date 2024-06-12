public class DemoString {
  public static void main (String[] args) {
    // string store text
    // double quote to declare the String value
    String x = "hello";
    String y = "@%^&*";
    String withSpace = "hello   fef fe";
    System.out.println(y+x);
    System.out.println(withSpace);
    String dollar = "$10";

    //+
    String z= x + dollar;
    System.out.println(z);

    double price = 9.99;
    String item = "Book";
    String description = "The "+ item + " cost $" + price; // String + String + String = String
    System.out.println(description);

    //String Method (Tool) 1: length()
    String t = "hello";
    System.out.println("The length of t =" + t.length()); // t.length -> int

    // check if t length >=4, if yes, print hello, else goodbye
    if (t.length()>=4){
      System.out.println("hello");
    }else{
      System.out.println("goodbye");
    }

    // Method 2: equals()

    String s1="hello";
    String s2="hello";

    if (s1.equals(s2)){
      System.out.println("They are having same String value");
    }else{
      System.out.println("They are not with the same value");
    }

    if (!s1.equals(s2)){  //! mean "NOT"
      System.out.println("Thet are not with the same value");
    }else{
      System.out.println("They are having same String value");
    }


    if (s1==s2){
      System.out.println("Check if they are same object");
  
    }

    //check if s1 length >=6 or s1 equals s2, print..
    //or
    if (s1.length()>=6 || s1.equals(s2)){ // First correct, will not run second
      System.out.println("Satisfied the condition");
    }else{
      System.out.println("Not Satisfied the condition");
    }

    if (s1.length()>=6){
      System.out.println("hello world");
    }else if (s1.equals(s2)){
      System.out.println("hello");
    }
    
    // and 
    if (s1.length()>=6 && s1.equals(s2)){ // First correct, will not run second
      System.out.println("Satisfied the condition");
    }else{
      System.out.println("Not Satisfied the condition");
    }

    if (s1.length()>6){
      if (s1.equals(s2)){
        System.out.println("hello");
      }
    }

    //Method 3 : chatAt(int index), for example, charAt(0)
    String s3 = "world";
    //0 means the first character
    //1 means the second character
    //4 means the 5th character
    System.out.println("The 1st character of s3="+ s3.charAt(0)); //w
    System.out.println("The 5th character of s3="+ s3.charAt(4)); //d

    //System.out.println(s3.charAt(-1)); //java.lang.StringIndexOutOfBoundsException
    //System.out.println(s3.charAt(7)); //java.lang.StringIndexOutOfBoundsException

    System.out.println("The last character of s3=" + s3.charAt(s3.length()-1) );

    //check if the last character is d and >5, print yes
    String x2 = "hello world";
    if (x2.charAt(x2.length()-1)=='d' && x2.length()>5){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }


    //Method 4: substring(int beginIndex, int endIndex)
    String result = x2.substring(0,2);
    System.out.println(result);

    System.out.println(x2.substring(0,5)); //hello
    System.out.println(x2.substring(3,8)); //lo wo
    System.out.println(x2.substring(0,0)); //""
    System.out.println(x2.substring(0,1)); //"h"

    //check if the first three character is "wel", if yes, print yes
    String x3 = "welcome";
    //substring
    if (x3.substring(0,3).equals("wel")){
      System.out.println("Yes");
    }else{
      System.out.println(x3.substring(0,3));
    }

    //charAt()
    if (x3.charAt(0)=='w'&& x3.charAt(1)=='e'&& x3.charAt(2)=='l'){
      System.out.println("Yes");

    }

    // chain method
    System.out.println(x3.substring(0,3).length());
    System.out.println(x3.substring(0,3).charAt(0));


    // isEmpty();
    //Empty String value -> ""
    String x7 = "";
    System.out.println(x7.isEmpty()); //True
    String x8 = "abc";
    System.out.println(x8.isEmpty()); //false
    System.out.println(x8.length()==0); //false

    //isBlank
    String x9 = "";
    System.out.println(x9.isBlank()); //true

    x9 =" ";
    System.out.println(x9.isBlank()); //true 
    System.out.println(x9.isEmpty()); //false

    //substring(0,3)
    //substring(0)
    String s10 = "hello";
    System.out.println(s10.substring(0)); // hello. from index 0 to the end  
    System.out.println(s10.substring(0,3)); //hel, from index 0 to the index 2 (3-1)

    //hello -> HELLO
    System.out.println(s10.toUpperCase()); //"HELLO"

    String s11 = "Hello";
    System.out.println(s11.toLowerCase()); //"hello"

    System.out.println(s10.replace('l','x')); // hexxo
    System.out.println(s10.replace("ll","yyyy")); //heyyyyo
    System.out.println(s10.replace("lll","yyyy")); //hello

    System.out.println(s10.contains("ell")); //true

    //startsWith()
    System.out.println(s10.startsWith("he")); //true

    //endsWith()
    System.out.println(s10.endsWith("o")); //true

    //trim(), removing the space characters at the head/tail of the String
    String s12 = "   Hello ,  bootcamp    ";
    System.out.println(s12.trim()); //Hello ,  bootcamp

    String[] strings = new  String[]{"hello","abcijk","vincent","HeLLo...."," hellO"};

    //how many string contains "ELL", but ignore case
    int count = 0;
    for (int i=0; i< strings.length; i++){
      if (strings[i].toUpperCase().contains("ELL")){
        count +=1;
      }
    }
    System.out.println("Total String contains ELL= "+ count);

    
    // equalsIgnoreCase
    for (int i=0; i< strings.length; i++){
      if (strings[i].trim().equalsIgnoreCase("hello")){
        System.out.println(i);
      }
    }

    String s13 = "helloll";
    System.out.println(s13.indexOf("ll")); //2
    System.out.println(s13.indexOf('e')); //1
    System.out.println(s13.indexOf('l')); //2, first character of 'i'
    System.out.println(s13.indexOf("ll",4)); //5
    System.out.println(s13.indexOf("ll",6)); //-1
    System.out.println(s13.indexOf(101)); // 1, ascii 'e' -> 101

    System.out.println(s13.lastIndexOf("ll")); //5, the last occurence of the pattern

    String s14 = "abc";
    s14 += "def";
    System.out.println(s14); //abcdef
    String s15 =  "abc";
    s15= s15.concat("def"); //better performance
    System.out.println(s15); //abcdef

    String s16 = "abc";
    String s17 = "abc";

    System.out.println(s16.compareTo(s17)); //0, the value of s14 = the value of s15
    System.out.println(s16.equals(s17));   // true
    System.out.println(s16==s17); //true ??!! comparing the string object address

    
  

  }
}
