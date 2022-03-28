// libraries used
import java.util.Random;

// class with various methods to generate random character in a specified range
public class RandomCharacter {
    // constant variable
    static final int NUMOFCHARS = 15;

    // static method to generate random lower case letter between a - z
    public static char getRandomLowerCaseLetter(){
        Random random = new Random();
        
        // generate a random lowercase letter in char type with reference to ASCII table between a to z
        char randomizedLowerCaseAlphabet = (char) (random.nextInt(26) + 'a');
        
        // return the lowercase letter generated
        return randomizedLowerCaseAlphabet;
    }

    // static method to generate random lower case letter between A - Z
    public static char getRandomUpperCaseLetter(){
        Random random = new Random();

        // generate a random uppcasecase letter in char type with reference to ASCII table between A to Z
        char randomizedUpperCaseAlphabet = (char) (random.nextInt(26) + 'A');
        
        // return the uppercase letter generated
        return randomizedUpperCaseAlphabet;
    }
    
     // static method to generate random digit between 0 - 9
    public static char getRandomDigitCharacter(){
        Random random = new Random();

        // generate a random digit in char type with reference to ASCII table between 0 to 9
        char randomizedDigitCharacter = (char) (random.nextInt(10) + '0');
        
        // return the digit generated
        return randomizedDigitCharacter;
    }

    // static method to generate random character in ASCII between 33 to 127
    public static char getRandomCharacter(){
        Random random = new Random();

        // generate a random digit in char type with reference to ASCII table between 33 to 127
        char randomizedCharacter = (char) (random.nextInt(94) + '!');
        
        // return the character generated
        return randomizedCharacter;
    }

    // static method to generate a string of characters from the above methods 
    // @param: int numberOfChars - number of characters to be generated into the string
    // @param: int option - specify the category of characters
    public static String generateStringFromRandChar(int numOfChars, int option){
        // StringBuilder used to concatenate characters by appending
        StringBuilder sb = new StringBuilder("");
        
        switch (option) {
            case 1:
                for (int i = 0; i < numOfChars; i++){
                    sb = sb.append(getRandomLowerCaseLetter());
                }
                break;
            case 2:
                for (int i = 0; i < numOfChars; i++){
                    sb = sb.append(getRandomUpperCaseLetter());
                }
                break;
            case 3:
                for (int i = 0; i < numOfChars; i++){
                    sb = sb.append(getRandomDigitCharacter());
                }
                break;
            case 4:
                for (int i = 0; i < numOfChars; i++){
                    sb = sb.append(getRandomCharacter());
                }
                break;
        }
        // convert StringBuilder to string
        return sb.toString();
    }

}
