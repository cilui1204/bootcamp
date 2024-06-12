import java.time.LocalDate;

public class Book {
  private String name;
  private int page;
  private String arthor;
  private LocalDate publishDate;

  // instance method (object method)
  public void setName(String name){
    this.name=name;
  }

  //instance method
  public void setPage(int page){
    this.page=page;
  }

  public void setArthor(String arthor){
    this.arthor=arthor;
  }

  public void setPublishDate(LocalDate publishDate){
    this.publishDate=publishDate;
  }

  public String getName(){
    return this.name;
  }

  public int getPage(){
    return this.page;
  }

  public String getArthor(){
    return this.arthor;
  }

  public LocalDate getPublishDate(){
    return this.publishDate;
  }

  // static method
  public static String hello(){
    return "hello";
  }


  //Static method
  public static void main(String[] args){

    //instance method belongs to object
    Book b1 = new Book();
    b1.setName("Daily law");
    System.out.println(b1.getName());

    b1.setPublishDate(LocalDate.of(1996,12,04));
    System.out.println(b1.getPublishDate());

    //static method belongs to Class
    Book.hello();
    //System.out.println("hello");// Class=System

    System.out.println(Cat.hello());// Class=System
  }
}
