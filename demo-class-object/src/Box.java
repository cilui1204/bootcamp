import java.util.Arrays;

public class Box {

  //static varaible (belongs to class)
  private static String prefix="apple";

  private String name;

  // instance varaible
  private String[] strings;

  public Box(){
    this.strings = new String[0];
  }

  public String[] getStrings(){
    return this.strings;
  }

  public String getName(){
    return this.name;
  }

  public void setString(int index, String s){
    this.strings[index]=s;
  }

  public void setName(String name){
    this.name= Box.prefix.concat("-").concat(name);
  }

  public void addString(String s){
    String[] arr = new String[this.strings.length+1];
    for (int i=0; i<this.strings.length; i++){
      arr[i]=this.strings[i];
    }
    arr[arr.length -1] = s;
    this.strings = arr;

  }


  public void deleteString(String s){
    //revise the arr length
    //remove corresponding Strings
  }


  public String toString(){
    return "Box(" //
    +"strings=" + Arrays.toString(this.strings) 
    + ")";
  }



  public static void main(String[] args){
    Box box = new Box();
    box.addString("hello");
    box.addString("hello");
    System.out.println(Arrays.toString(box.getStrings())); //[abc, def]
    System.out.println(box); //Box(strings=[abc, def])

    box.addString("xyz");
    System.out.println(box);

    System.out.println(box.prefix);

    Box box2= new Box();
    box2.setName("box2");

    System.out.println(box2.getName());


  }
  
}
