// version 1.0
// author Abc
// useCase 10: Case-Insensitive & Space-Ignored Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama"; // sample string

        // normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // check palindrome using previous loop logic
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // print result
        if (isPalindrome) {
            System.out.println("The string '" + word + "' is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string '" + word + "' is NOT a Palindrome (ignoring spaces and case).");
        }

    }

}