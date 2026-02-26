
/*
Use Case 3 :
Author : Aarushi Jhawar
Date : 26/02/26
Reg no : RA2411026010258
String reverse = "";
for(int i = n; i > 0; i--);
if(word.charAt(i)!=word.charAt(start)){
         isPalindrome = false;
           break;
      }
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = true;
        int n = word.length() - 1;
        int start =0;
        for(int i=n;i>0;i--){
            if(word.charAt(i)!=word.charAt(start)){
                isPalindrome = false;
                break;
            }
            start++;
        }
        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        }
        else{
            System.out.println(word + " is not a Palindrome");
        }
    }
}
