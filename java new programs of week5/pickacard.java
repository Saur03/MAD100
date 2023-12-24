public import java.util.Random;

public class PickACard {

  public static void main(String[] args) {
    // Create a Random object to generate random numbers
    Random rand = new Random();

    // Randomly pick a rank (1 to 13)
    int rank = rand.nextInt(13) + 1;
    String pickedRank = "";

    switch(rank) {
      case 1:
        pickedRank = "Ace";
        break;
      case 2:
        pickedRank = "2";
        break;
      case 3:
        pickedRank = "3";
        break;
      case 4:
        pickedRank = "4";
        break;
      case 5:
        pickedRank = "5";
        break;
      case 6:
        pickedRank = "6";
        break;
      case 7:
        pickedRank = "7";
        break;
      case 8:
        pickedRank = "8";
        break;
      case 9:
        pickedRank = "9";
        break;
      case 10:
        pickedRank = "10";
        break;
      case 11:
        pickedRank = "Jack";
        break;
      case 12:
        pickedRank = "Queen";
        break;
      case 13:
        pickedRank = "King";
        break;
    }

    // Randomly pick a suit (1 to 4)
    int suit = rand.nextInt(4) + 1;
    String pickedSuit = "";

    switch(suit) {
      case 1:
        pickedSuit = "Clubs";
        break;
      case 2:
        pickedSuit = "Diamonds";
        break;
      case 3:
        pickedSuit = "Hearts";
        break;
      case 4:
        pickedSuit = "Spades";
        break;
    }

    // Display the result
    System.out.println("The card you picked is " + pickedRank + " of " + pickedSuit);
  }
} pickacard {
    
}
