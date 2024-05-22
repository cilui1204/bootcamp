import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        
        // When you create an array object, you have to define the length of it.
        int[] arr = new int[3]; //length ->3; store int value only.
        //arr[index]
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = -3;
        //Compile-tile Exception
        //arr[0] = "hello world"; //Java Compiler knows that "arr" is an int array, which stores int value
        arr[0] = 100;

        System.out.println(arr[0]); // 100

        //Run-time Exception
        //arr[3] = 50; //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        int[] arr2 = new int[]{10,20,-3};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        //String array -> "hello", "abc", "ijk"
        String[] strings = new String[]{"hello","abc","ijk"};
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);      

        byte[] bytes = new byte[]{2,3,4};
        long[] longs= new long[]{2,3,4};
        double[]  d1= new double[]{2.0, 3.3, 4};

        //Arrays
        System.out.println(Arrays.toString(strings)); //[hello,abc.ijk]

        //9,-3,100,90,66,-4
        //for loop print out all
        int[] arr3= new int[]{9,-3,-100,90,66,-4};
        for (int i=0; i<arr3.length;i++ ){
            System.out.print(arr3[i]+" ");
        }
        System.out.println(" ");
        //loop
        //{9,-3,-100,90,66,-4}
        //find the max value from arr3
        int max= Integer.MIN_VALUE; // the min.value of int
        for (int i=0; i<arr3.length;i++){
            if (arr3[i]>max){
                max=arr3[i];
            }    
        }
            
        System.out.println(max);

        //Find the min.value from arr3 
        int min= Integer.MAX_VALUE;
        for (int i=0; i<arr3.length; i++){
            if(arr3[i]<min){
                min=arr3[i];
             }
        }
        System.out.println(min);


        //
        char[] arr4 = new char[]{'l','e','e','r','q'};

        //1. count the number of 'e'
        int count = 0;
        for (int i=0; i<arr4.length; i++){
            if (arr4[i]=='e'){
                count +=1;
            }
        }
        System.out.println("Count number of e= "+count);

        //2. boolean result to store if 'r' exist
        boolean r= false;
        for (int i=0; i<arr4.length; i++){
            if (arr4[i]=='r'){
                r=true;
                break;
            }
        }       
        System.out.println("'r' exist is "+r);


        //3. String result to store 'qreel'
        String str = "";
        for (int i=arr4.length-1; i>=0; i--){
            str += arr4[i];
            }
         System.out.println(str);  

         //4. Given TWO char array, result -> append all characters to a String value
         char[] c1 = new char[]{'o','a','k','p'};
         char[] c2 = new char[]{'a','b','f','t'};

         //4a. result ->"oakpabft"
         String concat1="";
         String concat2="";
         String concat3="";

         for (int i=0; i<c1.length;i++){
            concat1 += c1[i];
         }
         for (int i=0; i<c2.length;i++){
            concat2 += c2[i];
         }
         concat3 = concat1 + concat2;
         System.out.println(concat3); 

         //4b. result -> obkt when even index, get value from c1, 
         //when odd index, get the value from c2

         //obkta
         String concat5="";
         char[] c3 = new char[]{'o','a','k','p','a','b'};
         char[] c4 = new char[]{'a','b','f','t'};

         int length_2= c3.length>c4.length ? c3.length:c4.length;

         for (int i=0; i<length_2; i++){
            if (i%2==0 && i<c3.length){
                concat5+=c3[i];
            }else if (i%2==1 && i<c4.length){
                concat5+=c4[i];
            }
         }
         System.out.println("Result concat5= "+ concat5);








         String concat4="";
         int length= c1.length > c2.length? c1.length :c2.length;


         
         //if (c1.length>c2.length){
         //   length=c1.length;
         //}else{
        //  length=c2.length;
        // }

         for (int i=0; i<length; i++){
            if (i%2==0){
                concat4 += c1[i];
            }else{
                concat4 += c2[i];
            }
         }
         System.out.println("Result= "+concat4);







        }       
}
