public class Car {
  private static int count = 0;
  private int id;
  private String color;


  //Constructor can access static variable
  public Car(String color){
    // count ++
    this.id= ++count;
    this.color =color;
  }

  public int getId(){
    return this.id;
  }


  public static void main(String[] args){
    Car car1 = new Car ("Red");
    Car car2 = new Car ("Yello");
    Car car3 = new Car ("Blue");
    System.out.println(car3.getId()); //3
  }

}
