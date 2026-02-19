import java.util.Scanner;

public class UC3Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}
