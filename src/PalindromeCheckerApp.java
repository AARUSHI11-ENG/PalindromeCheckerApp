
/*
Use Case 7 :"Deque-Based Optimized Palindrome Checker"
Author : Aarushi Jhawar
Date : 26/02/26
Reg no : RA2411026010258
Deque<Character> deque = new ArrayDeque<>();
                for (int i = 0; i < word.length(); i++) {
                    deque.addLast(word.charAt(i));
                }

                boolean isPalindrome = true;
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

         String word = "refer";
                Deque<Character> deque = new ArrayDeque<>();
                for (int i = 0; i < word.length(); i++) {
                    deque.addLast(word.charAt(i));
                }

                boolean isPalindrome = true;
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Input word: " + word);
                if (isPalindrome) {
                    System.out.println("Result: The given string is a Palindrome.");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome.");
                }
            }
        }
