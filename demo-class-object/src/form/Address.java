package form;
public class Address {
  private String line1;
  private String line2;
  private String line3;

  //all argument constructor, getter
  public Address(String line1, String line2, String line3){
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public String getLine1(){
    return this.line1;
  }

  public String getLine2(){
    return this.line2;
  }

  public String getLine3(){
    return this.line3;
  }

  public void setLine2(String line2){
    this.line2=line2;
  }

  public String toString(){
    return "Address(" //
    +"line1" +this.line1 +","
    +"line2" + this.line2+","
    + "line3" +this.line3 ;
  }


  public static void main(String[] args){
    //create a Form Object, with Address object
    Address address = new Address("abc","ijk","def");
    Form f1 = new Form("Chi Ip", "Lui", address);
    System.out.println(f1); // println() call form.toString()
    //for,.class -> toString()
    // Form(firstName)

    System.out.println(f1.getAddress().getLine2());  //Man Ying Street

    //Form f2 = new Form ("Jenny","Wong",new Address("abc","ijk","def"));
    Form f2 = new Form ("Jenny","Wong",address);

    System.out.println(f2.getAddress().getLine2());

    f2.getAddress().setLine2("xyz");
    System.out.println(f1.getAddress().getLine2()); //xyz
    System.out.println(f2.getAddress().getLine2()); //xyz

    //why both form address and form2 address was changed to xyz;


  }



}
