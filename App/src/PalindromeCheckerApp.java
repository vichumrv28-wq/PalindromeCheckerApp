// version 1.0
// author Abc
// useCase 13: Performance Comparison of Palindrome Algorithms

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Stack-based palindrome checker
    public static boolean stackPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) stack.push(ch);
        for (char ch : word.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }

    // Deque-based palindrome checker
    public static boolean dequePalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : word.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    // String reverse-based palindrome checker
    public static boolean reversePalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) reversed += word.charAt(i);
        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "a".repeat(100000); // large test string

        // Stack method timing
        long startStack = System.nanoTime();
        stackPalindrome(word);
        long endStack = System.nanoTime();
        System.out.println("Stack method time: " + (endStack - startStack) + " ns");

        // Deque method timing
        long startDeque = System.nanoTime();
        dequePalindrome(word);
        long endDeque = System.nanoTime();
        System.out.println("Deque method time: " + (endDeque - startDeque) + " ns");

        // Reverse method timing
        long startReverse = System.nanoTime();
        reversePalindrome(word);
        long endReverse = System.nanoTime();
        System.out.println("String Reverse method time: " + (endReverse - startReverse) + " ns");

    }

}