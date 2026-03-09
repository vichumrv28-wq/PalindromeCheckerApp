// version 1.0
// author Abc
// useCase 9: Recursive Palindrome Checker

public class PalindromeCheckerApp {

    // recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // base condition
        if (start >= end) {
            return true;
        }

        // compare characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "level"; // sample string

        boolean result = isPalindrome(word, 0, word.length() - 1);

        // print result
        if (result) {
            System.out.println("The string '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + word + "' is NOT a Palindrome.");
        }

    }

}