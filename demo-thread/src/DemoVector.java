import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  
  public static void main(String[] args){
    //ArrayList (non thread-sare, better performance) vs Vector (thread-safe, poor performance-> synchronized)
    List<String>  strings = new ArrayList<>(); // ArrayList implementation differs to Vector implementation

    Runnable addStringTaskToArrayList= ()->{
      for (int i=0;i<1_000_000;i++){
        strings.add("hello");
      }
      System.out.println("ArrayList.size() counter++=" + strings.size()); //1000000
    }; // run() method implementation

    long startTIme = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringTaskToArrayList);
    Thread thread2 = new Thread(addStringTaskToArrayList);
    thread1.start(); //call run()
    thread2.start(); //call run()

    try{
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayListRunTime=" + (afterTime-startTIme)); //ArrayListRunTime=61
      System.out.println("ArrayList.size()=" + strings.size());  //ArrayList.size()=1008519
    }catch (InterruptedException e){

    }

    System.out.println(strings.size()); // NOT OK, main porgram flow //ArrayList.size()=1008519
    System.out.println("Program ends...");


    // Solution for Multi-threading
    List<String>  strings2 = new Vector<>(); // ArrayList implementation differs to Vector implementation

    Runnable addStringTaskToVector= ()->{
      for (int i=0;i<1_000_000;i++){
        strings2.add("hello");
      }
      System.out.println("Vector.size() counter++=" + strings2.size()); //1000000
    };

    Thread thread3 = new Thread(addStringTaskToVector);
    Thread thread4 = new Thread(addStringTaskToVector);
    startTIme = System.currentTimeMillis();
    thread3.start(); //call run()
    thread4.start(); //call run()

    try{
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("VectorRunTime=" + (afterTime-startTIme)); //VectorRunTime=81
      System.out.println("Vector.size()=" + strings2.size()); //Vector.size()=2000000
    }catch (InterruptedException e){

    }


    //Steps to resize the ArrayList/Array
    //1. create a new array(lenght+1)
    //2. copy of the old array to new array
    //3. Add the new element at the array
    //4. reassign the new object refrf to the old obj ref



  }
}
