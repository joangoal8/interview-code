import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;
    private String sentence;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }
    @Test
    void isPalindromeCustom() {
        sentence = "ss";
        assertTrue(palindrome.isPalindrome(sentence));
    }
    @Test
    void isPalindrome() {
        sentence = "soy un palindrome emordnilap nu yos";
        assertTrue(palindrome.isPalindrome(sentence));
    }
    @Test
    void isNotPalindrome() {
        sentence = "soy un palindrowme emordnilap nu yos";
        assertFalse(palindrome.isPalindrome(sentence));
    }
    @Test
    void isPalindromeWhenIsEmpty() {
        sentence = "";
        assertTrue(palindrome.isPalindrome(sentence));
    }
    @Test
    void isPalindromeWhenIsNull() {
        assertTrue(palindrome.isPalindrome(sentence));
    }
}