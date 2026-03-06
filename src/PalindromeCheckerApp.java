
/*
Use Case 9 :"Recursive Palindrome Checker"
Author : Aarushi Jhawar
Date : 05/03/26
Reg no : RA2411026010258
 if (start >= end) {
            return true;
        }

        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return isPalindrome(word, start + 1, end - 1);
    }
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    static boolean isPalindrome(String word, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);
        System.out.println("Input :"+word);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
    }
}