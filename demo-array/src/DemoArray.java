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


         //average
         int sum = 0;
         int count2 = 0;
         int[] arr5 = new int[]{4,8,3};
         for (int i=0;i<arr5.length;i++){
            sum+=arr[i];
            count2++;
         }
         double average = sum/count2;
         System.out.println(average);

         //Swapping in array
         int[] arr6 = new int[]{6,10,-4,15};
         //Swap -4 & 6 -> [-4,10,6,15]
         int temp;
         temp=arr6[0];
         arr6[0]=-4;
         arr6[2]=temp;
         System.out.println(Arrays.toString(arr6));


         //Level 1 
         //arr6 -> [-4, 6, 10, 15]
         // move -4 to the tail of the array
         // result [6,10,15,-4]
         for (int i=0; i<arr6.length-1;i++){
            int temp3 =arr6[i];
            arr6[i]=arr6[i+1];
            arr6[i+1]=temp3;

         }
         System.out.println(Arrays.toString(arr6));


         //Level 2
         //Move the max element to the tail
         //Now: [10,6,15,-4]
         //1st round: [6,10,15,-4]
         //2rd round: [6,10,15,-4]
         //3rd round: [6,10,-4,15]

         
         int temp4;
         for (int i=0; i<arr6.length-1;i++){
            if (arr6[i]>arr6[i+1]){
                temp4=arr6[i+1];
                arr6[i+1]=arr6[i];
                arr6[i]=temp4;
            }
         }
         System.out.println(Arrays.toString(arr6));






        //[6,10,-4,15]
         //Sorting -> [-4,6,10,15]


         int temp5;
         for (int i=0;i<arr6.length;i++){ //round 
            for (int j=0; j<arr6.length-i-1;j++){ //moving 
                if (arr6[j+1]<arr6[j]){
                    temp5=arr6[j+1];
                    arr6[j+1]=arr6[j];
                    arr6[j]=temp5;
                }  
            }
         }
         System.out.println("Level3 " + Arrays.toString(arr6));

         // Swap char value
         String s = "hello"; // swap e and o -> holle

         //char[] charArr = new char[s.length()];

/*           for (int i=0; i<s.length();i++){
            charArr[i]=s.charAt(i);
         }  */

         //System.out.println(charArr);

         //Alrernative (String -> char[])
         char[] charArr= s.toCharArray(); // ['h','e','l','l','o']

         char swapTemp;
         swapTemp=charArr[4];
         charArr[4]=charArr[1];
         charArr[1]=swapTemp;
         s = String.valueOf(charArr); // assign a new String value to variable s
         System.out.println(s);











        }       
}
