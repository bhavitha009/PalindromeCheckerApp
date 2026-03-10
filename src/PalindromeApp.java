import java.util.*;

public class UseCase13PalindromeCheckerApp {


    public static boolean reverseMethod(String input) {
        String normalized = input.toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }


    public static boolean stackMethod(String input) {
        String normalized = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }


    public static boolean dequeMethod(String input) {
        String normalized = input.toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Performance Comparison ---");


        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;


        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;


        System.out.println("Reverse Method Result: " + result1 +
                " | Time: " + time1 + " ns");

        System.out.println("Stack Method Result:   " + result2 +
                " | Time: " + time2 + " ns");

        System.out.println("Deque Method Result:   " + result3 +
                " | Time: " + time3 + " ns");

        scanner.close();
    }
}
