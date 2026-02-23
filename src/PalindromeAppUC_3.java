

 class PalindromeApp3 {


    public static void main(String[] args) {


        String original="Tenet";


        String reversed="";


        for (int i=original.length()-1;i>=0;i--){
            reversed=reversed+original.charAt(i);
        }


        if (original.equals(reversed)) {

            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : Palindrome");
        } else {

            System.out.println("Original String : " + original);

            System.out.println("Reversed String : " + reversed);

            System.out.println("Result : Not a Palindrome");
        }
    }
}
