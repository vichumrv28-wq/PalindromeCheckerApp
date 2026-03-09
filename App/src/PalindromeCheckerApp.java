// version 1.0
// author Abc
// useCase 2: Print Hardcoded Palindrome Result

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam"; // hardcoded string
        String reversed = "";

        // reverse the string
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // check palindrome
        if(word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a Palindrome.");
        }

    }

}