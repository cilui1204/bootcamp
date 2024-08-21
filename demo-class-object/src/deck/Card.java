package deck;

public class Card {

  // private String suit;
  // private String rank;

  private Suit suit;
  private Rank rank;

  //public Card(String suit, String rank) {
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  //public String getSuit() 
  public Suit getSuit() {
    return this.suit;
  }

  //public String getRank()
  public Rank getRank() {
    return this.rank;
  }



  // Coding Style: Early return
  public boolean isHigherThan(Card card){ // when the method is defined small enough 
    // Compare rank first, if they are equal, then compare suit.

    if (this.getRank().isHigherThan(card.getRank()))
      return true; // exit method
    
    if ((this.rank==card.getRank()) && this.suit.isHigherThan(card.getSuit()))
      return true;
    
    return false; //base condition (most likely fall into)

    }



  //   return this.getRank().isHigherThan(card.getRank()) || //
  //   (this.getRank()==card.getRank()) && this.getSuit().isHigherThan(card.getSuit()); 
  // }


  @Override
  public String toString() {
    return "Card(" //
        + "suit=" + this.suit //
        + ", rank=" + this.rank //
        + ")";
  }

  public static void main(String[] args){
    System.out.println(new Card(Suit.CLUB,Rank.NINE).// false
    isHigherThan(new Card(Suit.DIAMOND,Rank.JACK)));

    System.out.println(new Card(Suit.CLUB,Rank.JACK).// true
    isHigherThan(new Card(Suit.DIAMOND,Rank.JACK)));

    System.out.println(new Card(Suit.CLUB,Rank.ACE).// false
    isHigherThan(new Card(Suit.DIAMOND,Rank.JACK)));
  }

  

}