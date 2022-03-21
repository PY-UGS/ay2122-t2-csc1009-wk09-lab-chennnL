import java.util.Random;

public class RandomCharacter {
    static final int NUMOFCHARS = 15;

    public static char getRandomLowerCaseLetter(){
        Random random = new Random();

        char randomizedLowerCaseAlphabet = (char) (random.nextInt(26) + 'a');
        return randomizedLowerCaseAlphabet;
    }

    public static char getRandomUpperCaseLetter(){
        Random random = new Random();

        char randomizedUpperCaseAlphabet = (char) (random.nextInt(26) + 'A');
        return randomizedUpperCaseAlphabet;
    }

    public static char getRandomDigitCharacter(){
        Random random = new Random();

        char randomizedDigitCharacter = (char) (random.nextInt(10) + '0');
        return randomizedDigitCharacter;
    }

    public static char getRandomCharacter(){
        Random random = new Random();

        char randomizedCharacter = (char) (random.nextInt(94) + '!');
        return randomizedCharacter;
    }

    public static String generateStringFromRandChar(int numOfChars, int option){
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

        return sb.toString();
    }

}
