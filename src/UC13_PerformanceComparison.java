package palindrome;

import java.util.Stack;

public class UC13_PerformanceComparison {

    // Method 1: String Reverse
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String test = "racecar";

        // Reverse Method Time
        long start1 = System.nanoTime();
        reverseMethod(test);
        long end1 = System.nanoTime();

        // Two Pointer Method Time
        long start2 = System.nanoTime();
        twoPointerMethod(test);
        long end2 = System.nanoTime();

        // Stack Method Time
        long start3 = System.nanoTime();
        stackMethod(test);
        long end3 = System.nanoTime();

        System.out.println("Performance Comparison (nanoseconds)");

        System.out.println("Reverse Method Time: " + (end1 - start1));
        System.out.println("Two Pointer Method Time: " + (end2 - start2));
        System.out.println("Stack Method Time: " + (end3 - start3));
    }
}