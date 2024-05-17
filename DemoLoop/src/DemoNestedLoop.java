public class DemoNestedLoop {
  public static void main (String[] args){




    for (int i=0 ; i<4 ; i++){ //0,1,2,3
      for (int j=0; j<2; j++) { //0,1
       // System.out.println("i="+i+", j="+j);
      }
    }
    //i=0, j=0
    //i=0, j=1
    //i=1, j=0
    //i=1, j=1
    //i=2, j=0
    //i=2, j=1
    //i=3, j=0
    //i=3, j=1

    //
    // i=1,j=0
    // i=3,j=0
    //Approach 1
    for (int i=0;i<4;i++){
      for (int j=0;j<2;j++){
        if (i%2==1 && j%2==0){
          System.out.println("i="+i +" ,j="+j);
        }
      }
    }


    // i=1,j=0
    // i=3,j=0
    //Approach 2
    for (int i=0;i<4;i++){
      if (i%2==0){
        continue;
      }
      for (int j=0;j<2;j++){
        if (j%2==1){
          continue;
        }
        System.out.println("i2="+i +" ,j2="+j);
      }
    }    


    //Exercise
    // 1-20
    //1 3 5 7 9 12 13 16 18 20

    //Searching
    String s = "Vincent Book Game Laptop";
    //Find the first index of character 'a'
    //charAt
    int ind;
    for (int i = 0; i<s.length(); i++){
      if (s.charAt(i)=='a'){
        ind = i;
        System.out.println("The first index of a is "+ ind);
        break;
      }
    }


  






  }
}
