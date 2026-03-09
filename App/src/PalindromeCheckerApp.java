// version 1.0
// author Abc
// useCase 4: Character Array Based Palindrome Check

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";   // sample string
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // display result
        if (isPalindrome) {
            System.out.println("The string '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + word + "' is NOT a Palindrome.");
        }

    }

}