
/*
Use Case 8 :"Linked List Based Palindrome Checker"
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

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        String word = "level";

        Node head = new Node(word.charAt(0));
        Node temp = head;

        for (int i = 1; i < word.length(); i++) {
            temp.next = new Node(word.charAt(i));
            temp = temp.next;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);

        Node firstHalf = head;
        Node tempSecond = secondHalf;

        boolean isPalindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        if (isPalindrome) {
            System.out.println("Result: The  given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
    }
}