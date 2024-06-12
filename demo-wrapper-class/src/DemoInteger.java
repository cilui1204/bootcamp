

public class DemoInteger {
    public static void main(String[] args) {
        int x = 1;
        Integer x2 = 1;
        System.out.println(x);
        System.out.println(x2);

        x = x + 3;
        x -= 10;

        x2 = x2 + 3;
        x2 -= 10;

        //Integer is a wrapper class 
        // class has method 
        short s = (short) x;

        x2 += 60000;
        short s2 = x2.shortValue(); // overflow, similar to explicit conversion
        System.out.println(s2);

        double d2 = x2.doubleValue();
        System.out.println(d2);

        //comparision (>, <, >=, <=, ==, !=, for int value)
        //For Integer (Wrapper class comparision), compareTo()
        Integer x3 = 4; // autobox
        Integer x4 = 8;
        Integer x5 = 8;
        boolean result = x4>x3; // true (compare int value rather than Interger)
        boolean result2 = x4.compareTo(x3)>0; // true
        boolean result3 = x4.compareTo(x3)<0; // false
        boolean result4 = x4.compareTo(x5)==0; // true


        System.out.println(x3.compareTo(x4));  //-1
        System.out.println(x4.compareTo(x3));  //1
        System.out.println(x4.compareTo(x5));  //0

        // Byte, Short, Long, Integer,Double, Float
        Float f1 = 10.0f; //10.0f is a float value -> autobox -> Flaot value
        Float f2 = new Float(10.0);  //create Float object, storing a float value 
        long l2 = f2.longValue();


        Double d3= new Double("10.3");
        long l3 = d3.longValue();
        System.out.println(l3);

        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b'); // static method
        System.out.println(c2); //'B'
        System.out.println(Character.toLowerCase('M'));


        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);

        // compareTo() method is used to compare boolean value stored in Boolean object
        System.out.println(b3.compareTo(b4)); //-1
        System.out.println(b4.compareTo(b5)); //0

        System.out.println(b3==b4); //false
        System.out.println(b5==b4); //false ??!! we will cover this topic in week5

        //autobox and unbox
        Integer i7 = 9; // 9 is an int value -> autobox -> Integer Object
        int i8 = i7; // 17 is Integer object -> unbox 0> int value 

        Integer i9 = new Integer(9);
        int i10 = i9.intValue();

        Integer i11 = Integer.valueOf(9); // static method, the result is as same as "new Integer(9)"
        int i12 = Integer.parseInt("10");
        System.out.println(i12); //

       // int i13 = Integer.parseInt("10a"); //java.lang.NumberFormatException //run-time error
       // System.out.println(i13);

       System.out.println(new Byte("20"));
       System.out.println(new Byte((byte) 10));



    }
}
