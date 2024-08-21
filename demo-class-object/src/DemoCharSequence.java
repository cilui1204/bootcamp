public class DemoCharSequence {

  public static void main(String[] args){
    String s ="abc";
    System.out.println(s.replace("c", "a"));
    String s3 = s; //type-sage

    CharSequence cs ="abc";
    System.out.println(cs.length()); //3 (Polymorphism)

    // compile-time determine the scope of the object can be accessed by "cs"
    System.out.println(cs.charAt(1)) ; //b
    // cs.repalce();  // error, replace() is not included in CharSequence Interface
    // Some of methods in String object is hidden by "cs".


    //String s2 =  cs; // compiler concerns the type of "cs" ONLY
    //compile time cannot realize the actual object referece by "cs"
    //
    
    // both Parent Class and Interface relationship can apply downcasting
    String s2 = (String) cs;
    //during compile time, we dont guarantee if the casting will be success;


    // As java developer, you may use "instanceof" to ensure the type safety 
    if (cs instanceof String){
      s2 = (String) cs;
    }

    System.out.println(s2.replace("b", "a")); //aac

    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.length()); //5
    System.out.println(sb.charAt(1));//e
    System.out.println(sb.reverse());//olleh

    CharSequence cs3 = new StringBuilder("hello"); //Left hand side smaller than right hand side
    System.out.println(cs3.length()); //5
    System.out.println(cs3.charAt(1));//e
    //System.out.println(cs3.reverse());

    //StringBuilder sb2 = cs; // type safety
    StringBuilder sb2 = (StringBuilder) cs; // type safety  run-time error, cs refer to String object
    // while object refrence sb2 is StringBuilder


  }
  
}
