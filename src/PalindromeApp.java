import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {





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