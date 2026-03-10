import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {


        String input2 = "AlulA";
        char[] arr = input2.toCharArray();
        boolean isPalindrome = true;

        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Character Array Method: " +
                (isPalindrome ? "Palindrome\n" : "Not Palindrome\n"));



    }



}