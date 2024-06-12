import java.util.Arrays;

public class Bag {
  private int[] integers;
  private String color;
  private String size;

  //constuctor
  // getter, setter
  //toString()

  public Bag(){

  }

  public Bag(int[] integers){
    this.integers = integers;
  }

  public void setIntegers(int[] integers){
    this.integers=integers;
  }

  public int[] getIntegers(){
    return this.integers;
  }

  public String toString(){
    return "Bag(" //
    + "integers=" + Arrays.toString(this.integers)//
    + ")";
  }

  public static void main(String[] args){
    Bag b1 = new Bag();
    int[] array1 = new int[]{1,2,3};
    System.out.println(b1.toString());
    System.out.println(new Bag(new int[]{100,-2,6}).toString()); //Bag(integers=[100, -2, 6])

    Bag b2 = new Bag(array1);
  }



}
