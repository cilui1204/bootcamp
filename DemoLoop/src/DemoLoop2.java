public class DemoLoop2 {
  public static void main(String[] args){
    //infinite loop -> control c to stop
    //for (int i=0; ;i++){ // No "continue" condition -> No "Exit" condition
    //  System.out.println("Hello World");

    //for (;;){
   //   System.out.println("hello");
  //  }

      // Label: outerloop -> labeled start point for "continue"
      outerLoop: for (int i=1; i<=3; i++){
        for (int j=1;j<=3;j++){
          if (i==2 &&j==2){
            continue outerLoop; // Skip to the next iteration of the outer loop //Skip i 2, j 3
          }
          System.out.println("i: "+i+", j:" +j);
        }
      }




    }
  
}
