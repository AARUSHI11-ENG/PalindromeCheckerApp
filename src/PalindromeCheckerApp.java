
/*
Use Case 12 :"Strategy Pattern for Palindrome Algorithms"
Author : Aarushi Jhawar
Date : 05/03/26
Reg no : RA2411026010258
 int start = 0;
            int end = word.length() - 1;

            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String word) {
        return strategy.checkPalindrome(word);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        PalindromeStrategy strategy = new StackStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.check(word);
        System.out.println("Input:"+word);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
    }
}