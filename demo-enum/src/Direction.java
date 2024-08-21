public enum Direction {
  NORTH(2),
  SOUTH(-2),
  EAST(1),
  WEST(-1);

  private int Value;

  private Direction(int Value){
    this.Value=Value;
  }

  public int getValue(){
    return this.Value;
  }

  //Advantage: Able to present some relationship among the enum objects
  public boolean isOpposite(Direction direction){
    return this.getValue()==((-1)*direction.getValue());
  }


  public static boolean isOpposite(Direction d1, Direction d2){
    return d1.getValue()==-1*d2.getValue();
  }

  public Direction opposite(){
    for (Direction direction: Direction.values()){
      if (direction.getValue()==this.getValue()*-1){
        return direction;
      }
    }return null;
  }

  public static Direction opposite(Direction direction){
    for (Direction d: Direction.values()){
      if (d.getValue()==direction.getValue()*-1){
        return d;
      }
    }return null;
  }

  public static void main(String[] args){
    //Direction -> class enum
    //Direction.EAST -> object
    System.out.println(Direction.WEST.isOpposite(EAST)); //true
    System.out.println(Direction.WEST.isOpposite(NORTH)); //false
    System.out.println(Direction.SOUTH.opposite()); //NORTH

    // static method
    System.out.println(Direction.isOpposite(Direction.EAST,Direction.WEST)); //true
    System.out.println(Direction.isOpposite(Direction.NORTH,Direction.WEST)); //false
    System.out.println(Direction.opposite(Direction.NORTH)); //SOUTH
  }
}
