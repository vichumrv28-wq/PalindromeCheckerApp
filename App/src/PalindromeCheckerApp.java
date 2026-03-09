// version 1.0
// author Abc
// useCase 7: Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar"; // sample string

        Deque<Character> deque = new ArrayDeque<>();

        // insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // compare first and last characters
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // print result
        if (isPalindrome) {
            System.out.println("The string '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + word + "' is NOT a Palindrome.");
        }

    }

}