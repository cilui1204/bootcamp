public class DemoSwitchExpression {

  public static enum Color {
    RED, BLACK, YELLOW,;
  }

  public static void main(String[] args) {
    Color color = Color.RED;
    switch (color) {
      case RED:
        System.out.println("RED");
        break;
      case BLACK:
        System.out.println("BLACK");
        break;
      case YELLOW:
        System.out.println("YELLOW");
        break;

    }

    // Switch Expression
    // 1. return something
    // 2. check if all possible enum value is handled
    // 3. No break, because ot os for return value

    String result = switch (color) {
      case RED -> "RED";
      case BLACK, YELLOW -> "BLACK or YELLOW";
    };

    System.out.println(result);

    String result2 = switch (color) {
      // for ;ambda, more than 1 line of implementation, you should use "yield",
      // similar to "return"
      case RED -> {
        int x = 3;
        if (x >= 3) {
          yield "RED";
        } else {
          yield "RED!!!!";
        }
      }
      case BLACK, YELLOW -> "BLACK or YELLOW";
    };



  }


}
