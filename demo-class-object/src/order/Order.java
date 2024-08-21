package order;

import java.math.BigDecimal;

public class Order {

  private static int count;
  private int id;
  private Item[] items; // Object
  private String coupon;



  public Order(){
    this.id= ++ count;
    this.items = new Item[0];
  }


  public int getID(){
    return this.id;
  }


  public Item[] getItems(){
    return this.items;
  }

  public String getCoupon(){
    return this.coupon;
  }

  public double getDiscount(){
    if (isCouponValid())
      return 0.2d;
    return 0.8d;
    } 

  public boolean isCouponValid(){
    return true;
  }


  public void addItem(Item item){
    Item[] itemList = new Item[this.items.length+1];
    for (int i =0; i<this.items.length;i++){
      items[i] = this.items[i];
    }
    itemList[itemList.length-1] = item;
    this.items = itemList;
  }

  public double total(){
    BigDecimal amount = BigDecimal.valueOf(0L);
    //add, subtract, multiple, divide methods return new Object
    for (int i=0; i< this.items.length; i++){
      amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal())); // return BigDecimal
    }
    amount = amount.multiply(BigDecimal.valueOf(1.0-getDiscount()));
    return amount.doubleValue(); //convert from BigDecimal Object to dobule primitive value
  }

  


  public static void main(String[] args){
    Order order = new Order();
    Item item= new Item(96.0d,2);
    System.out.println(item.subtotal());
    order.addItem(item); //..
    System.out.println(order.total());


    //order.addItem(item); //..
    //System.out.println(order.total());

  }

  
}
