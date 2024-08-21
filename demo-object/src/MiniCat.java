import java.util.Objects;

public class MiniCat {


  private String name; //unique
  private String color;

  public MiniCat(String name, String color){
    this.name =name;
    this.color= color;
  }

  ///hashCode is an int value to represent if the two cats are the same cat
  @Override
  public int hashCode(){
    return Objects.hash(this.name,this.color);
  }

}
