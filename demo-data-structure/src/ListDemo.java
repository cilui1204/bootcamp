import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {
    public static void main(String[] args){
      List<String> strings = new ArrayList<>(); // ArrayList.class implements List.class
      strings.add("hello");
      strings.add("abc");
      strings.remove("abc");

      // ArrayList.class has all method defined in List.class
      // ArrayList MAY implement more than one interface
      // ArrayList MAY have its own methods, which did not define in interfaces


      // Polymorphism
      // 1. scope of strings(obj ref) - compile time
      // 2. method implementation - runtime


      // Collection.class
      Collection<String> strings2 = new ArrayList<>();
      strings2 = new HashSet<String>();
      System.out.println(strings2.size()); //0

      //Set.class
      Set<String> strings3 = new HashSet<>();
      //strings3 = new ArrayList<>(); // Not OKAY, ArrayList.class did not implement Set interface
      strings.add("hello"); // ignore duplicate

      // so, the implementation of ArrayList.add() differ to the implementation of HashSet.add()

      // Data Structure of Data Structure
    }
}
