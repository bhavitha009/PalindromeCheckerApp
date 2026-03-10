import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {

        String input7 = "madam";

        Node head = createLinkedList(input7);

        if (isPalindromeLinkedList(head)) {
            System.out.println("UC8 - Linked List Method: Palindrome\n");
        } else {
            System.out.println("UC8 - Linked List Method: Not a Palindrome\n");
        }












    }
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node createLinkedList(String input) {
        Node head = null, tail = null;

        for (char c : input.toLowerCase().toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
    public static boolean isPalindromeLinkedList(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // Compare
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;

    }



}