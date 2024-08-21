package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
  
  public static void main(String[] args){
    //Array vs ArrayList -> 
    // 1. Underlying strucutre of ArrayList is array
    // 2. array -> fix length -> a range of continous memory location 
    Cat cat = new Cat(Color.BLUE);

    //Heap 
    //Step1: Cat Object
    //Step2: Eye Array Object
    //Step3: Two Eye Objects
    //Step4: 3 color Objects (created when you execute the main method)

    cat.getEyes();// get Array Object 
    cat.getLeftEye(); // Cat Object -> Eye Array Object -> Eye Object
    cat.getRightEyes();

    Eye[] eyes = cat.getEyes(); // backup the array object memory location
    Eye rightEye = eyes[1];

    // What is the relationship between the memory location of cat, eye and rightEye?
    // 1. leftEye vs rightEye 
    // 2. Cat object vs Eye[] object
    // 3. Cat object vs eye object
    
    //String[] strings = new String[5];
    
    LinkedList<String> strings = new LinkedList<>();
    strings.add("A");
    strings.add("B");
    strings.add("C");
    strings.add("D");
    strings.remove("B");
    strings.remove(0);


    for (String s: strings){
      System.out.println(s);
    }

    System.out.println(strings.isEmpty()); //false

    // LinkedList vs ArrayList
    // 1. Underlying DS
    // 2. Methods Difference (i.e. LinkedList -> addFirst(), removeFirst())

    LinkedList<String> ll = new LinkedList<>();
    ll.add("hello");
    ll.addFirst("abc");
    ll.addFirst("def");

    for (String s:ll){
      System.out.println(s);
    }

    ll.removeFirst();

    for (String s:ll){
      System.out.println(s);
    }  

    System.out.println(ll.indexOf("abc")); //0

    ll.add("hello");
    System.out.println(ll.lastIndexOf("hello")); //2


    // Queue.class

    Queue<String> emails = new LinkedList<>();
    emails.add("john@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails.size()); // Collection framework

    String head = emails.poll(); // remove and return the first element in queue
    System.out.println(head); 
    emails.add("sally@gmail.com");
    emails.add("dicky@gmail.com");

    String lookup = emails.peek(); // return the first element in queue
    System.out.println(lookup); //peter@gmail.com


    // remove()
    emails.remove(new String("dicky@gmail.com"));

    //remove()
    emails.remove(); // same as poll()

    // LinkedList.class remove(Object) -> LinkedList For loop



    // for each
    for (String s: emails){
      System.out.println(s);
    }

    // while(!emails.isEmpty()){// isEmpty()
    //   System.out.println(emails.poll());
    // } 

    // Convert Queue<String> to List<String>
    List<String> strings2 = new ArrayList<>();
    while (! emails.isEmpty()){
      strings2.add(emails.poll());
    }
    System.out.println(strings2);
    System.out.println(emails); // after while loop, all elements are removed.


    // clear()
    //strings2 = null;
    strings2.clear(); // Clear all the objects inside the ArrayList object
    strings2.add("abc");
    strings2 = null; // remove the ArrayList object
    //strings2.add("def");   // NPE (null point exception) 

  }
}
