import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {






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










    }



}