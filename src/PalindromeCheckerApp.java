
/*
Use Case 10 :"Case-Insensitive & Space-Ignored Palindrome"
Author : Aarushi Jhawar
Date : 05/03/26
Reg no : RA2411026010258
 int start = 0;
            int end = word.length() - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    isPalindrome = false;
                    break;
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

public class PalindromeCheckerApp {
        public static void main(String[] args) {

            String input = "A man a plan a canal panama";

            String word = input.replaceAll("\\s+", "").toLowerCase();

            int start = 0;
            int end = word.length() - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            System.out.println("Input: "+ word);

            if (isPalindrome) {
                System.out.println("Result: The given string is a Palindrome.");
            } else {
                System.out.println("Result: The given string is NOT a Palindrome.");
            }
        }
    }