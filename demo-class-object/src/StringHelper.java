public class StringHelper {
  private String str; //attribute

  public StringHelper(String str){
    this.str = str;
  }

  //instance method
  public StringHelper setCharAt(int index, char ch){
    String s = "";
    for (int i =0; i<this.str.length();i++){
      if (i==index){
        s+=ch;
      }else{
        s+=this.str.charAt(i);
      }
    }
    this.str = s;
    return this;
  }

  public String toString(){
    return this.str;
  }

  public StringHelper append(String s){
    this.str += s;
    return this;
  }

  public int length(){
    return this.str.length();
  }

  public String substring(int startIdx, int endIdx){
    String s = new String("") ;

    for (int i=startIdx; i<endIdx;i++){
      s += this.str.charAt(i);
    }
    return s;
  }



  public static void main(String[] args){
    StringHelper sh = new StringHelper("Hello");
    sh.setCharAt(3,'a');
    System.out.println(sh.toString());

    sh.append("world");
    System.out.println(sh.toString());

    // Chain method Call
    sh.append("!!!!").append("WWWW").setCharAt(10, 'Q').append("test");
    System.out.println(sh.toString());

    "hello".charAt(1); //nothing

    
    System.out.println(sh.substring(0, 2));



  }
  
}
