public class DemoThreadCreation {
    public static void main(String[] args) {

        // Single Thread
        Integer x = 1;
        x++; //2
        x++; //3

        Task task1 = new Task();
        Thread thread1 = new Thread(task1); // main thread, thread1
        thread1.start(); // run()


         // by default. main thread would proceed without waiting for thread1 
         // but you can use join(). then both main thread and thread 1 will wait each other
        try{
            thread1.join(); // throw checked exception
        }catch(InterruptedException e){

        }

        System.out.println("Program ends...");

        //
        Thread thread2 = new AddStringMillionTimeTask();
        thread2.start(); //run()

        try{
            thread2.join();
        }catch(InterruptedException e){

        }
        AddStringMillionTimeTask thread3 = (AddStringMillionTimeTask) thread2;
        System.out.println(thread3.getStrings().size()); //1000000




    }

}
