import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRandomCharacter {
    static final int NUMOFCHARS = 15;
    static final int RANDLOWCHAR = 1;
    static final int RANDUPPCHAR = 2;
    static final int RANDDIGIT = 3;
    static final int RANDCHAR = 4;
    String strLowerCase;
    String strUpperCase;
    String strDigit;
    String strRandChar;
    char c;
    int x;
    boolean isPrime;

    @BeforeEach
    void setUp(){
        strLowerCase = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDLOWCHAR);
        strUpperCase = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDUPPCHAR);
        strDigit = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDDIGIT);
        strRandChar = RandomCharacter.generateStringFromRandChar(NUMOFCHARS, RANDCHAR);
    }

//    @RepeatedTest(10)
//    public void testStrLen(){
//        assertNotNull(strLowerCase);
//        assertNotNull(strUpperCase);
//        assertNotNull(strDigit);
//        assertNotNull(strRandChar);
//        assertEquals(15, strLowerCase.length());
//        assertEquals(15, strUpperCase.length());
//        assertEquals(15, strDigit.length());
//        assertEquals(15, strRandChar.length());
//    }
//
//    @RepeatedTest(10)
//    public void testLowerCase() {
//        for (x = 0; x < strLowerCase.length() - 1; x++){
//            c = strLowerCase.charAt(x);
//            assertTrue(Character.isLowerCase(c));
//            assertFalse(Character.isUpperCase(c));
//        }
//        assertNotEquals(strLowerCase,strLowerCase.toUpperCase());
//        }
//
//    @RepeatedTest(10)
//    public void testUpperCase(){
//        for (x = 0; x < strUpperCase.length() - 1; x++){
//            c = strUpperCase.charAt(x);
//            assertTrue(Character.isUpperCase(c));
//            assertFalse(Character.isLowerCase(c));
//        }
//        assertNotEquals(strUpperCase,strUpperCase.toLowerCase());
//    }
//
//    @RepeatedTest(10)
//    public void testDigit() {
//        for (x = 0; x < strDigit.length() - 1; x++) {
//            c = strDigit.charAt(x);
//            assertTrue(Character.isDigit(c));
//            assertFalse(Character.isLetter(c));
//        }
//    }
//
//    @RepeatedTest(10)
//    public void testRandChar(){
//        for (x = 0; x < strDigit.length() - 1; x++) {
//            c = strDigit.charAt(x);
//            assertTrue(c < 128);
//            assertFalse(c >= 128);
//        }
//    }

    @Test
    public void testPrime() {
        for (x = 0; x < strDigit.length() - 1; x++) {
            c = strDigit.charAt(x);
            if (c <= 1) {
                isPrime = false;
                System.out.println(c + "is not prime");
            } else {
                isPrime = true;
                // every prime is only divisible by 1 and itself
                // if the number is divisible by any other number
                // it will not be prime
                for (int i = 2; i <= c / 2; i++) {
                    if ((c % i) == 0) {
                        System.out.println(c + " is divisible by " + i);
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


