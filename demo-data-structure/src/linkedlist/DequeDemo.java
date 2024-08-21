package linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {

  public static void main(String[] args){
    Deque<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    strings.addFirst("hello");
    strings.addLast("world");
    System.out.println(strings); //[hello, abc, def, world]

    System.out.println(strings.peek()); // same as peekFirst() -> hello
    System.out.println(strings.peekFirst()); //  hello
    System.out.println(strings.peekLast()); //  world

    strings.remove();
    System.out.println(strings); //[abc, def, world]
    strings.removeFirst();
    System.out.println(strings); //[def, world]
    strings.removeLast();
    System.out.println(strings); //[def]

    // Deque interface extends Queue Interface
    // so it supports add(), remove(), size(), etc

    //ArrayDeque.class
    Deque<String> string3 = new ArrayDeque<>(); // inderlying DS-> array -> fixed length
    string3.add("abc"); // create new array object and then put string object into the array
    string3.add("def");
    string3.addFirst("xyz");
    string3.addLast("xyz");
    string3.removeFirst();
    string3.removeLast();
    System.out.println(string3);

    Queue<String> strings4 = new ArrayDeque<>(); // Coding Presentation
    strings4.add("apple");
    strings4.add("banana");
    strings4.remove();
    System.out.println(strings4);

    Collection<String> strings5 = new ArrayDeque<>();
    List<String> strings6 = new ArrayList<>();
    strings6.add("abc");
    strings6.add("def");
    strings6.add(1, "apple");
    System.out.println(strings6); //[abc, apple, def]

    // Insertion - ArrayList or LinkedList faster?
    // best/worse case -> LinkedList




  }
  
}
