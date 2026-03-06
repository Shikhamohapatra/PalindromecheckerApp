package palindrome;

class PalindromeService {

    boolean check(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

public class UC11_OOPPalindrome {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String str = "level";

        if(service.check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}