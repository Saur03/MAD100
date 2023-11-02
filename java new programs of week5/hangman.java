package Week8;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
public class lab17 {
 public static void main(String[] args) {
 // A string containing words separated by a delimiter
 String wordsString = "write that example hangman program java";
 // Initialize random number generator and scanner
 Random random = new Random();
 Scanner scanner = new Scanner(System.in);
 // Tokenize the string of words
 StringTokenizer tokenizer = new StringTokenizer(wordsString);
 int wordCount = tokenizer.countTokens();
 String[] words = new String[wordCount];
 for (int i = 0; i < wordCount; i++) {
 words[i] = tokenizer.nextToken();
 }
 String playAgain = "y";
 while (playAgain.equals("y")) {
 // Select a random word from the words array
 String wordToGuess = words[random.nextInt(words.length)];
 // Initialize wordProgress with asterisks to represent hidden letters
 char[] wordProgress = new char[wordToGuess.length()];
 for (int i = 0; i < wordProgress.length; i++) {
 wordProgress[i] = '*';
 }
 int misses = 0;
 boolean wordGuessed = false;
 // Main game loop
 while (!wordGuessed && misses < 6) {
 System.out.println("Word: " + new String(wordProgress));
 System.out.print("Guess a letter: ");
 char guess = scanner.next().charAt(0);
 boolean correctGuess = false;
 // Check if the guessed letter is in the word
 for (int i = 0; i < wordToGuess.length(); i++) {
 if (wordToGuess.charAt(i) == guess && wordProgress[i] == '*') {
 wordProgress[i] = guess;
 correctGuess = true;
 }
 }
 if (!correctGuess) {
 System.out.println(guess + " is not in the word.");
 misses++;
 }
 // Check if the word has been fully guessed
 if (new String(wordProgress).equals(wordToGuess)) {
 wordGuessed = true;
 }
 }
 // End of the game
 if (wordGuessed) {
 System.out.println("Congratulations! The word is: " + wordToGuess);
 }
 else {
 System.out.println("Sorry, you ran out of tries. The word was: " + wordToGuess);
 }
 // Ask if the player wants to play again
 System.out.print("Do you want to play again? (y/n): ");
 playAgain = scanner.next().toLowerCase();
 }
 System.out.println("Thanks for playing!");
 }
}