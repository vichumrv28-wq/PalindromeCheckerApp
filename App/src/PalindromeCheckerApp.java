// version 1.0
// author Abc
// useCase 12: Strategy Pattern for Palindrome Algorithms

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class to use strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    // inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String word) {
        return strategy.checkPalindrome(word);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar"; // sample string

        PalindromeContext context = new PalindromeContext();

        // dynamically choose Stack strategy
        context.setStrategy(new StackStrategy());
        boolean resultStack = context.executeStrategy(word);
        System.out.println("Using StackStrategy: " + (resultStack ? "Palindrome" : "Not Palindrome"));

        // dynamically choose Deque strategy
        context.setStrategy(new DequeStrategy());
        boolean resultDeque = context.executeStrategy(word);
        System.out.println("Using DequeStrategy: " + (resultDeque ? "Palindrome" : "Not Palindrome"));

    }

}
