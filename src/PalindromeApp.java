import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {

        //UC1
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version : 1.0\n");


        //UC2
        String hardcoded = "madam";
        System.out.println("Hardcoded Check: " +
                (hardcoded.equals("madam") ? "Palindrome\n" : "Not Palindrome\n"));


        //UC3
        String input1 = "Ardra";
        String reverse = new StringBuilder(input1).reverse().toString();
        System.out.println("String Reverse Method: " +
                (input1.equalsIgnoreCase(reverse) ? "Palindrome\n" : "Not Palindrome\n"));



        //UC4
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




        //UC5
        String input3 = "Level";
        Stack<Character> stack = new Stack<>();

        for (char c : input3.toLowerCase().toCharArray()) {
            stack.push(c);
        }

        boolean stackCheck = true;
        for (char c : input3.toLowerCase().toCharArray()) {
            if (c != stack.pop()) {
                stackCheck = false;
                break;
            }
        }

        System.out.println("Stack Method: " +
                (stackCheck ? "Palindrome\n" : "Not Palindrome\n"));




        //UC6
        String input4 = "Racecar";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : input4.toLowerCase().toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean queueStackCheck = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack2.pop())) {
                queueStackCheck = false;
                break;
            }
        }

        System.out.println("Queue + Stack Method: " +
                (queueStackCheck ? "Palindrome\n" : "Not Palindrome\n"));










    }



}