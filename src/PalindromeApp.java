import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {



        String input5 = "Refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input5.toLowerCase().toCharArray()) {
            deque.add(c);
        }

        boolean dequeCheck = true;
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                dequeCheck = false;
                break;
            }
        }

        System.out.println("Deque Method: " +
                (dequeCheck ? "Palindrome\n" : "Not Palindrome\n"));











    }



}