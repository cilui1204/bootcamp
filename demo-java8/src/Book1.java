public class Book1 {
  private double price;
  private String author;

  public Book1(double price, String author){
    this.price = price;
    this.author = author;
  }

  // Type of instance method:
  // getter, setter..
  // presentation -> definiton 

  public boolean isTooExpensive(){
    return this.price > 100;
  }

  // transform (substring, replace,)

    public static void main(String[] args){
      Book book = new Book(99.9,"John");
      System.out.println(book.price());//99.9
      System.out.println(book.author());//99.9


      Book book2 = new Book(99.9,"John");
      Book book3 = new Book(10,"Amy");


      // equals()
      System.out.println(book.equals(book2)); //true
      System.out.println(book.equals(book3)); //false


      // hashCode()
      System.out.println(book.hashCode()); //1586360712
      System.out.println(book2.hashCode()); //1586360712
      System.out.println(book.hashCode()==book2.hashCode()); //true

      // toString()
      System.out.println(book.toString()); //Book[price=99.9, author=John]
      System.out.println(book2.toString()); //Book2[price=99.9, author=John]
      System.out.println(book3.toString()); //Book[price=10.0, author=Amy]


      


    }



  
}
