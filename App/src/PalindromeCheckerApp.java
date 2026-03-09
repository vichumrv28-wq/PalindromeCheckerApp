// version 1.0
// author Abc
// useCase 3: Palindrome Check Using String Reverse

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "level";   // sample string
        String reversed = "";

        // reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a Palindrome.");
        }

    }

}