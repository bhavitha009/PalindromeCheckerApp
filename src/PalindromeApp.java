import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {


        //UC3
        String input1 = "Ardra";
        String reverse = new StringBuilder(input1).reverse().toString();
        System.out.println("String Reverse Method: " +
                (input1.equalsIgnoreCase(reverse) ? "Palindrome\n" : "Not Palindrome\n"));




    }



}