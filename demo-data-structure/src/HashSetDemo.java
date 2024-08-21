import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

  public static void main(String[] args){
    HashSet<String> strings= new HashSet<>();
    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    System.out.println(strings); 
    //[abc, def, hello], ordering is not determined by insertion order.

    ArrayList<String> strings2= new ArrayList<>();
    strings2.add("hello");
    strings2.add("abc");
    strings2.add("def");
    System.out.println(strings2); 
    //[hello, abc, def], ordering follows the insertion order.

    // add duplicated string value
    boolean hsResult = strings.add("hello"); //HashSet - not adding duplicated value
    boolean alResult = strings2.add("hello"); 
    System.out.println(hsResult); //false
    System.out.println(alResult); //true
    System.out.println(strings);  //[abc, def, hello]
    System.out.println(strings2); //[hello, abc, def, hello]

    System.out.println(strings.size()); //3
    System.out.println(strings.remove("abc")); //[def, hello]
    System.out.println(strings.contains("def")); //true
    
    //isEmpty()
    //addAll()

    // Question: Remove duplicated value
    String[] arr = new String[]{"abc","def","xyz", "def"};
    HashSet<String> result = new HashSet<>();

    //Loop
    for (String s:arr){
      result.add(s);
    }
    System.out.println(result); //["abc","def","xyz"]

    //Question2: Find all duplicated values
    HashSet<String> result2 = new HashSet<>();
    ArrayList<String> al = new ArrayList<>();
    
    //Loop
    for (String s: arr){
      if (!result2.add(s)){
        al.add(s);
      }
    }
    System.out.println(al); //["def"]







  }
  
}
