package sorting;

import java.util.Comparator;

public class BallSortByString implements Comparator<Ball>{
  
  @Override
  public int compare(Ball b1, Ball b2){
    if (Integer.valueOf(String.valueOf(b1.getColor()).charAt(0))>
    Integer.valueOf(String.valueOf(b1.getColor()).charAt(0))){
      return 1;
    }
    return -1;
  }

  
}
