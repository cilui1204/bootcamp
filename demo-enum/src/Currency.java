public enum Currency {
  HKD("Hong Kong Dollars.", 1), // Similar to new Currency("Hong Kong Dollar")
  USD("US Dollar", 2), //
  JPY("Yen", 3),//
  ;


  // instance variable
  private final String description;
  private final int DBvalue;

  // Constructor
  private Currency(String description, int DBvalue) {
    this.description = description;
    this.DBvalue = DBvalue;
  }

  // instance methods
  public String getDescription() {
    return this.description;
  }

  public int getDBvalue() {
    return this.DBvalue;
  }

  @Override
  public String toString() {
    return "Currency (" //
        + "Description: " + this.description//
        + ". DBvalue: " + this.DBvalue + ") ";//
  }


  // 2 -> USD. 3->JPY
  public static Currency get(int DBvalue) {
    for (Currency curr : Currency.values()) {
      if (DBvalue == curr.getDBvalue()) {
        return curr;
      }
    }
    return null; // throw exception (we teach later)
  }

  public static int get(Currency currency) {
    return currency.getDBvalue();
  }

  public static String fullDescription(Currency currency){
  //   if (currency== Currency.HKD){
  //     return "It is Hong Kong Dollar";
  //   }else if (currency==Currency.USD){
  //     return "Hello World";
  //   }else if (currency==Currency.JPY){
  //     return String.valueOf(currency.getDBvalue());
  //   }return null;


    //alternaltive switc (before java 14) +case (perfect match)
    switch (currency){
      case HKD:
        return "It is Hong Kong Dollar";
      case USD:
        return "Hello World";
      case JPY:
        return String.valueOf(currency.getDBvalue());
      default:
        return null;
     }

    }



  public static void main(String[] args) {
    // Currency currency = "HKD"
    // Currency currency = Weekday.MONDAY;
    Currency currency = Currency.HKD;
    if (currency == Currency.USD) {
      System.out.println("It is " + currency.getDescription());
    } else if (currency == Currency.HKD) {
      System.out.println("It is " + currency.getDescription());
    } else if (currency == Currency.JPY) {
      System.out.println("It is " + currency.getDescription());
    }

    System.out.println(currency); // "HKD"

    // ENUM already override OBject.toString()
    System.out.println(currency.toString()); // (Currency Description Hong Kong Dollars. DBvalue1)

    // default instance methods provided by ENUM.class
    System.out.println(currency.name()); // "HKD"

    // 2. values()
    System.out.println(Currency.values()); // [LCurrency;@6b95977
    System.out.println(Currency.values().length); // 3

    for (Currency c : Currency.values()) {
      System.out.println(c.getDescription());
    }

    System.out.println(Currency.HKD.hashCode()); // 366712642
    System.out.println(Currency.USD.hashCode()); // 1829164700


    System.out.println(Currency.USD.equals(currency)); // false
    System.out.println(Currency.HKD.equals(currency)); // true

    // !!??
    System.out.println(currency.equals(Currency.HKD)); // NOT GOOD CODING SYTLE
    System.out.println(currency != null && currency.equals(Currency.HKD)); // BETTER 睇前面先，如果前面FALSE就唔會睇後面

    String x = "abc";


    // Not OK
    if (x.equals("abc")) { // potentially null pointer exception
    }

    // OK
    if ("abc".equals(x)) {
    }

    System.out.println(Currency.get(2)); // toString() Currency (Description: US Dollar DBvalue: 2)


    // 3. valueOf -> static method
    System.out.println(Currency.valueOf("HKD").name()); // HKD, "HKD" -> Currency enum -> name() -> "HKD"
    System.out.println(Currency.valueOf("123").name()); // java.lang.IllegalArgumentException

    System.out.println(Currency.fullDescription(Currency.USD));


  }
}
