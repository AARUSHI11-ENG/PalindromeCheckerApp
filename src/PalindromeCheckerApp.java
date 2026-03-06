
/*
Use Case 13 :"Strategy Pattern for Palindrome Algorithms"
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

public class PalindromeCheckerApp{

    public static boolean simplePalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackPalindrome(String word) {
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

    public static boolean dequePalindrome(String word) {
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

    public static void main(String[] args) {

        String word = "level";

        long start1 = System.nanoTime();
        boolean result1 = simplePalindrome(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(word);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = dequePalindrome(word);
        long end3 = System.nanoTime();

        System.out.println("Input Word: " + word);
        System.out.println();

        System.out.println("Simple Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println();

        System.out.println("Deque Method Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}