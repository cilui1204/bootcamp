public class CurrencyHolder {
  private final String currency;
  private final int DBvalue;

  public CurrencyHolder(String currency, int DBvalue){
    this.currency=currency;
    this.DBvalue=DBvalue;
  }

  public String getCurrency(){
    return this.currency;
  }
  

  public boolean isHKD(){
    return "HKD".equals(this.currency);
  }



  // Solution
  public static boolean isHKD(CurrencyHolder holder){
    return "HKD".equals(holder.getCurrency());
  }

  // Solution: user enum as parameters (type-safe: compiler time ensure/check the scope of values)
  public static boolean isHKD2(Currency currency){
    return "HKD".equals(currency.name());
  }





  public static void main(String[] args){
    // 1. cannot guranatee there is ONLY one HKD in memory
    CurrencyHolder ch1 = new CurrencyHolder("HKD", 1);
    CurrencyHolder ch2 = new CurrencyHolder("HKD", 1);

    // 2. String is not a good idea to represent a parameter that with finite number of object
    System.out.println(ch1.isHKD()); //true, it is ok

    //but...
    System.out.println(CurrencyHolder.isHKD(new CurrencyHolder("HKD", 1))); //true
    System.out.println(CurrencyHolder.isHKD(new CurrencyHolder("HKDs", 1))); //false
    System.out.println(CurrencyHolder.isHKD(new CurrencyHolder("HDK", 1))); //false
    System.out.println(CurrencyHolder.isHKD(new CurrencyHolder("hkd", 1))); //false, ascii

    //solution: enum
    //enum.class defined a finite number of values, so that compiler can validate the paramters
    System.out.println(isHKD2(Currency.USD)); //false


    //valueOf(), String->enum





  }

  
}
