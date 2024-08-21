public enum OrderStatus {
  ORDERED(0),//
  PAID(1),//
  READY_TO_SHIP(2),//
  DELIVERED(3),//
  ;

  private int value;

  private OrderStatus(int value){
    this.value=value;
  }

  public int GetValue(){
    return this.value;
  }

  public OrderStatus next(){
    for (OrderStatus status: OrderStatus.values()){
      if (this.value +1 == status.GetValue()){
        return status;
      }
    }
    return null;

  }

  


  public static void main(String[] args){
    System.out.println(OrderStatus.PAID.next());
  }

}
