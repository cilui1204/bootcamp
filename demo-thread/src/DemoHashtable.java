import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
  private static int counter = 0;

  public static void main(String[] args) {
    // Hashtable vs HashMap
    Hashtable<String, String> table = new Hashtable<>();

    // put -> 1_000_000
    // 2 threads
    Runnable task = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        table.put(String.valueOf(i), String.valueOf(i));
        counter++;
      }
    };

    Runnable task2 = () -> {
      for (int i = 1_000_000; i < 2_000_000; i++) {
        table.put(String.valueOf(i), String.valueOf(i));
      }
    };



    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task2);

    long startTime = System.currentTimeMillis();
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
      long endTime = System.currentTimeMillis(); //2000000
      System.out.println("RunTime=" + (endTime - startTime)); //RunTime=1125
    } catch (InterruptedException e) {

    }
    System.out.println(table.size());
    System.out.println("Program ends...");






    // Map<String, String> map= new HashMap<>();

    // // put -> 1_000_000
    // // 2 threads
    // Runnable putEntryToMap1 = () -> {
    //   for (int i = 0; i < 1_000_000; i++) {
    //     map.put(String.valueOf(i), String.valueOf(i));
    //   }
    // };
    
    // Runnable putEntryToMap2 = () -> {
    //   for (int i = 1_000_000; i < 2_000_000; i++) {
    //     map.put(String.valueOf(i), String.valueOf(i));
    //   }
    // };



    // Thread thread3 = new Thread(putEntryToMap1);
    // Thread thread4 = new Thread(putEntryToMap2);

    // startTime = System.currentTimeMillis();
    // thread3.start();
    // thread4.start();

    // try {
    //   thread3.join();
    //   thread4.join();
    //   long endTime = System.currentTimeMillis(); 
    //   System.out.println("RunTime=" + (endTime - startTime)); //RunTime=1659
    // } catch (InterruptedException e) {

    // }
    // System.out.println(map.size()); //1978064
    // System.out.println("Program ends...");

    // null key
    HashMap<Integer,String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(3,null);
    System.out.println(map2.size()); //2

    Hashtable<Integer,String> table2 = new Hashtable<>();
    //table2.put(null, "abc"); // Hashtable -> key cannot be null, otherwise java.lang.NullPointerException
    //table2.put(3,null); //java.lang.NullPointerException
    table2.put(1,"abc");
    table2.put(1,"def");
    System.out.println(table2.size()); //1



  }

}
