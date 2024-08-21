import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
  public static void main(String[] args){
    // Key & value pair
    HashMap<Integer, String> nameMap = new HashMap<>(); //key-> Integer, value -> String
    nameMap.put(100,"Vincent");
    // nameMap.put("Vincent",100); // NOT OK, violate the hashmap definition


    //We can get value by key
    System.out.println(nameMap.get(100));//"Vincent"

    // You cannot get key by value;
    System.out.println(nameMap.get("Vincent")); //null

    // No ordering
    nameMap.put(1010, "Cindy");
    nameMap.put(-45,"Sally");
    System.out.println(nameMap.get(-45)); //Sally

    // Key + Value -> Entry
    // A Map consists of many entries

    // For Loop -> HashMap.class
    //Loop for entries
    for (Map.Entry<Integer, String> entry :nameMap.entrySet()){
      System.out.println("Key=" +entry.getKey()//
      + ", value=" +entry.getValue());
    }

  
    // Handle duplicated key -> overwirte the value if key exists.
    nameMap.put(1010,"Peter");
    System.out.println(nameMap);

    //null key
    nameMap.put(null,"Oscar"); //OK
    System.out.println(nameMap);

    //null value
    nameMap.put(-45,null); //OK
    System.out.println(nameMap);

    //
    String oldValue = nameMap.remove(1010); // remove entry by key
    System.out.println(nameMap);
    System.out.println(oldValue); //Peter


    System.out.println(nameMap.containsKey(1010)); //false
    
    //Loop keyset()
    for (Integer x : nameMap.keySet()){
      System.out.println(x);
    }

    //Loop values
    for (String s:nameMap.values()){
      System.out.println(s);
    }
    

    System.out.println(nameMap.size());

    System.out.println(nameMap.containsValue("Oscar"));
    System.out.println(nameMap.containsValue("Peter"));
    System.out.println(nameMap.get(-45)); //null




  }
  
}
