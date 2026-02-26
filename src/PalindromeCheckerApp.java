
/*
Use Case 4 :"Character Array Based Palindrome Check"
Author : Aarushi Jhawar
Date : 26/02/26
Reg no : RA2411026010258
       while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "radar";
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input String: " + word);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
    }
}
