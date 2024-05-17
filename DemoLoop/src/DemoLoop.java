public class DemoLoop {
    public static void main(String[] args) {
        // For loop
        
        // initialization (variable declaration & assignment); continue criteria; increment opeation 
        //Step1 : "int i = 0"
        //Step2 : Check of i<4 ? Yes
        //Step3 : print hello
        //Step4 : i++ -> i become 1
        //Step5 Check if i<4 ? Yes
        //Step6 print hello
        //Step7 :

        for (int i=0 ; i<4 ; i++){
            System.out.println("hello");
        }

        int y = 3;
        for (int x=0 ; x<3 ; x++){
            y *= 3;
        }
        System.out.println("y= " + y); //y=81


        // 2 
        // 4
        // 6
        int m = 0;
        for (int i=0 ; i<3 ; i++){
            m +=2;
            System.out.println(m);
        }


        for (int i=0 ; i<7 ; i++){
            if (i%2==0 && i != 0){
                System.out.println(i);
            }
            
        }

        // 1 + 2 + 3 + 4 + 5....10
        int sum = 0;
        for (int i=1; i<11; i++){
            sum += i;
        }
        System.out.println(sum);

        // 2 + 4 + 6 + 8
        int sum2 = 0 ;
        for (int i =0 ; i<9; i++){
            if (i%2==0 && i!=0){
                sum2 +=i;
            }
        }
        System.out.println("sum2= "+ sum2); //20

        //8
        //6
        //4
        //2
        for (int i=9; i>0;i--){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //break
        for (int i=0; i<10; i++){
            if (i>7){
                break; //exit loop
            }
            System.out.println(i); //main logic
        }
        //0
        //1
        //2
        //...
        //7

        //continue
        int total = 0;
        for (int i=0; i<5 ; i++){
            if (i>3){
                continue; // when i=4, skip "total +=1", goes to "i++"
            }
            total +=i;
        }
        System.out.println("total= " + total);
    }

}
