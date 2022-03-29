import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// class to test random character generated
public class TestRandomCharacter {
    // variables
    static final int NUMOFCHARS = 15;
    static final int RANDLOWCHAR = 1;
    static final int RANDUPPCHAR = 2;
    static final int RANDDIGIT = 3;
    static final int RANDCHAR = 4;
    public String strLowerCase;
    public String strUpperCase;
    public String strDigit;
    public String strRandChar;
    public char c;
    public int x;
    public boolean isPrime;

    // method to execute first before the other methods
    @BeforeEach
    void setUp(){
        // generate 4 strings containing 15 characters with different methods
        strLowerCase = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDLOWCHAR);
        strUpperCase = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDUPPCHAR);
        strDigit = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDDIGIT);
        strRandChar = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDCHAR);
    }

    // test method will be executed 10 times
    @RepeatedTest(10)
    public void testStrLen(){
        // check that the strings generated are not empty
        assertNotNull(strLowerCase);
        assertNotNull(strUpperCase);
        assertNotNull(strDigit);
        assertNotNull(strRandChar);
        // check that the string generated has the same number of characters required
        assertEquals(NUMOFCHARS, strLowerCase.length());
        assertEquals(NUMOFCHARS, strUpperCase.length());
        assertEquals(NUMOFCHARS, strDigit.length());
        assertEquals(NUMOFCHARS, strRandChar.length());
    }

    // test method will be executed 10 times
    @RepeatedTest(10)
    public void testLowerCase() {
        // iterate through every character in the string
        for (x = 0; x < strLowerCase.length() - 1; x++){
            c = strLowerCase.charAt(x);
            // ensure that the characters are all lowercase
            assertTrue(Character.isLowerCase(c));
            assertFalse(Character.isUpperCase(c));
        }
        // ensure that the string with all lowercase characters are not equivalent
        // to the string with all uppercase characters
        assertNotEquals(strLowerCase,strLowerCase.toUpperCase());
        }

    // test method will be executed 10 times
    @RepeatedTest(10)
    public void testUpperCase(){
        // iterate through every character in the string
        for (x = 0; x < strUpperCase.length() - 1; x++){
            c = strUpperCase.charAt(x);
            // ensure that the characters are all uppercase
            assertTrue(Character.isUpperCase(c));
            assertFalse(Character.isLowerCase(c));
        }
        // ensure that the string with all uppercase characters are not equivalent
        // to the string with all lowercase characters
        assertNotEquals(strUpperCase,strUpperCase.toLowerCase());
    }

    // test method will be executed 10 times
    @RepeatedTest(10)
    public void testDigit() {
        // iterate through every character in the string
        for (x = 0; x < strDigit.length() - 1; x++) {
            c = strDigit.charAt(x);
            // ensure that the string contains digit character
            // instead of letter character
            assertTrue(Character.isDigit(c));
            assertFalse(Character.isLetter(c));
        }
    }

    // test method will be executed 10 times
    @RepeatedTest(10)
    public void testRandChar(){
        // iterate through every character in the string
        for (x = 0; x < strDigit.length() - 1; x++) {
            c = strDigit.charAt(x);
            // ensure that the string contains characters up till ASCII 127
            assertTrue(c < 128);
            assertFalse(c >= 128);
        }
    }

    @Test
    public void testPrime() {
        for (x = 0; x < strDigit.length() - 1; x++) {
            c = strDigit.charAt(x);
            // convert the ASCII integer with ASCII number back to numerical integer
            int num = Character.getNumericValue(c);
            // any number less than or equal to 1 will not be prime
            if (num <= 1) {
                isPrime = false;
                System.out.println(num + " is not prime");
            } else {
                isPrime = true;
                // every prime is only divisible by 1 and itself
                // if the number is divisible by any other number
                // it will not be prime
                for (int i = 2; i <= num / 2; ++i) {
                    if ((num % i) == 0) {
                        System.out.println(num + " is divisible by " + i);
                        isPrime = false;
                        break;
                    }
                }
            }
            // true if is prime
            // testcase will pass only if all the characters are prime
            assertTrue(isPrime);
        }
    }
}
