public record Book(double price, String author) {

  // with:
  // 1. getter -> price(), author()
  // 2. One default constructor only - all-args constructor
  // 3. attributes are private final
  // 4. Already equals(), hashCode(), toString()
  // 5. class is final (cannot be extended)
  // 6. support custom instane method
  // 7. support static method
  // 8. support static, static final, final
  // 9. Do not support final custom instane variable (price, author)
  // 10. Do not support custom constructor

  // constant
  public static final double MIN_PRICE= 10.0;

  // public Book(String author){
  //   this.author=author;
  // }


  public static double calculateFinalPrice(double price, double discount){
    return price*(1-0.2);

  }

  public boolean isTooExpensive(){
    return this.price>100;
  }

  // all attribute are final
  public void setPrice(double price){
    this.price=price;
  }

}


