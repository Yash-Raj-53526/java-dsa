package Recursion;

public class Main {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long powOf2(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * powOf2(n - 1);
    }

    public static long Fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long ans = (Fibo(n - 1) + Fibo(n - 2));
        return ans;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        System.out.println("Power of 2 is: " + powOf2(n));
        System.out.println("Fibonacci of " + n + " is: " + Fibo(n));

    }
}
