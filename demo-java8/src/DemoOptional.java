import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {

  public static void main(String[] args) {
    String s = "hello";
    s = null;
    generate(s); // OK

    // method user
    // generate(s).charAt(0); // error

    // alternative
    // generate2() -> return Optional<String> -> the return value can be null or not null
    // the java will force to handle potential null scenerio during compile-time.
    Optional<String> result = generate2(s);
    char target = ' ';

    if (result.isPresent()) { // not null
      result.get().charAt(0);
    } else { // null
      target = '_';
    }

    // generate2(s).get();


    // Ways to create Optional Object
    System.out.println(Optional.of("Hello")); // OK, Optional[Hello]
    // Optional.of(null); // NOT OK
    Optional<String> s2 = Optional.ofNullable(null); // OK
    s2 = Optional.ofNullable("abc"); // ok
    Optional<String> optString = Optional.empty(); // same as Optional.ofNullable(null);


    // ifPresent() -> Lambda Expression
    // s is String already, but not Optional<String>
    target = ' ';
    int x = 0;
    generate2("abc").ifPresent(string -> {
      string.charAt(0); // OK
      // target = string.charAt(0); // NOT OK for write
      // System.out.println(target); // OK for Read
      System.out.println(x); // OK for Read

    });
    System.out.println("target=" + target);

    // Stream -> findFirst(), findAny()
    List<Customer> customers = Arrays.asList(new Customer("John", 13),
        new Customer("Jenny", 30), new Customer("Peter", 20));


    Optional<Customer> optCustomer = customers.stream()//
        .filter(customer -> customer.getAge() > 20).findFirst();

    optCustomer.ifPresent(c -> System.out.println(c.toString()));



    customers.stream()//
        .filter(customer -> customer.getAge() > 20).findFirst()
        .ifPresent(c -> System.out.println(c.toString()));

    // You should not findFirst() and then get() directly
    // customers.stream()//
    //     .filter(customer -> customer.getAge() > 50)
    //     .findFirst() // Optional.ofNullable(null)
    //     .get(); //java.util.NoSuchElementException


    // Ways to take out the element from optional object
    // 1. isPresent()
    // 2. ifPresent()
    // 3. orElse()
    Optional<Customer> optCustomer2 = Optional.of(new Customer("Mary",12));
    Customer customer = optCustomer2.orElse(new Customer("Susan",29));
    System.out.println(customer); //Customer(Name= Mary, age= 12)

    // 4. orElseThrow()
    Customer customer2 = optCustomer2.orElseThrow(()-> new RuntimeException());

    // 5. orElseGet()
    Customer customer3 = optCustomer2.orElseGet(()-> new Customer("dummy",-99));

    //
    Optional<String> optCustomer4 = null;
    optCustomer4.orElse("hello");

    Optional<String> optCustomer5 = Optional.ofNullable(null);
    optCustomer5.orElse("dummy");



  }

  // method author
  public static String generate(String s) {
    if (s == null)
      return null;
    return s.replace('a', 'b').toUpperCase();
  }

  // 1. Optional<String> !=String
  public static Optional<String> generate2(String s) {
    if (s == null)
      return Optional.ofNullable(null);
    return Optional.of(s.replace('a', 'b').toUpperCase());
  }

}
