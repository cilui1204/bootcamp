package deck;

public enum Suit {
  DIAMOND(1), //
  CLUB(2), //
  HEART(3), //
  SPADE(4), //
  ;


  // Most of the instance methods should refer to "this"
  // if there is no 'this' keyword in your method, then probably you shoud
  // consider to user "static method"
  public boolean isHigherThan(Suit suit){
    return this.rank>suit.getRank();
  }

  private int rank;

  private Suit(int rank){
    this.rank=rank;
  }

  private int getRank(){
    return this.rank;
  }

  public static void main(String[] args){
    // why do we have isHigherThan() ?
    Suit currentSuit = Suit.CLUB;
    Suit targetSuit = Suit.DIAMOND;

    if (currentSuit.getRank() > Suit.DIAMOND.getRank()){

    }

    if (currentSuit.isHigherThan(targetSuit)){

    }





  }


  
}
