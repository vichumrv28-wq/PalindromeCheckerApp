// version 1.0
// author Abc
// useCase 11: Object-Oriented Palindrome Service

import java.util.Stack;

class PalindromeChecker {

    // method to check palindrome using stack
    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        // push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // pop and compare
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level"; // sample string

        // create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        // print result
        if (result) {
            System.out.println("The string '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + word + "' is NOT a Palindrome.");
        }

    }

}
