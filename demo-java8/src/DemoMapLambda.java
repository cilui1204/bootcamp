import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoMapLambda {

  public static void main(String[] args){
    // 1. Map -> Key Value
    Map<String, Customer> customerMap = new HashMap<>();
    customerMap.put("C1234",new Customer("John"));
    customerMap.put("C1235",new Customer("Sam"));

    if (customerMap.containsKey("C1235")){
    System.out.println(customerMap.get("C1235").getName());
    }

    Function<String, Customer> defaultCustomer = s -> new Customer("Dummy");
    customerMap.computeIfAbsent("C1236", defaultCustomer);


    for (Map.Entry<String,Customer> entry : customerMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // 2. merge -> BiFunction
    Map<String,Integer> map = new HashMap<>();
    map.put("Peter",10);
    map.put("Jenny",2);
    map.put("Vincent",8);
    map.put("John",12);

    // +2 
    map.put("Peter", map.get("Peter")+2);
    map.put("Jenny", map.get("Jenny")+2);
    map.put("Vincent", map.get("Vincent")+2);
    map.put("John", map.get("John")+2);
    System.out.println(map.get("Vincent"));

    BiFunction<Integer,Integer,Integer> addValue = (oldValue,newValue) -> oldValue+newValue;
    map.merge("Peter", 3, addValue);
    map.merge("Sue", 3, addValue);

    System.out.println(map.get("Peter")); // 15
    System.out.println(map.get("Sue")); // 3

  }
}
