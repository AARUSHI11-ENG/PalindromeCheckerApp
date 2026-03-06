
/*
Use Case 11 :" Object-Oriented Palindrome Service"
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

    class PalindromeChecker {

        public boolean checkPalindrome(String word) {

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
    }

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "racecar";

            PalindromeChecker checker = new PalindromeChecker();

            boolean result = checker.checkPalindrome(word);
            System.out.println("Input:" +word);

            if (result) {
                System.out.println("Result: The given string is a Palindrome.");
            } else {
                System.out.println("Result: The given string is NOT a Palindrome.");
            }
        }
    }