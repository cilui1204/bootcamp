public class Ball {
  private double weight;
  private String color; //char[]
  private int number;

  // constructor - empty constructor, all args constructor
  // by default
  // public Ball(){
  //   this.color="RED";
  // }

  public Ball(){
    this.color="RED";
  }

  public Ball(double weight, String color){
    this.weight=weight;
    this.color=color;
  }

  public Ball(double weight, String color, int number){
    // this.weight=weight;
    // this.color=color;
    this(weight,color); //call self constructor
    this.number = number;
  }



  //dummy -test constructor
  public Ball(String color, double weight){
    this.weight=weight;
    this.color=color;
  }

  //dummy -test constructor
  public Ball(String color, String color2){
    this.color=color;
  }

  // getter, setter
  public void setWeight(double weight){
    this.weight=weight;
  }
  public void setColor(String color){
    this.color=color;
  }

  public double getWeight(){
    return this.weight;
  }

  public String getColor(){
    return this.color;
  }  

  //toString @Override
  public String toString(){
    return "Ball(" + //
    "weight=" + this.weight
    + "color=" + this.color;
  }

  public static void main(String[] args){
    Ball b1 = new Ball();
    Ball b2 = new Ball(10,"Black");

    System.out.println(b1.getColor());
    System.out.println(b2.getColor());
    System.out.println(b1.toString());
    b2.setColor("Yello");

    // After replacing the toString() method,
    System.out.println(b2.toString()); //Ball@6b95977 (Object Reference) ->Ball(weight=10.0color=Yello



  }


  // to String 
}
