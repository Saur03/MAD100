import java.util.Scanner;
import java.util.StringTokenizer;

public class CaesarCipher {

    /**
     * This method will use the Caesar Cipher to encrypt a message
     * @param message is a message you want to encrypt
     * @param key is the number of letters to shift down the alphabet (1-25)
     * @return ciphertext (the encrypted message)
     */
    public static String encrypt(String message, int key){
        //Message = "ABLE WAS I ERE I SAW ELBA"
        //key = 5
        //Convert the message to all lowercase letters
        message = message.toLowerCase();
        //"ABLE WAS I ERE I SAW ELBA" ->
        //"able was i ere i saw elba"
        //plan -> "able was i ere i saw elba" -> "able" "was" "i" "ere" "i" "saw" "elba"
        //plan -> take each word one at a time and convert it into a cipherword "able" -> "fgqj"
        //plan -> "" + cipherWord -> Create a cipherText variable and add each cipherWord to it
        //plan -> "" + "fgqj" -> "fgqj "
        String token = ""; //Each word in the message
        String cipherWord = ""; //Each word encrypted
        String cipherText =""; //The encrypted message
        //Break the message down into words
        StringTokenizer tokenizer = new StringTokenizer(message, " ");
        while(tokenizer.hasMoreTokens()){ //while the tokenizer has more words
            token = tokenizer.nextToken(); //Grab the next word "able" "was" "i" "ere" "i" "saw" "elba"
            //Encrypt the word "able" -> "fgqj"
            //zoo -> "ett"
            for(int i = 0; i < token.length(); i++){ //look at each character in the token "able"
                //token.charAt(i); //a, b, l, e
                if((token.charAt(i) + key) > 122){ //did go past the letter "z"
                    cipherWord += (char) (token.charAt(i) + key - 26);
                }
                else {
                    cipherWord +=  (char) (token.charAt(i) + key); //a + 5 - > f, b + 5 -> g
                }

                //""+f -> "f" + g -> "fg" + q -> "fgq" + j -> "fgqj"
            }
            cipherText += cipherWord + " ";
            cipherWord = ""; //reset cipherWord to convert the next word
            //"" -> "fgqj " ->
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int key){
        //FGQJ BFX N JWJ N XFB JQGF
        cipherText= cipherText.toLowerCase();
        String token = "";
        String word = "";
        String message ="";
        StringTokenizer tokenizer = new StringTokenizer(cipherText, " ");
        while(tokenizer.hasMoreTokens()){
            token = tokenizer.nextToken();
            for(int i = 0; i < token.length(); i++){
                if((token.charAt(i) - key) < 97){
                    word += (char) (token.charAt(i) - key + 26);
                }
                else {
                    word += (char) (token.charAt(i) - key);
                }
            }
            message += word + " ";
            word = "";
        }
        return message;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //The software should ask the user if they want to encrypt or decypt a message
        System.out.println("Welcome to the encryption software\n" +
                "Would you like to encrypt (1) or decrypt(2) a message (Enter 1 or 2):");
        int choice = input.nextInt();
        input.nextLine(); //Clear the enter key
        //The software should prompt for the user to enter the message
        System.out.println("Please enter a message:");
        String message = input.nextLine();
        //The software should ask the user to enter a key
        System.out.println("Please enter a key (1-25)");
        int key = input.nextInt();
        input.nextLine();//Clear the enter key
        //The software should either encrypt or decrypt the message using the key
        switch (choice){
            case 1:
                System.out.println(encrypt(message, key));
            break;
            case 2:
                System.out.println(decrypt(message, key));
            break;
        }
        //TODO encrypt or decrypt the user input
        input.close();
    }


}
