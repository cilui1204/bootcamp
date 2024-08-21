public class LongDescendingOrder implement Comparator<Long>{

  @Override
  public int compare(Long l1, Long l2){
    //reutn l2.compareTo(l1)
    return l2>l1 ? -1:1; //">" convert Long to long
  }
  
}
