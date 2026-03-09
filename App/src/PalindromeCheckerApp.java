// version 1.0
// author Abc
// useCase 4: Character Array Based Palindrome Check

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar"; // sample string

        // convert string to character array
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // two-pointer approach
        while (start < end) {

            // compare characters
            if (chars[start] != chars[end]) {
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