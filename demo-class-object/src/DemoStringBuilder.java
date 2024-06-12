public class DemoStringBuilder {
  public static void main(String[] args){
    String x = "hello"; //slow performance. i.e. concat, replace,

    // "new StringBuilder()" -> constructor
    StringBuilder sb = new StringBuilder("hello"); //fast performance
    Cat cat = new Cat();
    cat.setAge(13); //void method

    x += "world" ;
    sb.append("world");

    System.out.println(sb.toString()); //helloworld
    sb.replace(1,2,"xx");
    System.out.println(sb.toString()); //hxxloworld

    sb.setCharAt(4,'A');
    System.out.println(sb.toString()); //hxxlAoworld

    sb.reverse();
    System.out.println(sb.toString()); //dlrowoAlxxh

    sb.insert(4,'*');
    System.out.println(sb.toString()); //dlro*woAlxxh

    String s = sb.substring(1,3);
    System.out.println(s); //lr
    System.out.println(sb.toString());//dlro*woAlxxh


  }
  
}
