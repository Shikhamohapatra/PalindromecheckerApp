package palindrome;

public class UC4_CharArrayPalindrome {
    public static void main(String[] args) {
        char[] arr = {'r','a','d','a','r'};
        boolean isPalindrome = true;

        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i]){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}