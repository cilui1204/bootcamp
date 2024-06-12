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
    //1 3 5 7 9 12 14 16 18 20
    for (int i=1;i<21;i++){
      if ((i%2==1 && i<10)||(i%2==0 && i>10)){
        System.out.print(i+" ");
      }
    }
    System.out.println("");

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


    // *****
    // *****
    // *****
    // *****
    // *****


    //tips
    //1. new line
    //2. Nested Loop

    for (int row=0; row<5;row++){
      for (int column=0; column<5;column++){
        System.out.print("*");
      }
      System.out.println();
    }


    // *****
    // ****
    // ***
    // **
    // *

    for (int row=0; row<5; row++){
      for (int column=0;column <5-row;column++){
        System.out.print("*");
      }
      System.out.println();
    }


    // *
    // **
    // ***
    // ****
    // ***
    // **
    // *

    int max = 4;
    
    for (int i =0; i<6; i++){
      int j=0;
      while (j<i+1 && i<4){
        System.out.print("*");
        j+=1;
      }
      int k=6-i;
      int L = 0;
      while (L!=k && i>=4){
        System.out.print("*");
        L +=1;
      }
      System.out.println("");
    }
      
    

    


  






  }
}
